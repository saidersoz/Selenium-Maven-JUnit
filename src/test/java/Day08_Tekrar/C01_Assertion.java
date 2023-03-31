package Day08_Tekrar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Assertion {

        /*
        1)https://amazon.com adresinegidin
        2)Aşağıdaki adları kullanarak 4 test metodu oluşturun ve gerekli testleriyapin
        ○ title Test  => Sayfa başlığının “Amazon” kelimesini içerip içermediğini test edin
        ○ image Test => Amazon resminin görüntülendiğini (isDisplayed()) test edin
        ○ Search Box 'in erisilebilir oldugunu test edin(isEnabled())
        ○ wrongTitleTest => Sayfa basliginin “amazon” içermediğini doğrulayın
        */

    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(1000);
        driver.close();
    }

    @Test
    public void titleTest() {

    }

    @Test
    public void imageTest() {

    }

    @Test
    public void searchBox() {

    }

    @Test
    public void wrongTitleTest() {

    }

}
