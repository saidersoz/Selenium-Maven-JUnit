package Kafamagore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Elif {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://dijitaluzmani.com/");
        Thread.sleep(1000);

        WebElement hakkizda = driver.findElement(By.xpath("//a[text()='Hakkımızda']"));
        hakkizda.click();
        Thread.sleep(1000);

        WebElement ekip = driver.findElement(By.xpath("(//span[@class='pl-2'])[2]"));
        ekip.click();
        Thread.sleep(1000);

        WebElement elif = driver.findElement(By.xpath("//img[@src=\"https://cdn.dijitaluzmani.com/uploads/elif-63dc2c64e89fe592217027.png\"]"));
        elif.click();
        Thread.sleep(4000);

        WebElement blog = driver.findElement(By.xpath("//a[@href='/blog']"));
        blog.click();
        Thread.sleep(1500);

        WebElement blogYazisi = driver.findElement(By.xpath("(//h6)[2]"));
        blogYazisi.click();
        Thread.sleep(8000);

        WebElement yazi = driver.findElement(By.xpath("//div[@class='content']"));
        System.out.println(yazi.getText());

        driver.close();


    }

}
