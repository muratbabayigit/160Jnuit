package day01;

import org.junit.jupiter.api.*;

public class P03_notasyon {

    //Bütün testler çalışmadan önce bir kere çalışmasını isteğim testin notasyonu BeforeAll
    // Genelde ayarlamalar için kullanılır

    @BeforeAll
    public static void setUp(){
        System.out.println("Testlerin çalıştırılması başlıyor\n");
    }
     //Tüm testler bittikten sonra bir kere çalışmasını istediğimiz kodları AfterAll ile ifade ederiz
    @AfterAll
    public static void tearDown(){
        System.out.println("\nTüm testler çalıştırılmıştır");
    }

    //Her bir testten önce çalışmasını istediğimiz kodlar için @BeforeEach notasyonu kullanılır
    @BeforeEach
    public void beforeTest(){
        System.out.println("Sıradaki test çalıştırılıyor....");
    }
    //Her bir testten sonra istediğimiz kodların çalıştırılması için @AfterEach notasyonu kullanılır
    @AfterEach
    public void afterTest(){
        System.out.println("Test Tamamalandı\nDiğer teste geçiliyor...\n");
    }

    @Test
    public void test01(){
        System.out.println("Test 01 Çalıştı");
    }

    @Test
    public void test02(){
        System.out.println("Test 02 Çalıştı");
    }

    @Test
    public void test03(){
        System.out.println("Test 03 Çalıştı");
    }
}
