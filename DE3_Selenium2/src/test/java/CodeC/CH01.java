package CodeC;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CH01 {

     /*
    * driver.get() Methodlari
-  driver.get(String Url);     String olarak girilen Url’e gider
-  driver.getTitle();          Icinde olunan sayfanin basligini String olarak getirir
-  driver.getCurrentUrl();     Icinde olunan sayfanin Url’ini String olarak getirir
-  driver.getPageSource();     Icinde olunan sayfanin kaynak kodlarini String olarak getirir */
    /*
    //opening the target website https://www.ikea.com/
    //set expected title contains "Welcome"
    //using getTitle() to retrieve actual title.
    //get currentUrl text
    //get pageSource
     */
    //close driver


    static WebDriver driver;
    @BeforeAll
    public static void beforeAll(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.ikea.com/");
    }
    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1(){
        String ikeaTitle = driver.getTitle();
        System.out.println(ikeaTitle);
        System.out.println(ikeaTitle);
        assertTrue(driver.getTitle().contains("Welcome"));


        String ikeaURL = driver.getCurrentUrl();,ui.öläüü< +

        System.out.println(ikeaURL);

        String ikeaPageSource = driver.getPageSource();
        System.out.println(ikeaPageSource);
    }
}
