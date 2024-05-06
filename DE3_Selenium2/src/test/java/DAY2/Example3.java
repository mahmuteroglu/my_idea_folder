package DAY2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.navigate().to("www.yahoo.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.navigate().to("www.amazon.com");

    }
    }
