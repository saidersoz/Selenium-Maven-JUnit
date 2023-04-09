package Day13_ActionsClass;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C02_Actions02 extends TestBase {

    @Test
    public void actions() {
        //1 -- Amazon anasayfasına gidin
        driver.get("https://amazon.com");
        bekle(2);

        //2 -- "Account & List" üzerinde bekleyin (mouse over - hover over)
        WebElement accountList = driver.findElement(By.xpath("//div[@class='nav-line-1-container']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();
        //moveToElement method'u ile mause locate ettiğimiz WE'in üzerine gider
        //actions'u sonlandırmak için perform() method'u kullanırız.
        bekle(2);


        //3 -- Açılan menüde "Account" linkine tıklayın
        driver.findElement(By.xpath("//*[text()='Account']")).click();
        bekle(2);


        //4 -- Açılan sayfanın başlığının "Your Account" içerdiğini doğrulayın
        Assert.assertEquals("Your Account", driver.getTitle());
        bekle(2);

    }
}
