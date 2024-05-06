package CodeC;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

import static org.junit.Assert.assertEquals;

public class CH05 { /*  select objesi araciligiyla metodlar kullanilir..
         1-selectByIndex() : option elementinin indexi
         2-selectByValue() : option elementinin value attribute u
         3-selectByVisibleText(): option elementinin gorunur yazisi
         //Select elementlerinde info amaciyla kullanilan methodlar
         select.getAllSelectedOptions(); -> multi selectte secili tum degerleri bize return eden methoddur.
         select.getFirstSelectedOption(); -> Secili ilk option elementini bize getirir.
         select.getOptions(); -> select elementinin tum optionlarini liste halinde return eder
         select.isMultiple(); -> select elementinin multiple secime uygun olup olmadigni bize boolean olarak return eder.
         // 1- deselectByIndex() -> option elementini index ile  kaldirir
         // 2- deselectByValue() -> option elemenini value attribute ile kaldirir
         // 3- deselectByVisibleText() -> option elementini gorunur yazisi (contenti) ile kaldirir
         // 4- deselectAll() -> Butun secimleri kaldirir.
         */
    // Navigate to  https://testpages.herokuapp.com/styled/index.html
    // Click on  Calculate under Micro Apps
    // Type any number in the first input
    // Type any number in the second input
    // Click on Calculate
    // Get the result
    // Print the result
    //Use Select class :
    //1-return all options for operators
    //2-select minus ,
//
//

    static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("disable-popup-blocking");
        options.addArguments("disable-cookies");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
    }
    @AfterAll
    public static void tearDown(){

    }


    @Test
    public void test1() throws InterruptedException {
        WebElement calculate = driver.findElement(By.xpath("//a[@id='calculatetest']"));
        calculate.click();
        Thread.sleep(3000);

        WebElement box1 = driver.findElement(By.id("number1"));
        box1.sendKeys("30");

        WebElement box2 = driver.findElement(By.id("number2"));
        box2.sendKeys("30");

        WebElement dropDown = driver.findElement(By.id("function"));
        Select select1 = new Select(dropDown);
        select1.selectByValue("minus");

        WebElement calculateButton = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculateButton.click();

        WebElement answer = driver.findElement(By.id("answer"));
        assertEquals(answer.getText(), "15");



    }

}
