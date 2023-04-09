package Day11_Iframe_WindowHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_Iframe extends TestBase {

    /*
   https://the-internet.herokuapp.com/iframe sayfasına gidiniz
   Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
   Textbox içindeki yazıyı siliniz.
   Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
   Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
    */

    @Test
    public void iframe() {
        //https://the-internet.herokuapp.com/iframe sayfasına gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe"); bekle(1);
        //Kalın yazının "Editor" kelimesini içerdiğini doğrulayınız
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(actualText.contains("Editor")); bekle(2);
        System.out.println("Kalın yazının \"Editor\" kelimesini içerdiğini doğrulayınız (TEST PASSED)");
        //Textbox içindeki yazıyı siliniz.
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.xpath("//body[@data-id='mce_0']"));
        textBox.clear(); bekle(2); //textBox içerisinde ki yazıyı sildik
        System.out.println("Textbox içindeki yazıyı siliniz. (TEST PASSED)");
        //Sildiğiniz yazı yerine "Bu textbox iFrame içinde yer almaktadır" yazınız.
        textBox.sendKeys("Bu textbox iFrame içinde yer almaktadır"); bekle(2);
        System.out.println("Sildiğiniz yazı yerine Bu textbox iFrame içinde yer almaktadır yazınız. (TEST PASSED)");
        //Sayfadaki "Elemental Selenium" yazısının görünür olduğunu doğrulayınız.
        //driver.switchTo().parentFrame();
        //driver.switchTo().defaultContent();
        //driver.navigate().refresh(); --> bu methoda sayfayı yenilediğimiz için ilk menüye tekrar geçmiş oluruz
        driver.switchTo().parentFrame();
        WebElement textBox2 = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
        Assert.assertTrue(textBox2.isDisplayed());
        System.out.println("Elemental Selenium (TEST PASSED)");
    }
}
