package Day19_WebTables_ReadExcel;

import Utilities.TestBase;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class C01_WebTables extends TestBase {

    @Test
    public void webTablesTest1() {
        //    https://the-internet.herokuapp.com/tables sayfasına gidin
        driver.get("https://the-internet.herokuapp.com/tables");

        //    Task 1 : Table1’i yazdırın
        WebElement table1 = driver.findElement(By.xpath("(//table)[1]"));
        System.out.println(table1.getText());

        System.out.println();

        //    Task 2 : 3. Satır verilerini yazdırın
        WebElement table1Satir3 = driver.findElement(By.xpath("//table[1]//tbody[1]//tr[3]"));
        System.out.println(table1Satir3.getText());

        System.out.println();

        //    Task 3 : Son satırın verilerini yazdırın
        WebElement table2satir4 = driver.findElement(By.xpath("(//tbody)[2]//tr[4]"));
        System.out.println(table2satir4.getText());

        System.out.println();

        //    Task 4 : 5. Sütun verilerini yazdırın


        //    Task 5 : Iki parametreli bir Java metodu oluşturalım: printData


        //    Parameter 1 = satır numarası


        //    Parameter 2 = sütun numarası


        //    printData(2,3);  => 2. satır, 3. sütundaki veriyi yazdırsın.


    }
}
