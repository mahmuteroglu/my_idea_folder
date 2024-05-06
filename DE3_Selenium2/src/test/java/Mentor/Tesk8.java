package Mentor;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static Mentor.Task3.driver;


public class Tesk8 {
    private Actions actions;


    //Goto:https://www.garantibbva.com.tr/krediler/kredi-hesaplama
    //Test PAGE DOWN,PAGE UP
    //Hover to Krediler Menu(not click())
    //Locate "Bonus Flaşh" and click

    @Test
    public void dragSliderXaxe() throws InterruptedException {

        driver.get("https://www.garantibbva.com.tr/krediler/kredi-hesaplama");
        WebElement slider = driver.findElement(By.xpath("(//div[@class=' rangeSlider__handle rangeSlider__handle__horizontal'])[1]"));

        //Shift 100 units to the right and 100 units to the left on the horizontal axis.
        actions.dragAndDropBy(slider,30,0).perform();//saga ilerlettik cubuktaki imleci. Yatay sürükleme.
        Thread.sleep(1000);
        actions.dragAndDropBy(slider,150,0).perform();//sola ilerlettik cubuktaki imleci.


}}
