package Day21_JSExecutor;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class C01_JSExecutor_Click extends TestBase {

    /*
    http://www.uitestpractice.com/Students/Form sayfasına git
    Formu doldur
    Submit tuşuna tıkla
    Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.
    */

    @Test
    public void clikByJSTest() {

        /*
        Eğer bir web sayfasının HTML kodları tamamen yada kısmen JavaScript kullanılaral oluşturulduysa
        o sayfaya müdehale etmek için genellikle JavaScriptExecutor arayğüzü kullanmak gerekir bu durumda
        sayfayı manipule etmek veya etkileşimde bulunmak için standart WebDriver komutları yetersiz kalabilir.
        bu nedenle JSExecutor arayüzü, sayfanın JS kodlarına doğrudan erişebilir.Ancak mümkünse WebDriver'in sunduğu
        standart yöntemlerle sorunları çözmek herzaman daha iyidir. Çünkü JS kullanımı, sayfanın daha yavaş yüklenmesine
        neden olabilir.
         */

        //    http://www.uitestpractice.com/Students/Form sayfasına git
        driver.get("http://www.uitestpractice.com/Students/Form");

        //    Formu doldur
        Faker faker = new Faker();
        WebElement firstName = driver.findElement(By.id("firstname"));
        firstName.sendKeys(faker.name().firstName() + Keys.TAB, faker.name().lastName(), Keys.TAB, Keys.TAB,
                Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB, Keys.TAB,"said");

        bekle(1);


        //    Submit tuşuna tıkla
        WebElement submit = driver.findElement(By.xpath("//button[@type='submit']"));
        /*
        try {
            submit.click();
        }catch (Exception e){
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();",submit);
        }
        */
        //org.openqa.selenium.ElementClickInterceptedException: Eğer JS kodlarıyla bir web element oluşturulmuşsa
        //normal click() methodunda bu exception'ı alırız

        click(submit);

        bekle(1);

        //    Sayfa adresinin "http://www.uitestpractice.com/Students/Form?optradio=on" olduğunu doğrula.

        String actualUrl = driver.getCurrentUrl();
        String expecterUrl = "http://www.uitestpractice.com/Students/Form?optradio=on";

        Assert.assertNotEquals(expecterUrl,actualUrl);
    }
}
