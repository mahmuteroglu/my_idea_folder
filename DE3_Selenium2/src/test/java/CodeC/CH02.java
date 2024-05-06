package CodeC;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class CH02 {/*
  1-Navigate to page: https://www.ikea.com/
    And verify title: contains Welcome
  2-Navigate to page:https://www.ikea.com/global/en/newsroom/
    And verify title: contains "Newsroom"
  3-Navigate back:https://www.ikea.com/
    verify title:contains Welcome
  4-Navigate forward:https://www.ikea.com/global/en/newsroom/
    verify title: contains "Newsroom"
  5-Refresh page:
    verify title: contains "Newsroom"
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
//        driver.quit();
    }

    @Test
    public void test1() {
        driver.navigate().to("https://www.ikea.com/");
        assertTrue(driver.getTitle().contains("Welcome"));

        driver.navigate().to("https://www.ikea.com/global/en/newsroom/");
        assertTrue(driver.getTitle().contains("Newsroom"));

        driver.navigate().back();
        assertTrue(driver.getTitle().contains("Welcome"));

        driver.navigate().forward();
        assertTrue(driver.getTitle().contains("Newsroom"));

        driver.navigate().refresh();
        assertTrue(driver.getTitle().contains("Newsroom"));


    }
}
