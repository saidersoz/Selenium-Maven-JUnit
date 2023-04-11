package Day15_FileUpload_Wait;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_ExplicitWait extends TestBase {

    @Test
    public void explicitWait() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //    Start buttonuna tıklayın
        driver.findElement(By.xpath("//*[text()='Start']")).click();

       //WebElement helloWorld = driver.findElement(By.xpath("(//h4)[2]"));
       //Assert.assertTrue(helloWorld.isDisplayed());

        //    Hello World! Yazının sitede oldugunu test edin

    }
}
