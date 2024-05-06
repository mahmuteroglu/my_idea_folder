
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class C16_ChromeOptions {
    /*
 ChromeOptions Class

Selenium WebDriver'da Chrome sürücüsünün çeşitli özelliklerini değiştirmek için kullanılan bir kavramdır.
start-maximized: Chrome'u büyütme modunda açar.
incognito: Chrome'u gizli modda açar.
headless: Chrome'u görüntülenmeyen modda çalıştırır.(headless modda)
disable-extensions: Chrome tarayıcısında mevcut uzantıları devre dışı bırakır.
disable-popup-blocking: Chrome tarayıcısında görüntülenen açılır pencereleri devre dışı bırakır.
make-default-browser: Chrome'u varsayılan tarayıcı yapar.
version: Chrome tarayıcı sürümünü yazdırır.
disable-cookies: çerezleri bloke eder.
disable-infobars: Chrome'un "Chrome otomatik yazılım tarafından kontrol ediliyor" bildirimini görüntülemesini engeller.
 */
    static WebDriver driver;

    @BeforeAll
    public static void setup() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-cookies");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://www.bestbuy.com");
        Thread.sleep(3000);
    }
    @AfterAll
    public static void tearDown(){
        driver.close();
    }//Close driver.
    @Test
    public void test(){

    }
}
