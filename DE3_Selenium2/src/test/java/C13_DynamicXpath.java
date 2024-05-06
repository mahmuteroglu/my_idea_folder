
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C13_DynamicXpath {
     /*
    interview larda dinamik eleman nedir ? ne nasıl bulursunuz ?
   Sayfa yenilendiğinde id ler veya locator lar değişiyorsa buna dinamik eleman denir.
   Aşağıdaki fonksiyonlar ile bulunur.

   Özet Bilgi
    u_0_f7
    u_1_f7
    u_2_f7
    u_3_f7
    u_4_f7
    u_6_f7

    u_ başlıyor
    _f7 bitiyor

    a[id^='u_'][id$='_f7']


    CSS de
    ^ -> ile başlayan
    $ -> ile biten
    * -> içinde geçen

    cssSelector("input[id^='u_'][id$='_b2']   cssSelector("input[id^='u_'][id$='_Wd']

    Xpath
    //a[starts-with(@id,'u_')] -> ile başlayan
    //a[ends-with(@id,'_f7')]    -> ile biten
    //a[contains(@id,'u_')]    -> içinde geçen
     */
     static WebDriver driver;

    @BeforeAll
    public static void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--accept-cookies");//çerezlerei kabul etmek için
        options.addArguments("--disable-popup-blocking");//Pop-up pencereleri engellemek için
        driver = new ChromeDriver(options);// ChromeOptions'u driver'ımıza tanıtıyoruz.
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
    }
    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }//Close driver.
    @Test
    public void test1(){
        WebElement usernameBox = driver.findElement(By.xpath("//input[starts-with(@placeholder,'E-posta')]"));
        usernameBox.sendKeys("abc@gmail.com");

        WebElement passwordBox = driver.findElement(By.xpath("//input[contains(@data-testid,'pass')]"));
        passwordBox.sendKeys("abc123");

        WebElement loginButton = driver.findElement(By.xpath("//button[contains(text(),'Yap')]"));
        loginButton.click();
    }
    @Test
    public void test2(){
        WebElement usernameBox = driver.findElement(By.xpath("//form[starts-with(@id,'u_')]//input[contains(@placeholder,'Telefon')]"));
        usernameBox.sendKeys("abc@gmail.com");

        WebElement passwordBox = driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding-sibling::div//input[@id='pass']"));
        passwordBox.sendKeys("abc123");

        WebElement loginButton = driver.findElement(By.xpath("//div[@class='_6ltg']/child::button"));
        loginButton.click();
    }
}
// //div[@id='reg_pages_msg']/preceding-sibling::div//input[@id='pass']