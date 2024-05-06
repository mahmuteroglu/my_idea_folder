
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class C21_DropDown2 {
    /*
    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Old Style Select Menu using the element id.
    Print all the options of the dropdown.
    Select 'Purple' using the index.
    After that, select 'Magenta' using visible text.
    Select an option using value.
    Close the browser.
 */
    static WebDriver driver;

    @BeforeAll
    public static void setup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://demoqa.com/select-menu");
    }
    @AfterAll
    public static void tearDown() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }//Close driver.

    @Test
    public void test() throws InterruptedException {
        WebElement dropDown1 = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(dropDown1);

        List<WebElement> optionList = select.getOptions();

        for(WebElement option : optionList){
            System.out.println("Option: "+option.getText());
        }

        select.selectByIndex(4); //purple seçimi için index 4'ü yazdık.
        assertTrue(select.getFirstSelectedOption().getText().contains("Purple"));

        Thread.sleep(3000);

        select.selectByVisibleText("Magenta"); //magenta seçimi için visible text magenta yazdık.
        assertTrue(select.getFirstSelectedOption().getText().contains("Magenta"));

        Thread.sleep(3000);

        select.selectByValue("5"); //black seçimi için value "5" yazdık.
        assertTrue(select.getFirstSelectedOption().getText().contains("Black"));
    }
}

