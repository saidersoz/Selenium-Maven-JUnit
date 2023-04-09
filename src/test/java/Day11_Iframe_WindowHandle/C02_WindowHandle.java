package Day11_Iframe_WindowHandle;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;

import java.util.ArrayList;
import java.util.List;

public class C02_WindowHandle extends TestBase {

    /*
    //Window 1'de https://www.techproeducation.com adresine gidiniz
    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    //Window 2'de https://www.youtube.com sayfasını açınız:
    //Window 3'te https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:
     */

    @Test
    public void windowHandle() {
        ////Window 1'de https://www.techproeducation.com adresine gidiniz
        //    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        driver.get("https://www.techproeducation.com");
        //String techproWindowHandle = driver.getWindowHandle(); //techpro'yu handle ettik string'e
        String techProTitle = driver.getTitle();
        Assert.assertEquals(techProTitle, "Techpro Education | Online It Courses & Bootcamps");
        bekle(2);
        System.out.println("Techpro Education Sayfası açıldı");

        //    //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo() // ==> Geçiş yap
                .newWindow(WindowType.WINDOW); //==> Yeni bir pencere'ye driver'i taşı
        //WindowType.TAB ==> Yeni sekme açar
        //WindowType.WINDOW ==> Yeni pencere'de açar
        driver.get("https://www.youtube.com");
        bekle(2);
        //String youtubeWindowHandle = driver.getWindowHandle();
        System.out.println("Youtube sayfası açıldı");

        //    //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        //String linkedInWindowHandle = driver.getWindowHandle();
        bekle(2);
        System.out.println("LinkedIn sayfası açıldı");


        List<String> tumWindowList = new ArrayList<>(driver.getWindowHandles());
        //Bütün açtığın handle değerlerini bir arrayList'e ataadık.




        //    //techproeducation sayfasına geçiniz:
        //driver.switchTo().window(techproWindowHandle);
        bekle(2);
        driver.switchTo().window(tumWindowList.get(0));
        System.out.println("Techpro Education Sayfası'na geçildi"); //-> Ilk açtığımız pencereye index ile geçebiliriz.


        //    //youtube sayfasına geçiniz:
        //driver.switchTo().window(youtubeWindowHandle);
        bekle(2);
        driver.switchTo().window(tumWindowList.get(1));
        System.out.println("YouTube Sayfası'na geçildi");


        //    //linkedIn sayfasına geçiniz:
        //driver.switchTo().window(linkedInWindowHandle);
        bekle(2);
        driver.switchTo().window(tumWindowList.get(2));
        System.out.println("LinkedIn Sayfası'na geçildi");

    }
}
