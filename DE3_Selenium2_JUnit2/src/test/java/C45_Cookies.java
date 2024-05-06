
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utils.TestBase;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C45_Cookies extends TestBase {
    //***Cookie cookie  = driver.manage().cookie-methods

    //Go to URL: https://kitchen.applitools.com/ingredients/cookie
    //Print all the cookies.
    //Get Cookie named protein.
    //Find the total number of cookies.
    //Add Cookie.
    //Edit Cookie.
    //Delete Cookie.
    //Delete All Cookies.
    @Test
    public void test1() {
        driver.get("https://kitchen.applitools.com/ingredients/cookie");

    }
}

