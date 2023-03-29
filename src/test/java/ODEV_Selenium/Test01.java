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

public class Test01 {

    /*
    *** Aşağıdaki Task'i Junit framework'u ile yapınız
    - ebay sayfasına gidiniz +++
    - electronics bölümüne tıklayınız +++
    - Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
    - Her sayfanın sayfa başlığını yazdıralım
    - sayfayı kapatalım
     */

    WebDriver driver;

    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://www.ebay.com/"); Thread.sleep(1500);
        WebElement electronics = driver.findElement(By.xpath("(//li[@class=\"hl-cat-nav__js-tab\"])[1]"));
        electronics.click(); Thread.sleep(1500);
        for (int i = 1; i < 25; i++) {
            List <WebElement> width225andHeight225 = driver.findElements(By.xpath("//*[@width='225' and @height='225']"));
            width225andHeight225.get(i).click(); Thread.sleep(1500);
            List <WebElement> baslik = driver.findElements(By.xpath("//h1"));
            System.out.println(baslik.get(0).getText());
            driver.navigate().back();
        }
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.close();
    }
}
