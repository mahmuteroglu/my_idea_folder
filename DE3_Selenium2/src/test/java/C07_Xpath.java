
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C07_Xpath {
    //  format : //tagName[@attribute = 'value']
    // amazon.com sayfasında xpath practise yapıyoruz.
    // /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
    // //*[@id="twotabsearchtextbox"]
    // //*[@id="CardInstancewSz61voyybNzOgK-sDBb6Q"]/div[2]/div/a/div/div[1]/div/img
    // /html/body/div[1]/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/a/div/div[1]/div/img

    static WebDriver driver;

    @BeforeAll
    public static void beforeAll(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com/");
        if (driver.findElement(By.xpath("//*[.='Try different image']")).isDisplayed()){
            driver.findElement(By.xpath("//*[.='Try different image']")).click();
        }
    }
    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1(){
        WebElement amazonLogo1 = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
        //tag'ı a olan id attribute değeri 'nav-logo-sprites' olan webelementi bul.
        amazonLogo1.click();
    }
    @Test
    public void test2(){
        WebElement amazonLogo2 = driver.findElement(By.xpath("//a[@aria-label='Amazon']"));
        //tag'ı a olan aria-label attribute değeri 'Amazon' olan webelementi bul.
        amazonLogo2.click();
    }
    @Test
    public void test3(){
        WebElement amazonLogo3 = driver.findElement(By.xpath("//a[@class='nav-logo-link nav-progressive-attribute']"));
        //tag'ı a olan class attribute değeri 'nav-logo-link nav-progressive-attribute' olan webelementi bul.
        amazonLogo3.click();
    }
    @Test
    public void test4(){
        WebElement searchBox = driver.findElement(By.xpath("//input[@name='field-keywords']"));
        //tag'ı input olan name attribute değeri 'field-keywords' olan webelementi bul.
        searchBox.sendKeys("smart watch"+Keys.ENTER);
        //searchBox.submit();
    }
    @Test
    public void test5(){
        WebElement allButton = driver.findElement(By.id("nav-search-dropdown-card"));
        allButton.submit();
    }
}

