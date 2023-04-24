package Day21_JSExecutor;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class C03_JSExecutor_Type extends TestBase {

    //Techpro education ana sayfasina git
    //Arama kutusuna QA yaz


    @Test
    public void name() {
        //Techpro education ana sayfasina git
        driver.get("https://techproeducation.com");
        bekle(2);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();

        //Arama kutusuna QA yaz
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@title='Search']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        /*
        Bazı giriş kutuları normal sendKeys() methodu ile metin gönderilmesine izin vermez.
        Bu gibi durumlarda aşağıdaki örnekte gibi JSExecutor kullanılır.
        */
       // js.executeScript("arguments[0].value='QA'",aramaKutusu);
        SendKeysJS(aramaKutusu,"QA");
    }
}
