package Day12_WindowHandles_BasicAut_Cookies;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_WindowHandlesMethod extends TestBase {

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

        //İlk sayfanın ID'sini(Window Handle değerini) alın.
        String ilkSayfaHandle = driver.getWindowHandle(); bekle(1);

        //Sayfadaki textin “Opening a new window” olduğunu doğrulayın.
        WebElement text1 = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(text1.getText().equals("Opening a new window"));
        System.out.println("Opening a new window (TEST PASSED)" ); bekle(1);

        //Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String theInternetTitle = driver.getTitle();
        Assert.assertTrue(theInternetTitle.equals("The Internet")); bekle(1);
        System.out.println("title = “The Internet” (TEST PASSED)");

        //"Click Here" butonuna tıklayın.
        driver.findElement(By.xpath("//a[@target='_blank']")).click(); bekle(1);
        System.out.println("Click Here (TEST PASSED)");

        //Açılan pencereye geçin.
        switchToWindow(1); bekle(2);
        System.out.println(driver.getTitle() + " Sayfasına geçildi (TEST PASSED)");

        //Açılan yeni pencerenin sayfa başlığının(title) “New Window” olduğunu doğrulayın.
        String newWindowTitle = driver.getTitle();
        Assert.assertTrue(newWindowTitle.contains("New Window")); bekle(1);
        System.out.println("title “New Window” (TEST PASSED)");

        //Bir önceki pencereye dönüp sayfa başlığının “The Internet” olduğunu  doğrulayın
        switchToWindow(0);
        Assert.assertTrue(driver.getTitle().equals("The Internet")); bekle(1);
        System.out.println("title “The Internet” (TEST PASSED)");

        //2. pencereye tekrar geçin.
        //switchToWindow(1); bekle(1);
        window(1);
        System.out.println("2. pencereye geçildi (TEST PASSED)");

        //1. pencereye tekrar geçin.
        //switchToWindow(0); bekle(1);
        window(0);
        System.out.println("2. pencereye geçildi (TEST PASSED)");
    }
}
