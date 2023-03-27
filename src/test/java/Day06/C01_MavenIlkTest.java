package Day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_MavenIlkTest {

    public static void main(String[] args) throws InterruptedException {

         /*
         https://www.amazon.com/ sayfasına gidelim
         Arama kutusunu locate edelim
         “Samsung headphones” ile arama yapalım
         Bulunan sonuç yazısını yazdıralım
         İlk ürünü tıklayalım
         Sayfadaki tüm başlıkları yazdıralım
          */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //https://www.amazon.com/ sayfasına gidelim
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(1000);

        //Arama kutusunu locate edelim
        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));

        //“Samsung headphones” ile arama yapalım
        search.sendKeys("Samsung headphones");
        search.submit();
        Thread.sleep(1000);

        //Bulunan sonuç yazısını yazdıralım
        WebElement resultFull = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        String result = resultFull.getText();
        String[] resultArr = result.split(" ");
        System.out.println("Toplam " + resultArr[2] + " Sonuç Bulundu");
        Thread.sleep(1000);

        //İlk ürünü tıklayalım
        //Tüm arama sonucu ürünleri list içine koyup ilk elemana tıklıyoruz
        List<WebElement> firstProduct = driver.findElements(By.xpath("(//img[@class='s-image'])"));
        firstProduct.get(0).click();
        Thread.sleep(1000);

        //Sayfadaki tüm başlıkları yazdıralım
        System.err.println("İlk Ürün Başlıkları ");
        List<WebElement> titles = driver.findElements(By.xpath("//h1"));
        for (WebElement each : titles) {
            System.out.println("==> "+each.getText());
        }
        Thread.sleep(1000);

        System.out.println();
        //bir önce ki sayfaya gelelim
        driver.navigate().back();
        System.err.println("Ana Sayfa Başlıkları ");
        List<WebElement> anaTitles = driver.findElements(By.xpath("//h2"));
        for (WebElement each : anaTitles){
            System.out.println("==> "+each.getText());
        }
        Thread.sleep(1000);

        //sayfayı kapatalım
        driver.close();
    }

}
