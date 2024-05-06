import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_BeforeAllAfterAll {
    static WebDriver driver;

    @BeforeAll
    public static void beforeAll(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("beforeAll metodu çalıştı.");
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://www.youtube.com/");
        Thread.sleep(2000);
    }
    @Test
    public void test2() throws InterruptedException {
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("afterAll metodu çalıştı.");
        driver.quit();
    }
}
