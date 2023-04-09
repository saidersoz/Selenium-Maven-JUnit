package Day12_WindowHandles_BasicAut_Cookies;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class C03_Cookies extends TestBase {

    //1-Amazon anasayfaya gidin
    //2-tum cookie’leri listeleyin
    //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
    //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
    //5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
    //6-eklediginiz cookie’nin sayfaya eklendigini test edin
    //7-ismi skin olan cookie’yi silin ve silindigini test edin
    //8-tum cookie’leri silin ve silindigini test edin


    @Test
    public void test01() {
        //1-Amazon anasayfaya gidin
        driver.get("https://www.amazon.com");
        //2-tum cookie’leri listeleyin [getCookies() ==> tüm cookie'leri listeleyebilmek için kullanırız
        Set<Cookie> cookieSet = driver.manage().getCookies();
        int sayac = 1;
        for (Cookie w : cookieSet){
            System.out.println(sayac+ ".ci cookie : "+w);
            System.out.println("Name : " + w.getName());
            System.out.println("Value : " + w.getValue());
            sayac++;
        }

        //3-Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
        int cookieSayisi = cookieSet.size();
        Assert.assertTrue(cookieSayisi>5);

        //4-ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
        String cookieValue = driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assert.assertEquals("USD",cookieValue);

        //5-ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie  olusturun ve sayfaya ekleyin
        Cookie cookie = new Cookie("en sevdiğim cookie","cikolatali");
        driver.manage().addCookie(cookie);

        //6-eklediginiz cookie’nin sayfaya eklendigini test edin
        cookieSet = driver.manage().getCookies();
        sayac = 1;
        for (Cookie cookie1 : cookieSet){
            System.out.println(sayac+ ".ci cookie : "+cookie1);
            sayac++;
        }

        //7-ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        Assert.assertFalse(cookieSet.contains("skin"));
        cookieSet = driver.manage().getCookies();
        sayac = 1;
        for (Cookie cookie1 : cookieSet){
            System.out.println(sayac+ ".ci cookie : "+cookie1);
            sayac++;
        }

        //8-tum cookie’leri silin ve silindigini test edind
        driver.manage().deleteAllCookies();
        cookieSet = driver.manage().getCookies();
        Assert.assertTrue(cookieSet.isEmpty());

    }
}
