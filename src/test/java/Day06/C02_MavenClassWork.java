package Day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_MavenClassWork {

    public static void main(String[] args) throws InterruptedException {

         /*
         http://zero.webappsecurity.com sayfasına gidin
         Signin buttonuna tıklayın
         Login alanına  “username” yazdırın
         Password alanına “password” yazdırın
         Sign in buttonuna tıklayın
         Pay Bills sayfasına gidin
         Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın
         Date kısmına “2023-03-27” yazdırın
         Pay buttonuna tıklayın
         “The payment was successfully submitted.” mesajının çıktığını kontrol edin
          */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        //http://zero.webappsecurity.com sayfasına gidin
        driver.get("http://zero.webappsecurity.com");
        Thread.sleep(1000);

        //Signin buttonuna tıklayın
        WebElement signIn = driver.findElement(By.xpath("//button[@id='signin_button']"));
        signIn.click();
        Thread.sleep(1000);

        //Login alanına  “username” yazdırın
        WebElement login = driver.findElement(By.xpath("//input[@name='user_login']"));
        login.sendKeys("username");
        Thread.sleep(1000);

        //Password alanına “password” yazdırın
        WebElement password = driver.findElement(By.xpath("//input[@name='user_password']"));
        password.sendKeys("password");
        Thread.sleep(1000);

        //Sign in buttonuna tıklayın
        WebElement signIn2 = driver.findElement(By.xpath("//input[@name='submit']"));
        signIn2.click();

        driver.navigate().back();
        Thread.sleep(1000);


        //Pay Bills sayfasına gidin
        WebElement onlineBanking = driver.findElement(By.xpath("//strong[text()='Online Banking']"));
        onlineBanking.click();
        Thread.sleep(1000);

        WebElement payBills = driver.findElement(By.xpath("//span[@id='pay_bills_link']"));
        payBills.click();
        Thread.sleep(1000);

        //Amount kısmına yatırmak istediğiniz herhangi bir miktarı yazın
        WebElement amount = driver.findElement(By.xpath("//input[@id='sp_amount']"));
        amount.sendKeys("100");
        Thread.sleep(1000);

        //Date kısmına “2023-03-27” yazdırın
        WebElement date = driver.findElement(By.xpath("//input[@id='sp_date']"));
        date.sendKeys("2023-03-27");
        Thread.sleep(1000);

        //Pay buttonuna tıklayın
        WebElement pay = driver.findElement(By.xpath("//input[@id='pay_saved_payees']"));
        pay.click();
        Thread.sleep(1000);

        //Descriptiona Electric gir
        WebElement Description = driver.findElement(By.xpath("//input[@id='sp_description']"));
        Description.sendKeys("Electric");
        Thread.sleep(1000);

        //“The payment was successfully submitted.” mesajının çıktığını kontrol edin
        String message = "The payment was successfully submitted.";

        WebElement AppMessage = driver.findElement(By.xpath("//div[@id='alert_content']"));
        System.err.println(AppMessage.getText());

        if (message.equals(AppMessage.getText())){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        Thread.sleep(1000);

        //sayfayı kapatalım
         driver.close();
    }

}
