package Day13_ActionsClass;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.accessibility.AccessibleRelation;

public class C04_Actions04 extends TestBase {
    @Test
    public void actions1() {
        //https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");
        //"Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);
        WebElement dragSource = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropTarget = driver.findElement(By.xpath("//div[@id='droppable']"));
        bekle(2);
        Actions actions = new Actions(driver);
        bekle(2);
        actions.dragAndDrop(dragSource, dropTarget).perform();
        //source(drag) webElementini alıp Target(drop) webElementinin üzerine taşır.
    }

    @Test
    public void actions2() {
        //https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");
        //"Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);
        WebElement dragSource = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropTarget = driver.findElement(By.xpath("//div[@id='droppable']"));
        bekle(2);
        Actions actions = new Actions(driver);
        bekle(2);
        actions.clickAndHold(dragSource). //WeElementi tutup bekler
                moveToElement(dropTarget). //öouse'u elementin üzerine taşır.
                release(). //serbest bırakır
                perform();
    }

    @Test
    public void actions3() {
        //https://jqueryui.com/droppable/ adresine gidin
        driver.get("https://jqueryui.com/droppable/");

         //"Drag me to my target" elementini "Drop here" elementi üzerine bırakınız.
        driver.switchTo().frame(0);

        WebElement dragSource = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement dropTarget = driver.findElement(By.xpath("//*[@id='droppable']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(dragSource).
                moveByOffset(84, 28).//Webelementi istediğimiz kordinata taşır
                release().perform();
    }

}
