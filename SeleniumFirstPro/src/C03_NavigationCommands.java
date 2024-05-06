import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigationCommands {
    public static void main(String[] args) {

        // Creating a WebDriver object

        WebDriver driver = new ChromeDriver();

// Opening Google website
        driver.get("https://www.google.com/");

// Opening Stack Overflow website
        driver.get("https://stackoverflow.com/");

// NAVIGATION COMMANDS

// back() opens the previous page
        driver.navigate().

                back(); // Chrome

// forward() opens the next page after going back
        driver.navigate().

                forward(); // Stack Overflow

// refresh() refreshes the page
        driver.navigate().

                refresh(); // Stack Overflow

// to() - performs the same function as the get() method
        driver.navigate().

                to("https://www.linkedin.com/");

        driver.quit();

    }


}

