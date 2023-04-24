package Day20_Excel;

import org.apache.poi.ss.usermodel.*;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class C01_ExcelRead {

    @Test
    public void excelReadTest1() throws IOException {
        /*
            Capitals.xlsx dosyasından 1. satır 2. sütundaki hücreyi yazdırın
            3. Satır 1. sütun değerini yazdırın ve "France" olduğunu test edin
            Kullanılan satır sayısın bulun
            Ülke-Başkent şeklinde verileri yazdırın
        */
        //Excel dosyasından bir veri okuyabilmemiz için;
        //      1-Dosya yolunu alırız
        String dosyaYolu = "src/test/java/Resources/Capitals.xlsx";

        //      2-Dosyayı okuyabilmek için akışa almam gerekir
        FileInputStream fis = new FileInputStream(dosyaYolu);

        //      3-Java ortamında bir excel dosyası oluşturmamız gerekir
        Workbook workbook = WorkbookFactory.create(fis); //create fis ile excel'de bu dosyayı okuruz.

        //      4-Sayfayı(Sheet) seçmemiz gerekir
        Sheet sheet = workbook.getSheet("Sheet1");

        //      5-Satır(Row) seçmemiz gerekir
        Row row = sheet.getRow(0); //1.SATIR ÇÜNKÜ İNDEX 0 DAN BAŞLAR.
        //      6-Hücreyi(Cell) seçmemiz gerekir
        Cell cell = row.getCell(0); //1.SÜTUN ÇÜNKÜ İNDEX 0 DAN BAŞLAR.

        System.out.println(cell);
    }
}
