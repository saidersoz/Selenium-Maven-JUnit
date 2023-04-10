package Day14_FakerClass_FileExist;

import Utilities.TestBase;
import com.github.javafaker.Faker;
import org.junit.Test;

public class C02_Faker extends TestBase {

    @Test
    public void faker() {
        //1. Faker objesi oluşturunuz
        Faker faker = new Faker();

        //Yada Faker.instance() methodu ile de kullanabiliriz
        //Faker.instance();

        //firstname yazdıralım
        System.out.println("Fake First name : " + faker.name().firstName());
        System.out.println(Faker.instance().name().firstName());

        //Last name yazdırın
        System.out.println("Fake Last name : " + Faker.instance().name().lastName());

        //Kullanıcı adı yazdırlaım
        System.out.println("Fake User name : " + Faker.instance().name().username());

        //Meslek ismi yazdıralım
        System.out.println(faker.job().position());

        //şehir ismi yazdıralım
        System.out.println(faker.address().city());

        //ülke ismi yazdıralım
        System.out.println(faker.address().country());

        //adress ismi yazdıralım
        System.out.println(faker.address().fullAddress());

        //rastgele 15 haneli bir numara
        System.out.println(faker.number().digits(15));
        System.out.println(Faker.instance().internet().emailAddress());
    }


}
