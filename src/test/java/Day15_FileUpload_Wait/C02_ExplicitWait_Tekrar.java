package Day15_FileUpload_Wait;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C02_ExplicitWait_Tekrar extends TestBase {

    /*
    https://the-internet.herokuapp.com/dynamic_loading/1
    Start buttonuna tıklayın
    Hello World! Yazının sitede oldugunu test edin
     */

    @Test
    public void ExplicitWaitTest() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        bekle(2);

        //Start buttonuna tıklayın
        driver.findElement(By.xpath("//button")).click();

        //Hello World! Yazının sitede oldugunu test edin
        WebElement helloWorldText = driver.findElement(By.xpath("(//h4)[2]"));
        //Implicit wait ile test geçmedi. Explicit wait kullancağız
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//h4)[2]")));
        Assert.assertTrue(helloWorldText.isDisplayed());
    }
}
