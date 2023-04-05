package ODEV_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class odev001 {

    // https://www.amazon.com/ sayfasina gidin
    // dropdown'dan "Books" secenegini secin
    // arama cubuguna "Java" aratın
    // arama sonuclarinin Java icerdigini test edin


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
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void test01() throws InterruptedException {
        // https://www.amazon.com/ sayfasina gidin
        // dropdown'dan "Books" secenegini secin
        // arama cubuguna "Java" aratın
        // arama sonuclarinin Java icerdigini test edin
        driver.get("https://www.amazon.com/"); Thread.sleep(1500);
        List<WebElement> ddm = driver.findElements(By.xpath("//select[@aria-describedby='searchDropdownDescription']"));
        Select select = new Select(ddm.get(0));
        select.selectByIndex(5);  Thread.sleep(1500);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java" + Keys.ENTER); Thread.sleep(1500);


    }
}
