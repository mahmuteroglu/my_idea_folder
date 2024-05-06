package test;

import utilities.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class C14_XMLFile_ParameterTest extends TestBase {
    //Go to URL: https://www.amazon.com
    //Search words: Java, Selenium
    //Assert get text result test that the result text contains the searched Word.
    //Run tests from XML file.

    @Test
    public void test1(){

        //Go to URL: https://www.amazon.com
        driver.get("https://amazon.com");
        //Search words: Java, Selenium
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));

    }

}
