package ODEV_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test03 {

    /*
    -BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin
    -Before methodunda http://www.google.com adresine gidin
    -Üç farklı test methodu ile;
    -arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
    -arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    -arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
    -NOT: Çıkan sonuç sayılarını After methodunda yazdırınız
    -AfterClass ile kapatın
     */
    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Before
    public void setUp() throws Exception {
        driver.get("http://www.google.com");
    }

    @Test
    public void test01() throws InterruptedException {
        //-arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
        WebElement firstSearchBox = driver.findElement(By.xpath("(//textarea)[1]"));
        firstSearchBox.sendKeys("The God Father" + Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test
    public void test02() throws Exception {
        //-arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
        WebElement secondsSearchBox = driver.findElement(By.xpath("(//textarea)[1]"));
        secondsSearchBox.sendKeys("Lord of the Rings" + Keys.ENTER);
        Thread.sleep(2000);
    }

    @Test
    public void test03() throws Exception {
        //-arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
        WebElement thirdSearchBox = driver.findElement(By.xpath("(//textarea)[1]"));
        thirdSearchBox.sendKeys("Kill Bill" + Keys.ENTER);
        Thread.sleep(2000);
    }

    @After
    public void tearDown() throws Exception {
        WebElement result1 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String[] resultArr1 = result1.getText().split(" ");
        System.out.println("The God Father ==> " + resultArr1[1] + " Sonuç Bulundu");

        WebElement result2 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String[] resultArr2 = result2.getText().split(" ");
        System.out.println("Lord of the Rings ==> " + resultArr2[1] + " Sonuç Bulundu");

        WebElement result3 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String[] resultArr3 = result3.getText().split(" ");
        System.out.println("Kill Bill ==> " + resultArr3[1] + " Sonuç Bulundu");

    }

    @AfterClass
    public static void afterClass() throws Exception {
        Thread.sleep(1500);
        driver.close();
    }
}
