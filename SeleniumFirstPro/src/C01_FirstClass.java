import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_FirstClass {


    // When starting with Selenium, we first need to specify which driver to use.
// We'll communicate with the browser via the driver.




    public static void main(String[] args)throws InterruptedException {
        // We need to create our driver object
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        driver.get("https://www.google.com/");

        Thread.sleep(3000);
        WebDriver driver1=new EdgeDriver();
        driver1.get("https://www.amazon.com/");

        WebDriver driver2=new FirefoxDriver();
        driver.get("https://www.google.com/");

        driver.close();
        driver1.close();
        driver2.close();

        driver.get("https://www.google.com/");
    }

    }


