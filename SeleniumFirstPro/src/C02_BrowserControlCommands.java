import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_BrowserControlCommands {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();


        driver.get("https://www.google.com/");

        String googleTitle= driver.getTitle();
        System.out.println(googleTitle);

        String googleURL= driver.getCurrentUrl();
        System.out.println(googleURL);

        String googlePageSource= driver.getPageSource();
        System.out.println(googlePageSource);
    }
}
