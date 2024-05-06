import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserControlCommands {
    /*
Selenium automates browsers. That's it!
What you do with that power is entirely up to you.
 */

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        //getTitle() returns the title of the current tab. It returns a String.
        String googleTitle = driver.getTitle();
        System.out.println(googleTitle);

        //getCurrentURL() returns the URL of the current tab. It returns a String.
        String googleURL = driver.getCurrentUrl();
        System.out.println(googleURL);

        // getPageSource() retrieves the source HTML code of the current page. It returns a String.
        String googlePageSource = driver.getPageSource();
        System.out.println(googlePageSource);

        driver.quit();
    }
}
