package day12_WindowHandles_BasicAut_Cookies;

import Utilities.TestBase;
import org.junit.Test;

public class C02_BasicAuthentication extends TestBase {

           /*
           Aşağıdaki bilgileri kullanarak authentication yapınız:
           Url: https://the-internet.herokuapp.com/basic_auth
           Username: admin
           Password: admin
           Başarılı girişi doğrulayın.
           */
    //Authentication Url: "https://admin:admin@the-internet.herokuapp.com/basic_auth"
    //https://the-internet.herokuapp.com/basic_auth adresine gidiniz
    //Paragrafın "Congratulations" kelimesini içerdiğini doğrulayınız


    @Test
    public void basicAuthentication() {
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
