package ODEV_Selenium;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;

public class task05 extends TestBase {

    //-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
    //-Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
    //-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
    //-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
    //-Çıkan alert'te iptal butonuna basınız
    //-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
    //-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
    //-Çıkan mesajı konsola yazdırınız
    //-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız


    @Test
    public void tesk05() {
        //-http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html");

        //-Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
        WebElement clickTheButton1 = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
        clickTheButton1.click(); bekle(2);
        System.out.println("Alert with OK - click the button to display an alert box (TEST PASSED)");

        //-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        System.out.println(driver.switchTo().alert().getText() + " (TEST PASSED)");
        driver.switchTo().alert().accept(); bekle(2);

        //-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
        WebElement AlertwithOkCancel = driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel ']"));
        AlertwithOkCancel.click();
        WebElement clickTheButton2 = driver.findElement(By.xpath("//*[text()='click the button to display a confirm box ']"));
        clickTheButton2.click(); bekle(2);
        System.out.println("Alert with OK & Cancel - click the button to display a confirm box (TEST PASSED)");

        //-Çıkan alert'te iptal butonuna basınız
        driver.switchTo().alert().dismiss(); bekle(1);
        System.out.println("iptal butonuna basıldı (TEST PASSED)");

        //-Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
        WebElement AlertwithTextbox = driver.findElement(By.xpath("//*[text()='Alert with Textbox ']"));
        AlertwithTextbox.click();
        WebElement clickTheButton3 = driver.findElement(By.xpath("//*[text()='click the button to demonstrate the prompt box ']"));
        clickTheButton3.click(); bekle(2);
        System.out.println("Alert with Textbox - click the button to demonstrate the prompt box (TEST PASSED)");

        //-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
        driver.switchTo().alert().sendKeys("said");
        driver.switchTo().alert().accept();bekle(2);
        System.out.println("prompt box'a 'isminizi' yazdırınız ve Tamam (TEST PASSED)");

        //-Çıkan mesajı konsola yazdırınız
        WebElement getText = driver.findElement(By.xpath("//p[@id='demo1']")); bekle(2);
        System.out.println(getText.getText() + " (TEST PASSED)");

        //-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
        if (getText.getText().equals("Hello said How are you today")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }




    }
}
