package day01;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_aramaTesti {
    static WebDriver driver;
    static WebElement searchbox;
    static WebElement toolsButton;
    static String filmAdi;
     /*
        BeforeAll ile driver'i oluşturun ve class icinde static yapin
        Maximize edin ve 10 sn bekletin
        her biri için https://www.aol.com/ adresine gidin ilgili aramayı yapıp cikan sonuc sayisini yazdirin
        1-arama kutusuna "12 Angry Men” yazip aratın
        2-arama kutusuna "Vizontele” yazip aratın
        3-arama kutusuna "Saving Private Ryan” yazip aratın
        AfterAll ile kapatin.
     */
    @BeforeAll
    public static void setUp(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

    @BeforeEach
    public void beforeTest(){
        driver.get("https://www.aol.com/");
        searchbox= driver.findElement(By.id("header-form-search-input"));
    }

    @AfterEach
    public void afterTest(){
        //toolsButton=driver.findElement(By.id("hdtb-tls"));
        //toolsButton.click();
        String result=driver.findElement(By.xpath("//span[@class=' fz-13']")).getText(); //getText() bir elementin içindeki yazıyı string yapar
        System.out.println(filmAdi+" filmi ile iligli arama sonucunda "+result+" sonuc bulundu\n");


    }

    @Test
    public void test01(){
        filmAdi="12 Angry Men";
        searchbox.sendKeys(filmAdi+ Keys.ENTER);
    }

    @Test
    public void test02(){
        filmAdi="Vizontele";
        searchbox.sendKeys(filmAdi+ Keys.ENTER);
    }

    @Test
    public void test03(){
        filmAdi="Saving private ryan";
        searchbox.sendKeys(filmAdi+ Keys.ENTER);
    }

}
