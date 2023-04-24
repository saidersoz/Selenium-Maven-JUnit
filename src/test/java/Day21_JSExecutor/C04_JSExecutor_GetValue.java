package Day21_JSExecutor;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C04_JSExecutor_GetValue extends TestBase {

    @Test
    public void getValueTest() {
        //  1)getValueTest metotu olustur
        //  2)https://www.carettahotel.com/ a git
        driver.get("https://www.carettahotel.com/");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();

        //  3)Tarih kısmındaki Yazili metinleri al ve yazdırınız
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement date = (WebElement) js.executeScript("return document.getElementById('checkin_date')");

        /*
        Eğer bir WebSayfasında web elementler oluşturulurken JS kullaılmışsa normal olarak locate almakta
        zorlanırız. Bu gibi durumlarda yukarıda ki gibi JSExecutor kullanarak web elementi locate edebiliriz.
         */

        date.clear();
        date.sendKeys("5/25/2023");


    }
}
