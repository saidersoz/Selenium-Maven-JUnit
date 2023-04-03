package Day10_Alert_Iframe;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Odev extends TestBase {
    
    //● Bir class olusturun: IframeOdev
    //1)https://the-internet.herokuapp.com/iframe sitesine gidiniz
    //2) sayfadaki toplam iframe sayısını bulunuz.
    //3) Sayfa basliginda ‘Editor’ yazını içerdiğini test edelim.
    //4) Paragrafdaki yaziyi silelim
    //5) Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım
    //6) Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edelim


    @Test
    public void odevTest() {
        //1)https://the-internet.herokuapp.com/iframe sitesine gidiniz
        driver.get("https://the-internet.herokuapp.com/iframe"); bekle(2);

        //2) sayfadaki toplam iframe sayısını bulunuz.
        int count = 0;
        List<WebElement> iframe = driver.findElements(By.xpath("//iframe"));
        for (WebElement each : iframe){
            count++;
        }
        System.out.println("Iframe sayısı = " + count);

        //3) Sayfa basliginda ‘Editor’ yazısını içerdiğini test edelim.
        String sayfaBasligi = driver.findElement(By.xpath("//h3")).getText();
        Assert.assertTrue(sayfaBasligi.contains("Editor"));
        System.out.println("Sayfa basliginda ‘Editor’ yazısı bulunuyor");
        bekle(2);

        //4) Paragrafdaki yaziyi silelim
        driver.switchTo().frame(0);


        //5) Sonrasinda paragrafa “iframein icindeyim” yazisini yazdıralım

        //6) Alt kısımdaki yazının ‘Elemental Selenium’ yazisini içerdiğini test edelim

    }
}
