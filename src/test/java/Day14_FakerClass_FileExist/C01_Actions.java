package Day14_FakerClass_FileExist;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class C01_Actions extends TestBase {

    @Test
    public void actions() {
        //"https://techproeducation.com/" gidin
        driver.get("https://techproeducation.com/");
        driver.findElement(By.cssSelector("i[class='eicon-close']")).click();
        //İlk kelime SHIFT tuşuna basılı şekilde, ikinci kelime basılmadan "TECHPRO education" araması yapın.
        WebElement search = driver.findElement(By.xpath("//*[@type='search']"));
        Actions actions = new Actions(driver);
        actions.keyDown(search, Keys.SHIFT). //Search üzerinde shift tuşuna basılı tutar
                sendKeys("techpro").
                keyUp(Keys.SHIFT). //shift tuşuna basma işlemi sonlanır
                sendKeys(" education", Keys.ENTER).perform();
        bekle(3);
        //Sayfayı Richmond College Enrollment form linkine kadar scroll yapalım
        WebElement richmondCollege = driver.findElement(By.xpath("(//h3//a)[9]"));
        actions.scrollToElement(richmondCollege).perform();
        //scrollToElement() method'u ile locate ettiğiniz bir webelement'e kadar yani o elemenet görünene kadar scroll
        //yapabilirsiniz.
    }
}
