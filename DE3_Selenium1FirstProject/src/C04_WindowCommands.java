import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_WindowCommands {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        System.out.println("sayfanın pozisyonu: " + driver.manage().window().getPosition());
        System.out.println("sayfanın ölçüleri: " + driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().minimize();
        System.out.println("sayfanın pozisyonu: " + driver.manage().window().getPosition());
        System.out.println("sayfanın ölçüleri: " + driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().fullscreen();
        System.out.println("sayfanın pozisyonu: " + driver.manage().window().getPosition());
        System.out.println("sayfanın ölçüleri: " + driver.manage().window().getSize());
        Thread.sleep(5000);

        driver.quit();
    }
}
