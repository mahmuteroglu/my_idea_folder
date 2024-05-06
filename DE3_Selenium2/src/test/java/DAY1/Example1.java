package DAY1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);
        driver.quit();// driver in degeri null donusur.//tüm browser kapanir.
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.close();// sadece bulundugu driver i kapatir.


        String title=driver.getTitle();
        if (title.contains("kitap")){
            System.out.println("Pass");

        }else {
            System.out.println("Fail");

        }


    }
}
