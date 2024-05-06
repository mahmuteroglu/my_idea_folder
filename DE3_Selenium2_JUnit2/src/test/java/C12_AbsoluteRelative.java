
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C12_AbsoluteRelative {
    /*
    Go to URL: https://opensource-demo.orangehrmlive.com/
    Locate the username, password, login button using absolute xpath and relative xpath.
    */
    static WebDriver driver;

    @BeforeAll
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
    @AfterAll
    public static void tearDown(){
        driver.close();
    }//Close driver.

    @Test
    public void absoluteXpath(){
        WebElement username = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        WebElement passwordBox = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));

    }

    @Test
    public void relativeXpath(){
        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement passwordBox = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

    }
}
