package Day13_ActionsClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_Actions01 extends TestBase {
    /*
    https://the-internet.herokuapp.com/context_menu  sitesine gidin
    Kutuya sağ tıklayın
    Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
    Tamam diyerek alert’i kapatın
     */

    @Test
    public void test01() {
        //https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
        //    Kutuya sağ tıklayın
        WebElement kutu = driver.findElement(By.xpath("//div[@id='hot-spot']")); //WebElement'e sağ click yapabilmek için Actions class'ından obje oluşturmalıyız.
        Actions actions = new Actions(driver);
        actions.
                contextClick(kutu). //actions obje ile sağ click method'u olan contextClick() methodunu kullanırız.
                perform(); //actions'u sonlandırmak için perform() method'u kullanırız.
        bekle(2);

        //    Alert’te cikan yazinin “You selected a context menu” oldugunu test edin
        String alertText = driver.switchTo().alert().getText();
        Assert.assertTrue(alertText.contains("You selected a context menu"));
        bekle(2);

        //    Tamam diyerek alert’i kapatın
        alertAccept();
        bekle(2);
    }
}
