package Day15_FileUpload_Wait;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C04_ExplicitWait extends TestBase {

    /*
    https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
    Remove tuşuna basın
    "It's gone!" yazısını doğrulayın
     */

    @Test
    public void explicitWaitTest() {
        //https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        bekle(2);

        //Remove tuşuna basın
        driver.findElement(By.xpath("(//button)[1]")).click();

        //"It's gone!" yazısını doğrulayın
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']")));
        Assert.assertTrue(element.isDisplayed());
    }

    @Test
    public void tekrar02() {
        //https://the-internet.herokuapp.com/dynamic_controls sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        //    Remove tuşuna basın
        driver.findElement(By.xpath("(//button)[1]")).click();
        //    "It's gone!" yazısını doğrulayı
        WebElement element = driver.findElement(By.xpath("//p[@id='message']")); //"It's gone!" yazısının elementi
        visibleWait(element,20);
        Assert.assertTrue(element.isDisplayed());
    }
}
