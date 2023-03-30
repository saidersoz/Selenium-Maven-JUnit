package ODEV_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Test02 {

      /*
      *** Aşağıdaki Task'i Junit framework'u ile yapınız
      - http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
      - Add Element butonuna 100 defa basınız
      - 100 defa basıldığını test ediniz
      - 90 defa delete butonuna basınız
      - 90 defa basıldığını doğrulayınız
      - Sayfayı kapatınız
       */

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2500);
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(1000);
        WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        for (int i = 1; i < 101; i++) {
            addElement.click();
        }
        Thread.sleep(1000);

        List<WebElement> deleteKacAdet = driver.findElements(By.xpath("//button[@onclick='deleteElement()']"));
        int count = 0;
        for (WebElement each : deleteKacAdet) {
            count++;
        }
        if (count == 100) {
            System.out.println("Add Element Tuşuna 100 Kere Basıldı");
        } else {
            System.out.println("Add Element Tuşuna " + count + " Kere Basıldı");
        }
        Thread.sleep(1000);

        List<WebElement> delete = driver.findElements(By.xpath("//button[@class='added-manually']"));
        for (int i = 0; i < 90; i++) {
            delete.get(i).click();
        }
        Thread.sleep(1000);

        List<WebElement> deleteSonHali = driver.findElements(By.xpath("//button[@class='added-manually']"));
        int sayac = 0;
        for (WebElement each : deleteSonHali) {
            sayac++;
        }
        if (sayac == 10) {
            System.out.println("Delete Tuşuna 90 Kere Basıldı");
        } else {
            System.out.println("Delete Tuşuna" + sayac + "Kere Basıldı");
        }
    }
}
