package Day13_ActionsClass;

import Utilities.TestBase;
import org.checkerframework.checker.units.qual.Acceleration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class C03_Actions03 extends TestBase {

    /*
     https://techproeducation.com adresine gidin
     Sayfanın alt tarafına gidin
     Sayfanın üst tarafına gidin
     */

    @Test
    public void actions() {
        //https://techproeducation.com adresine gidin
        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click(); bekle(2);

        //Sayfanın alt tarafına gidin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).
                sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).perform();
        bekle(2);

        //Sayfanın üst tarafına gidin
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_UP).perform();
        bekle(2);

    }

    @Test
    public void actions2() {
        //https://techproeducation.com adresine gidin
        driver.get("https://techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click(); bekle(2);

        //Sayfanın alt tarafına gidin
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END);
        bekle(2);

        //Sayfanın üst tarafına gidin
        actions.sendKeys(Keys.PAGE_UP).sendKeys(Keys.PAGE_UP).sendKeys(Keys.ARROW_UP).perform();
        bekle(2);
        actions.sendKeys(Keys.HOME).build().perform();
        //build() method'u ile birden fazla oluşturduğumuz action objesini birbirimizw bağlayabiliriz.
    }

    @Test
    public void actions3() {
        driver.get("https://amazon.com");
        //ARAMA KUTUSUNA BÜTÜK HARFLERLE SAMSUNG YAZ
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys(Keys.SHIFT,"s",Keys.SHIFT,"amsung");
        aramaKutusu.submit();

        Actions actions = new Actions(driver);bekle(2);
        actions.sendKeys(Keys.END); bekle(2);
        actions.sendKeys(Keys.HOME).build().perform();bekle(1);
    }
}
