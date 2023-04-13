package Day16_SeleniumException;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_TimeOutExceptions extends TestBase {

    /*
    TimeOutExceptions:
        -Sayfada aradığımız elementi wait ile belirlediğimiz
               max sürede bulamadaığı durumda timeOutExceptions hatası alırız.
     */

    @Test
    public void TimeOutExceptionsTest1() {
        //TechProEducation sayfasına gidelim
        driver.get("https://techproeducation.com/");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //TimeOutExceptions alacabilmek için visibleofElementLocator methodunu kullanarak yanlış bir locate aldık.
        visibleWait(By.id("yanlis Locate"),15); //org.openqa.selenium.TimeoutException
        //WebElementi beklerke  WebElementin locate'ni bulamadığı için max belirttiğimiz sürekadar bekler ve
        //org.openqa.selenium.TimeoutException hatasını verir.

        /*
        visibleWait(By.xpath("Yanlis Locate"),30);
         */
    }

    @Test
    public void TimeOutExceptionsTest2() {
        //https://the-internet.herokuapp.com/dynamic_loading/1 adrese gidiniz
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //start butonuna tıklayalım
        driver.findElement(By.xpath("//button")).click();
        //Hello World text'nin çıktığını doğrulayınız
        WebElement heloWorldText = driver.findElement(By.xpath("(//h4)[2]"));
        visibleWait(heloWorldText,2);
        //HelloWorld yazısı ortalama 6 saniyede gözüktüğü için explicit waitte max 2 saniye verdiğimizden dolayı
        //org.openqa.selenium.TimeoutException hatası aldık
        Assert.assertTrue(heloWorldText.isDisplayed());
    }
}
