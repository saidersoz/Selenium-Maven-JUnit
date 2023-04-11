package Day15_FileUpload_Wait;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_FileUpload extends TestBase {

    //https://the-internet.herokuapp.com/upload adresine gidin
    //    logo.jpeg dosyasını yükleyin(upload)
    //    “File Uploaded!” textinin görüntülendiğini test edin


    @Test
    public void fileUpload() {
        /*
        Bir Web sayfasında upload işlemi yapmamız gerekirse;
            1-Öncelikle upload edeceğimiz webelementi locate ederiz
            2-Upload edecir string'e aseğimiz dosya yolunu bsingn ederiz
            3-Locate ettiğimiz webelement'e sendkeys() methodu ile dosyayolunu aldığımız string değişkeni göndeririz
         */

        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
        bekle(3);

        //logo.jpeg dosyasını yükleyin(upload)
        WebElement dosyaSecWebElement = driver.findElement(By.id("file-upload"));
        bekle(3);
        String dosyaYolu = "C:\\Users\\ASUS\\OneDrive\\Masaüstü\\b129.txt";
        //String dosyaYolu = System.getProperty("user.home")+"\\OneDrive\\Masaüstü\\b129.txt";
        dosyaSecWebElement.sendKeys(dosyaYolu);
        bekle(3);
        driver.findElement(By.id("file-submit")).click();

        //“File Uploaded!” textinin görüntülendiğini test edin
        WebElement fileUpload = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(fileUpload.isDisplayed());
    }
}
