package Day16_SeleniumException;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C04_StaleElementReferanceExceptions extends TestBase {

    /*
    StaleElementReferanceExceptions :
        --bir web sayfasında ki bir webElementin geçerliliğinin kaybolduğu durumlarda oluşur.
        Yani bir webElementi Locate ettikten sonra sayfada refresh yada back-forward kullanıyorsak
        yeniden o elemente ulaşmak istedğimizde bu hatayı alırız. Bunu handle edebilmek için
        WebElement'e yeniden locate atamalıyız.
      */

    @Test
    public void StaleElementReferanceExceptionsTest1() {
        //TechProEducation sayfasına gidelim
        driver.get("https://techproeducation.com/");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //sayfaya gittikten sonra sayfayı refresh yapalım
        driver.navigate().refresh(); bekle(2);

        //login butonuna tıklayalım
        WebElement lmsLogin = driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]"));
        lmsLogin.click();
    }

    @Test
    public void StaleElementReferanceExceptionsTest2() {
        //TechProEducation sayfasına gidelim
        driver.get("https://techproeducation.com/");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //login butonuna tıklayalım
        WebElement lmsLogin = driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]"));
        lmsLogin.click();

        //sayfaya gittikten sonra sayfayı refresh yapalım
        driver.navigate().refresh(); bekle(2);

        //login'e tıkla
        lmsLogin.click(); //org.openqa.selenium.StaleElementReferenceException
        //Webelementi locate ettikten sonra sayfayı yeniledik ve sonrasında click yaptık ve org.openqa.selenium.StaleElementReferenceException
        // hatasını aldık çünkü locate ettikten sonra refresh yaptığımız iiçn element eksilmiş oldu .dolayısıyla bu exception'ı handle
        //edebilmek için click yapmadan önce tekrar aynı locate'i webelement'e atamamız gerekir.
    }

    @Test
    public void StaleElementReferanceExceptionsTest3() {
        //TechProEducation sayfasına gidelim
        driver.get("https://techproeducation.com/");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //login butonuna tıklayalım
        WebElement lmsLogin = driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]"));
        lmsLogin.click();

        //sayfaya gittikten sonra sayfayı refresh yapalım
        driver.navigate().refresh(); bekle(2);

        //login'e tıkla
        lmsLogin = driver.findElement(By.xpath("(//a[@class='elementor-item'])[4]"));
        lmsLogin.click();
    }
}
