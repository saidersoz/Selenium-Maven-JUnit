package Day10_Alert_Iframe;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class C02_Iframe extends TestBase {

    //➢	https://testcenter.techproeducation.com/index.php?page=iframe
    //➢	Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim
    //➢	Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
    //➢	Son olarak footer daki ‘Povered By’ yazisini varligini test edilip


    @Test
    public void iframe() {
        //➢https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

        //➢Ana sayfadaki ‘An iframe with a thin black border:’ metninde ‘black border’ yazisinin   oldugunu test edelim
        String actualText = driver.findElement(By.xpath("//p[text()='An iframe with a thin black border:']")).getText();
        String expectedText = "black border";
        Assert.assertTrue(actualText.contains(expectedText));
        bekle(2);
        System.out.println("black border (TEST PASSED)");
        //➢Ayrica ‘Applications lists’ yazisinin sayfada oldugunu test edelim
        driver.switchTo().frame(0);
        /*
        Eğer 2 tane iframe olsaydı ve 2.frame'e geçmek isteseydim index'i 1 almam gerekecekti.
        Örneğin:
            <body>
	            <iframe id="outerIframe" src="https://www.w3schools.com"> --> driver.switchTo().frame("outerIframe");
		            <iframe id="innerIframe" src="https://www.google.com"></iframe> -->Eğer bir üst frame içinde bir frame daha varsa tekrar driver.switchTo().frame("innerIframe");
	            </iframe>
            </body>
        --index ile yukarıda bahsettiğimiz gibide yapabilirsiniz.
        --iframe'i locate ederekte örneğin yukarıda ki kodun "iframe[id='outerIframe']" cssSelector ile locate ile locate edlmiş hali
        --id ve name attributu varsa
         */
        String actualText1 = driver.findElement(By.xpath("//h1[text()='Applications lists']")).getText();
        Assert.assertTrue(actualText1.contains("Applications lists"));
        bekle(2);
        System.out.println("Applications lists (TEST PASSED)");
        //➢Son olarak footer daki ‘Povered By’ yazisini varligini test edilip


    }
}
