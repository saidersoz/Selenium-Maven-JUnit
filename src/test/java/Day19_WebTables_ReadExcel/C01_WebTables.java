package Day19_WebTables_ReadExcel;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class C01_WebTables extends TestBase {

    @Test
    public void webTablesTest1() {

        //thead-->tablonun başlığı
        //tbody-->tablonun içi(body)
        //tr-->satır
        //td-->sütun

        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");

        //    Task 1 : Table1’i yazdırın
        WebElement table1 = driver.findElement(By.xpath("(//table)[1]"));
        System.out.println(table1.getText());

        System.out.println();

        //    Task 2 : 3. Satır verilerini yazdırın
        WebElement table1Satir3 = driver.findElement(By.xpath("//table[1]//tbody[1]//tr[3]"));
        System.out.println(table1Satir3.getText());

        //2.yol
        List<WebElement> list = driver.findElements(By.xpath("//tbody[1]//tr[3]//td"));
        list.forEach(t -> System.out.println(t.getText() + " - "));

        System.out.println();

        //    Task 3 : Son satırın verilerini yazdırın
        WebElement table2satir4 = driver.findElement(By.xpath("(//tbody)[2]//tr[last()]"));
        System.out.println(table2satir4.getText());


        System.out.println();

        //    Task 4 : 5. Sütun verilerini yazdırın
        WebElement sutunVerileri5 = driver.findElement(By.xpath("(//thead)[1]//th[5]"));
        System.out.println(sutunVerileri5.getText());

        List<WebElement> sutunList1 = driver.findElements(By.xpath("(//tbody)[1]//td[5]"));
        sutunList1.forEach(t -> System.out.println(t.getText()));

        System.out.println();

        //    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData


        //    Parameter 1 = satır numarası


        //    Parameter 2 = sütun numarası


        //    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.


    }
}
