package Day16_SeleniumException;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_NoSuchElementExceptions extends TestBase {

    @Test
    public void NoSuchElementExceptions() {
        /*
        NoSuchElementExceptions;
            -Sayfada bulunmayan bir elemente erişim sağlamaya çalışıldığında karşılaşılır
         */
        //TechProEducation sayfasına gidelim
        driver.get("https://techproeducation.com/");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //SearchBox elementini locate edelim
        driver.findElement(By.xpath("//input[@type='ssearch']")).sendKeys("Java"+Keys.ENTER);
        //org.openqa.selenium.NoSuchElementException: Webelementin locatini değiştirdiğimiz için 21. satırda
        //NoSuchElementException hatası aldık
        //SearchBox'ın locatini yeniden almamız gerekir

    }
}
