package Day17_ScreenShot;

import Utilities.TestBase;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
        //proje seviyesinden new directory deyip resim dosyalarımızı bu klasörün içine kaydetsin
        String dosyaYolu = "target/screenShot/screenShot.png";

        //2.adım : ikinci olarak "TakesScreenshot" arayüzünden obje oluşturmak
        TakesScreenshot ts = (TakesScreenshot) driver;

        //3.adım
        /*
        FileUtils class'ı file nesneleri ile birlikte kullanabileceğimiz methodlar içerir.
        Bu method'ları kullanarak dosyalarda okuma, yazma, kopyalama ve silme işlemlerini çok daha kolay yapabiliriz.
        Note: Files.write() methodu'da aynı işlemi görür.
         */
        //ekran resmini projemize kaydedelim.
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
    }

    @Test
    public void SS_test02() throws IOException {

    /*
            Tüm ekran görüntüsünü seleniumdan gelen "getScreenShorAs()" methodu ile alırız.
        Bu method Selenium'daki TakesScreenShot arayüz'ünden(interface) gelir.
         */
        //techproeducation sayfasına gidelim ekran resmini projemize kaydedelim.
        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum

        //1.adım : ilk olarak dosyayı nereye kaydedeceğimizi belirtiriz
        String dosyaYolu = "C:\\Users\\ASUS\\OneDrive\\Masaüstü\\Yeni klasör/screenShor.png";

        //2.adım : ikinci olarak "TakesScreenshot" arayüzünden obje oluşturmak
        TakesScreenshot ts = (TakesScreenshot) driver;

        //3.adım
        /*
        FileUtils class'ı file nesneleri ile birlikte kullanabileceğimiz methodlar içerir.
        Bu method'ları kullanarak dosyalarda okuma, yazma, kopyalama ve silme işlemlerini çok daha kolay yapabiliriz.
        Note: Files.write() methodu'da aynı işlemi görür.
         */
        //ekran resmini projemize kaydedelim.
        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(dosyaYolu));
    }

    @Test
    public void test03() throws IOException {
        driver.get("https://www.amazon.com");
        //Kaydettiğimiz ekran resmi her seferinde aynı dosyanın

        String tarih = new SimpleDateFormat("hh/mm/ss_dd.MM.yyyy").format(new Date());
        String dosyaYolu = "target/screenShot/"+tarih+"png";

        TakesScreenshot ts = (TakesScreenshot) driver;

        FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE),new File(dosyaYolu));
    }
}
