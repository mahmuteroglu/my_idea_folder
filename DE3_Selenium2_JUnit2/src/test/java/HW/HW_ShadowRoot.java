package HW;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HW_ShadowRoot {
    /*
    Go to https://www.teknosa.com/
    Accept cookies with javascriptexecutor and getShadowRoot() method separately.
    Do it in two methods. One method for jsexecutor and the other for getShadowRoot() method.
    Accept notification.
     */
    static WebDriver driver;

    @BeforeAll
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
        driver.get("https://www.teknosa.com/");
    }

    @Test
    public void javascriptExecutor(){

       // Kabul Et düğmesini bulmak için JavaScriptExecutor'u ve özel bir kütüphane olan "selenium-shadow-dom" kullanarak
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement acceptButton = (WebElement) js.executeScript("return document.querySelector('efilli-layout-dynamic')" +
                ".shadowRoot.querySelector(\"div[data-name='Accept Button']\")");

        // Kabul Et düğmesine tıkla
        acceptButton.click();

        WebElement tamam = driver.findElement(By.xpath("//div[starts-with(@id,'ins-ed')]"));
        tamam.click();
    }
    @Test
    public void withGetShadowRootMethod(){
        WebElement shadowHost = driver.findElement(By.tagName("efilli-layout-dynamic"));
        SearchContext shadowRoot = shadowHost.getShadowRoot();
        WebElement acceptButton = shadowRoot.findElement(By.cssSelector("div[data-name='Accept Button']"));
        acceptButton.click();

        WebElement tamam = driver.findElement(By.xpath("//div[starts-with(@id,'ins-ed')]"));
        tamam.click();
    }
}
