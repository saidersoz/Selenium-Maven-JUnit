package Day17_ScreenShot;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class C01_ScreenShot extends TestBase {

    @Test
    public void SS_test01() throws IOException {

        /*
            Tüm ekran görüntüsünü seleniumdan gelen "getScreenShorAs()" methodu ile alırız.
        Bu method Selenium'daki TakesScreenShot arayüz'ünden(interface) gelir.
         */
        //techproeducation sayfasına gidelim ekran resmini projemize kaydedelim.
        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //1.adım : ilk olarak dosyayı nereye kaydedeceğimizi belirtiriz
        String dosyaYolu = "screenShot.png";

        //2.adım : ikinci olarak "TakesScreenshot" arayüzünden obje oluşturmak
        TakesScreenshot ts = (TakesScreenshot) driver;

        //3.adım
        /*
        FileUtils class'ı file nesneleri ile birlikte kullanabileceğimiz methodlar içerir.
        Bu method'ları kullanarak dosyalarda okuma, yazma, kopyalama ve silme işlemlerini çok daha kolay yapabiliriz.
        Note: Files.write() methodu'da aynı işlemi görür.
         */
        //ekran resmini projemize kaydedelim.
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));


    }
}
