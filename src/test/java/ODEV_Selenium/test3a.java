package ODEV_Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class test3a {

    @Test
    public void test01() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("http://www.google.com");

        //-arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
        WebElement firstSearchBox = driver.findElement(By.xpath("(//textarea)[1]"));
        firstSearchBox.sendKeys("The God Father" + Keys.ENTER);
        Thread.sleep(2000);
        WebElement result1 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String[] resultArr1 = result1.getText().split(" ");
        System.out.println("The God Father ==> " + resultArr1[1] + " Sonuç Bulundu");

        //-arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
        WebElement secondsSearchBox = driver.findElement(By.xpath("(//textarea)[1]"));
        secondsSearchBox.sendKeys("Lord of the Rings" + Keys.ENTER);
        Thread.sleep(2000);
        WebElement result2 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String[] resultArr2 = result2.getText().split(" ");
        System.out.println("Lord of the Rings ==> " + resultArr2[1] + " Sonuç Bulundu");

        //-arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
        WebElement thirdSearchBox = driver.findElement(By.xpath("(//textarea)[1]"));
        thirdSearchBox.sendKeys("Kill Bill" + Keys.ENTER);
        Thread.sleep(2000);
        WebElement result3 = driver.findElement(By.xpath("//div[@id='result-stats']"));
        String[] resultArr3 = result3.getText().split(" ");
        System.out.println("Kill Bill ==> " + resultArr3[1] + " Sonuç Bulundu");

        Thread.sleep(1500);
        driver.close();
    }
}
