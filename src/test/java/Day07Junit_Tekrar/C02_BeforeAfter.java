package Day07Junit_Tekrar;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BeforeAfter {

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test methodu öncesi bir kez çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her test methodu sonrası bir kez çalışır");
    }

    @Test
    public void test01() {
        System.out.println("1.Test");
    }

    @Test
    public void test02() {
        System.out.println("2.Test");
    }


}

