package CodeC;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class CH03 {


    /*
       1- go to https://the-internet.herokuapp.com/geolocation
       2- Before get browser coordinate and write
       3- Click "Where I am buttun"
       4- Get your coordinate write
       5- Then click " See it on Google "
       6- Verify your coordinate in map
        */

    static WebDriver driver;

    @BeforeAll
    public static void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void test() throws InterruptedException {
        driver.navigate().to("https://the-internet.herokuapp.com/geolocation");
        System.out.println(driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getSize());
        WebElement button = driver.findElement(By.xpath("//button[@onclick='getLocation()']"));
        button.click();
        Thread.sleep(3000);
        WebElement longv = driver.findElement(By.xpath("//div[@id='long-value']"));
        WebElement latv = driver.findElement(By.xpath("//div[@id='lat-value']"));
        System.out.println(longv.getText());
        Thread.sleep(3000);
        System.out.println(latv.getText());
        Thread.sleep(3000);

        WebElement button2 = driver.findElement(By.xpath("//*[@id='map-link']/a"));
        button2.click();
        Thread.sleep(3000);

        WebElement konumBilgisi = driver.findElement(By.xpath("//span[@class='DUwDvf lfPIob']"));
        System.out.println(konumBilgisi.getText());
    }
}
