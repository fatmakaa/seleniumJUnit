package myfirstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02VerifyTitleTest {
    public static void main(String[] args) {

       // WebDriverManager.chromedriver().setup();   //No need to use this anymore.
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Navigate to amazon homepage
        driver.get("https://www.amazon.com/");

        //Verify if page title contains "Amazon"
        String actualTitle =  driver.getTitle(); //returns the page title as String
        System.out.println("PAGE TITLE: " +actualTitle);

        if (actualTitle.contains("Amazon")){
            System.out.println("PASSED");
        }else {
            System.out.println("FAILED");
            System.out.println("Actual Title: " + actualTitle + "doesn't contain expected title: Amazon");
            System.out.println("Expected Title : Amazon");
        }

         driver.quit();



    }

}
