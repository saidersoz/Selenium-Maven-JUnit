package ODEV_Selenium;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Task06 extends TestBase {

    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
    // ikinci emojiye tıklayın
    // İkinci emoji öğelerini yazdırınız
    // Parent iframe e geri donun
    // Formu doldurun,(Formu istediğiniz metinlerle doldurun)
    // Apply button a basiniz


    @Test
    public void task06() throws InterruptedException {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.switchTo().frame(1);

        WebElement element = driver.findElement(By.xpath("(//*[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
        element.click(); Thread.sleep(1500);

        WebElement emojiler2 = driver.findElement(By.xpath("//div[@id='nature']"));
        System.out.println(emojiler2.getText()); Thread.sleep(1500);

        driver.switchTo().parentFrame();

        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[1]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[2]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[3]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[4]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[5]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[6]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[7]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[8]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[9]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[10]")).sendKeys("said");
        driver.findElement(By.xpath("(//input[@class='mdl-textfield__input'])[11]")).sendKeys("said");
        Thread.sleep(2500);

        driver.findElement(By.xpath("//button[@class='mdl-button mdl-js-button mdl-button--raised mdl-button--colored']")).click();

        WebElement text = driver.findElement(By.xpath("//div[@class='mdl-textfield mdl-js-textfield mdl-textfield--floating-label is-upgraded']"));
        System.out.println(text.getText());
    }
}
