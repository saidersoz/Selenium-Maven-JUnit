package Day16_SeleniumException;

import Utilities.TestBase;
import org.junit.Test;

public class C04_StaleElementReferanceExceptions extends TestBase {

    /*
    StaleElementReferanceExceptions :
        --bir web sayfasında ki bir webElementin geçerliliğinin kaybolduğu durumlarda oluşur.
        Yani bir webElementi Locate ettikten sonra sayfada refresh yada back-forward kullanıyorsak
        yeniden o elemente ulaşmak istedğimizde bu hatayı alırız. Bunu handle edebilmek için
        WebElement'e yeniden locate atamalıyız.
      */

    @Test
    public void StaleElementReferanceExceptionsTest1() {

    }
}
