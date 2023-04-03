package Kafamagore;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Elif {

    WebDriver driver;
    @Before
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
//
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("https://dijitaluzmani.com/");
        Thread.sleep(1000);

        WebElement hakkizda = driver.findElement(By.xpath("//a[text()='Hakkımızda']"));
        hakkizda.click();
        Thread.sleep(1000);

        WebElement ekip = driver.findElement(By.xpath("(//span[@class='pl-2'])[2]"));
        ekip.click();
        Thread.sleep(1000);

        WebElement elif = driver.findElement(By.xpath("//img[@src='https://cdn.dijitaluzmani.com/uploads/elif-63dc2c64e89fe592217027.png']"));
        elif.click();
        Thread.sleep(4000);
        driver.close();
    }

    @Test
    public void test02() throws InterruptedException {
        driver.get("https://dijitaluzmani.com/etiketler/arama-motoru-optimizasyonu");
        driver.findElement(By.xpath("(//h6)[4]")).click();
        Thread.sleep(2000);
        System.out.println("Başarılı bir SEO için içerik üretirken dikkat edilmesi gereken en önemli nokta, sürecin SEO uyumlu olacak şekilde yürütülmesidir. Bunun için içerik üretimine başlamadan önce hedef kitle belirlenerek sektör ve rakip analizi yapılmalıdır. Örneğin “Sektörde önde gelen konular neler? Hedef kitle en çok hangi konulara ilgi duyuyor? En çok hangi sorulara cevap arıyor?” gibi kritik noktaları analiz ederek elde edilen sonuçlara uygun içerik planlaması oluşturulmalıdır. Bunun akabinde anahtar kelime araştırması gerçekleştirilmeli ve en çok rekabet alan anahtar kelimeler belirlenerek içerikte SEO uyumlu şekilde kullanılmalıdır. ");
        System.out.println("Hedef kitlenin özellikleri doğru bir şekilde analiz edilmelidir ve üretilen içeriğin beklentileri karşıladığından emin olunmalıdır. Çünkü anahtar kelime gibi teknik açılardan SEO uyumlu olacak şekilde üretilmiş olsa da eğer bir içerik kaliteli ve ilgi çekici değilse, kullanıcıya fayda sağlamıyorsa hedeflenen etkileşim ve geri dönüş alınamayabilir. Dolayısıyla kalite, özgünlük ve kullanıcıya sağlanacak fayda en az SEO’nun teknik boyutu kadar önem taşımaktadır. Oluşturulan içerik her daim kaliteli ve özgün olmalıdır. Kullanıcı odaklı içerikler üretmek hedeflenmelidir.\n" +
                "\n");
        System.out.println("Üretilen içerikte yer alan bilgiler her zaman güncel olmalı ve güncel tutulmalıdır. Yanlış, eksik ya da eski bilgiler sunulmamalıdır.\n" +
                "\n" +
                "Nicelikten ziyade nitelikli içerik üretimi önceliğimiz olmalıdır. Kaliteli içeriklerin trafik getirme olasılığı da daha yüksektir.\n" +
                "\n" +
                "İçerik başlıklarının dikkat çekici olması gerekir. Kitlenin dikkatini çekecek başlık aynı zamanda tıklanma oranını artırarak trafik sağlar.\n" +
                "\n" +
                "Yazım kurallarına özen göstermek de bir diğer önemli detaydır. Anlaşılması kolay ve yazım kurallarına uygun cümlelerle oluşturulan içeriğin sonrasında uygun görseller, özgün tasarımlar ile desteklenmesi de kullanıcıların dikkatini çekecektir.\n" +
                "\n" +
                "Ayrıca içerik üretiminde düzenli paylaşım yapmaya da dikkat etmek gerekir. Düzenli olarak içerik yayınlamanın SEO için olumlu etkisi olacağı gibi kullanıcı ve marka arasındaki sadakatin gelişmesine de katkısı olacaktır.\n" +
                "\n" +
                "Görüldüğü üzere başarılı bir SEO süreci yönetmek ve SEO’da yükselmek doğal bir süreci ve sabır gerektiren aşamaları temsil eder. İçerik üretimi de bu yolculuğu büyük ölçüde destekler. Hadi, şimdi sıra sizde!");

    }

}
