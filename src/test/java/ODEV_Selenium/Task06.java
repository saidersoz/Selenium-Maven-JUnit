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
    public void task06() {
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");
        driver.switchTo().frame("emoojis");
        driver.findElement(By.xpath("(//span[@data-upgraded=',MaterialRipple'])[2]")).click(); bekle(2);
    }
}
