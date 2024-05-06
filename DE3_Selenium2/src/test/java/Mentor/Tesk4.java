package Mentor;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class Tesk4 {



    //Goto home https://www.n11.com/ //Locate "Tümünü kabul et"



    static WebDriver driver;
    //Goto page https://authenticationtest.com/
    //Click Basic HTTP/NTLM Authentication
    //user: user   pass:pass use authentication
    //verify success login
    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://authenticationtest.com/");

    }

    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath("//*[.='HTTP/NTLM Auth']"));
        button.click();
        driver.get("https://user:pass@authenticationtest.com/HTTPAuth/");
        WebElement verify = driver.findElement(By.xpath("//*[.='Login Success']"));
        assertTrue(verify.isDisplayed());


    }
}

