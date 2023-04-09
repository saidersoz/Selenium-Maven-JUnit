package Day12_WindowHandles_BasicAut_Cookies;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C02_BasicAuthentication extends TestBase {

           /*
           Aşağıdaki bilgileri kullanarak authentication yapınız:
           Url: https://the-internet.herokuapp.com/basic_auth
           Username: admin
           Password: admin
           Başarılı girişi doğrulayın.
           */
    //Authentication Url: "https://admin:admin@the-internet.herokuapp.com/basic_auth"
    //https://the-internet.herokuapp.com/basic_auth adresine gidiniz
    //Paragrafın "Congratulations" kelimesini içerdiğini doğrulayınız


    @Test
    public void basicAuthentication() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        WebElement paragraph = driver.findElement(By.xpath("//p"));
        Assert.assertTrue(paragraph.getText().contains("Congratulations"));
    }
}
