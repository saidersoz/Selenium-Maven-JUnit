package Day16_SeleniumException;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class C03_NullPointerExceptions {

    /*
    NullPointerExceptions :
        -Değişken oluşturup bu değişkene atama yapmadığımızda yada eşitlemediğimizde
         NullPointerExceptions hatası alırız.
     */

    WebDriver driver;
    Faker faker;
    Actions actions;
    Integer sayi;
    String isim;
    int number;

    @Test
    public void NullPointerExceptionsTest1() {
        driver.get("https://amazon.com"); //java.lang.NullPointerException
        //driver objeme atama yapmadığım İÇİN java.lang.NullPointerException hatası alırız.
    }

    @Test
    public void NullPointerExceptionsTest2() {
        //faker = new Faker(); bu atamayı yapmadığımız için bu hatayı aldık.
        System.out.println(faker.name().firstName()); //java.lang.NullPointerException
    }

    @Test
    public void NullPointerExceptionsTest3() {
        //actions = new Actions(driver); bu atamayı yapmadığımız için bu hatayı aldık.
        actions.doubleClick().perform();//java.lang.NullPointerException
    }

    @Test
    public void NullPointerExceptionsTest4() {
        // sayi = 5;  bu atamayı yapmadığımız için bu hatayı aldık.
        System.out.println(sayi+5); //java.lang.NullPointerException
    }

    @Test
    public void NullPointerExceptionsTest5() {
        //isim = "said";  bu atamayı yapmadığımız için bu hatayı aldık.
        System.out.println(isim.substring(0,1)); //java.lang.NullPointerException
    }

    @Test
    public void NullPointerExceptionsTest6() {
        System.out.println(number+5);
    }
}
