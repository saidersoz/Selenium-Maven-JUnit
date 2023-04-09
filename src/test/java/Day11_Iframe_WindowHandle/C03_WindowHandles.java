package Day11_Iframe_WindowHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class C03_WindowHandles extends TestBase {

    //https://the-internet.herokuapp.com/windows adresine gidin.
    //İlk sayfanın ID'sini(Window Handle değerini) alın.
    //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
    //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
    //"Click Here" butonuna tıklayın.
    //Açılan pencereye geçin.
    //Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.
    //Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın
    //2. pencereye tekrar geçin.
    //1. pencereye tekrar geçin.


    @Test
    public void windowHandles() {
        //https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        bekle(1);

        //İlk sayfanın ID'sini(Window Handle değerini) alın.
        String herOku = driver.getWindowHandle();

        //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement text = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(text.isDisplayed());
        bekle(1);
        System.out.println("Opening a new window (TEST PASSED)");

        //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, "The Internet");
        bekle(1);
        System.out.println("Title “The Internet” (TEST PASSED)");

        //"Click Here" butonuna tıklayın.
        WebElement clickHere = driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
        clickHere.click();
        bekle(3);
        System.out.println("Click Here butonuna tıklandı (TEST PASSED)");

        List<String> olusturulanPencereler = new ArrayList<>(driver.getWindowHandles());

        //Açılan pencereye geçin.
        driver.switchTo().window(olusturulanPencereler.get(1));
        bekle(2);
        System.out.println("Yeni pencereye geçildi (TEST PASSED)");


        //Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.
        String newWindowTitle = driver.getTitle();
        Assert.assertEquals(newWindowTitle, "New Window"); bekle(2);
        System.out.println("sayfa başlığının(title) “New Window” (TEST PASSED)");


        //Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın
        driver.switchTo().window(olusturulanPencereler.get(0));
        String theInternetTitle = driver.getTitle();
        Assert.assertEquals(theInternetTitle,"The Internet"); bekle(2);
        System.out.println("sayfa başlığının(title) “The Internet” (TEST PASSED)");

        //2. pencereye tekrar geçin.
        driver.switchTo().window(olusturulanPencereler.get(1)); bekle(2);
        System.out.println("2. pencereye geçildi (TEST PASSED)");

        //1. pencereye tekrar geçin.
        driver.switchTo().window(olusturulanPencereler.get(0)); bekle(2);
        System.out.println("1. pencereye geçildi (TEST PASSED)");

    }
}
