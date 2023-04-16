package Day18_ScreenShot_ExtentReport;

import Utilities.TestBase;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;

public class C04_ExtentsReportTest extends TestBase {
    ExtentReports extentReports; //Raporlamayı Başlatır
    ExtentHtmlReporter extentHtmlReporter; //Raporu HTML formatında düzelir
    ExtentTest extentTest; //Tüm test aşamalarında extentTest objesi ile bilgi veririz
    @Test
    public void extentReportTest() {
        /*
        EXTENTREPORT kullanabilmemiz için
            1-pom.xml dosyasına extentreports dependency'si eklenir.
            2-ExtentReports class'ından bir obje oluştrulur.
            3-HTML formatında düzenleneceği için ExtentHtmlReporter class'ından obje oluşturulur.
            4-Rapora test ile ilgili bilgiler girebilmek için ExtentTest class'ından bir obje oluşturulur.
         */


    }
}
