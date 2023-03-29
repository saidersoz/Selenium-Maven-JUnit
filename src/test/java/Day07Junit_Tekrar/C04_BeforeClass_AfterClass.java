package Day07Junit_Tekrar;

import org.junit.*;

public class C04_BeforeClass_AfterClass {

    /*
    @BeforeClass VE @AfterClass notasyonları sadece static method'lar ile çalışır.
     */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Tüm testlerden önce bir kez çalışır");
        System.out.println("==========");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Tüm testlerden sonra bir kez çalışır");
        System.out.println("==========");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her Testten önce 1 kez çalışır");
        System.out.println("==========");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her Testten sonra 1 kez çalışır");
        System.out.println("==========");
    }

    @Test
    public void test01() {
        System.out.println("İlk Test");
        System.out.println("==========");
    }

    @Test
    public void test02() {
        System.out.println("İkinci Test");
        System.out.println("==========");
    }

    @Test
    public void test03() {
        System.out.println("Ücüncü Test");
        System.out.println("==========");
    }
}

