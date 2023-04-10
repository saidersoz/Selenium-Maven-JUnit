package Day14_FakerClass_FileExist;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {

    @Test
    public void fileExist() {
        //Masa üstünde bir dosya oluşturalım
        //Bu dosyanın varlığını doğrulayalım
        System.out.println(System.getProperty("user.dir")); //C:\Users\ASUS\IdeaProjects\B129SeleniumMavenJunit
        //projemizin içinde bulunduğu yolu verir

        System.out.println(System.getProperty("user.home")); //C:\Users\ASUS
        //Localimizde ki kullanıcı yolunu verir

        //String dosyaYolu = "\"C:\\Users\\ASUS\\OneDrive\\Masaüstü\\Batch129.txt\"";
        String farkliKisim = System.getProperty("user.home");//Her kullanıcının ana yolu farklı olduğuğu için farklı kısım dedik
        String ortakKisim  = "\\OneDrive\\Masaüstü\\Batch129.txt";//Aynı yerde oluşturulduğu için ortakKısım dedik
        String dosyaYolu = farkliKisim+ortakKisim;//Dosya yolu olarak farkliKisim ve ortakkisimi aldık

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu))); //Files.exists methodu ile dosyanın varlığını doğruladık
    }
}
