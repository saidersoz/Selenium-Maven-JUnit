package Day18_ScreenShot_ExtentReport;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;

public class C03_ScreenShotClassWork extends TestBase {

    @Test
    public void classwork() {
        //techporeducation sayfasına gidelim
        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();

        //sayfanın resmini alalım
        tumSayfaResmi();

        //Arama bölümünde Java aratalım
        WebElement techProSearchBox = driver.findElement(By.xpath("//input[@placeholder='Search...']"));
        techProSearchBox.sendKeys("Java" + Keys.ENTER);

        //ve sonuc yazının resmini alalım
        WebElement sonucYazisi1 = driver.findElement(By.xpath("//h1"));
        webelementResmi(sonucYazisi1);

        //Yeni bir sekmede Amazona gidelim
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.amazon.com");

        //sayfanın resmini alalım
        tumSayfaResmi();

        //arama bölümünde iphone aratalım
        WebElement amazonSearchBox = driver.findElement(By.id("twotabsearchtextbox"));
        amazonSearchBox.sendKeys("iphone" + Keys.ENTER);

        //ve sonuc yazısının resmini alalım
        WebElement sonucYazisi2 = driver.findElement(By.xpath("//h1"));
        webelementResmi(sonucYazisi2);

        //tekrar techporeducation sayfasına geçelim ve sayfanın resmini alalım
        window(0);
    }
}
