package Mentor;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Mentor.Tesk4.driver;

public class Tesk6 {


    // Goto https://selenium08.blogspot.com/2020/01/click-and-hold.html
    //Click and hold C letter
    //Locate Search Box click and hold after release()

    @Test
    public void test() {
        // Goto https://selenium08.blogspot.com/2020/01/click-and-hold.html
        driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");

        if (driver.findElement(By.xpath("//*[.='Ok']")).isDisplayed()) {
            driver.findElement(By.xpath("//*[.='Ok']")).click();
        }

        //Click and hold C letter
        WebElement searchBox = driver.findElement(By.xpath("//*[@class='search-expand-text']"));
        Actions actions = null;
        actions.clickAndHold(searchBox).release().perform();


        //Locate Search Box click and hold after release()
    }
}


