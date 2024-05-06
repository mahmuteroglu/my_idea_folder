import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_SetPositionSetSize {
    /*
 Go to the Amazon URL : https://www.amazon.com/
 Print the position and size of the page.
 Adjust the position and size of the page as desired.
 Test that the page is in the position and size you want.
 Close the page.
*/
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        System.out.println("sayfanın pozisyonu: " + driver.manage().window().getPosition());
        System.out.println("sayfanın ölçüleri: " + driver.manage().window().getSize());

        driver.manage().window().maximize();

        //Pozisyon ve size'ı ayarla.
        driver.manage().window().setPosition(new Point(80,50));
        driver.manage().window().setSize(new Dimension(800,600));

        System.out.println("sayfanın pozisyonu: " + driver.manage().window().getPosition());
        System.out.println("sayfanın ölçüleri: " + driver.manage().window().getSize());

        int xCoordinate=driver.manage().window().getPosition().getX();
        int yCoordinate=driver.manage().window().getPosition().getY();
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();

        if(xCoordinate==80&&yCoordinate==50&&width==800&&height==600){
            System.out.println("Test PASSED");

        }else System.out.println("Test FAILED");
        System.out.println();

        System.out.println((xCoordinate==80 && yCoordinate==50 && width==800 && height==600)? "passed" : "failed");

        //Thread.sleep(3000);

        //driver.quit();

        Thread.sleep(3000);


        //driver.quit();
    }
}
