package myfirstproject;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Day02_FirefoxTest {
    public static void main(String[] args) throws InterruptedException {
        //Create firefox driver
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();

       //open amazon home page
        driver.get("https://www.amazon.com/");

        //maximize the window
        driver.manage().window().maximize();


        //close/quit the browser
        Thread.sleep(5000);
        driver.quit();


    }


}
