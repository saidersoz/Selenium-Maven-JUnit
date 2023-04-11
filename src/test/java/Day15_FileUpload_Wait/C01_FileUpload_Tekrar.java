package Day15_FileUpload_Wait;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_FileUpload_Tekrar extends TestBase {

    /*
    https://the-internet.herokuapp.com/upload adresine gidin
    logo.jpeg dosyasını yükleyin(upload)
    “File Uploaded!” textinin görüntülendiğini test edin
    */

    @Test
    public void fileUploadTest() {
        //https://the-internet.herokuapp.com/upload adresine gidin
        driver.get("https://the-internet.herokuapp.com/upload");
        bekle(3);

        //logo.jpeg dosyasını yükleyin(upload)
        String dosyaYolu = "C:/Users/ASUS/OneDrive/Masaüstü/techpro.jpeg";
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
                                                 //"C:/Users/ASUS/OneDrive/Masaüstü/techpro.jpeg"
        bekle(2);
        chooseFile.sendKeys(System.getProperty("user.home") + "/Masaüstü/techpro.jpeg");
                                       //System.getProperty("user.home") ==> "C:/Users/ASUS/OneDrive
        bekle(1);
        WebElement fileUploadButton = driver.findElement(By.id("file-submit"));
        fileUploadButton.click(); bekle(3);

        //“File Uploaded!” textinin görüntülendiğini test edin
        WebElement fileUploaded = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(fileUploaded.isDisplayed());

    }
}
