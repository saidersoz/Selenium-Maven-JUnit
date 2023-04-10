package Day14_FakerClass_FileExist;

import Utilities.TestBase;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileDownloadTest extends TestBase {

    @Test
    public void fileDownload() {
        //https://testcenter.techproeducation.com/index.php?page=file-/download    adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");
        File silinecekDosya = new File("C:\\Users\\ASUS/Downloads/b10 all test cases, code.docx");
        silinecekDosya.delete();

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.xpath("//*[text()='b10 all test cases, code.docx']")).click();
        bekle(2);

        //Dosyanın başarıyla indirilip indirilmediğini test edelim
        //ILK OLARAK DOSYA YOLUNU ALIYORUZ
        String dosyaYolu = System.getProperty("user.home")+"/Downloads/b10 all test cases, code.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        silinecekDosya.delete();
    }
}
