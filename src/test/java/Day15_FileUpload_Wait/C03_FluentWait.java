package Day15_FileUpload_Wait;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C03_FluentWait extends TestBase {

    /*
    https://the-internet.herokuapp.com/dynamic_loading/1
    Start buttonuna tıklayın
    Hello World! Yazının sitede oldugunu test edin
     */

    @Test
    public void fluentWaitTest() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        bekle(2);

        //Start buttonuna tıklayın
        driver.findElement(By.xpath("//button")).click();
        bekle(2);

        //Hello World! Yazının sitede oldugunu test edin
        //Fluent Wait'in WebDriverWait'ten farkı  'wait' objesinin oluşturulmasında ortaya çıkar
        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(20)). //max bekleme süresi
                pollingEvery(Duration.ofSeconds(3)). //Deneme aralıkları ==> her 3 saniyede bir bulma denemesi yapar
                withMessage("Ignore Exception"). //Mesaj yazdırılabilir(zorunlu değil)
                ignoring(TimeoutException.class); //Exception handle edilebilir(Zorunlu değil)
        WebElement helloWorldText = driver.findElement(By.xpath("(//h4)[2]"));

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4)[2]")));
        Assert.assertTrue(helloWorldText.isDisplayed());
    }
}
