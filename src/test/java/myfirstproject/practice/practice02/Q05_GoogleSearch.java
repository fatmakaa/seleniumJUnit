package myfirstproject.practice.practice02;

import io.github.bonigarcia.wdm.WebDriverManager;
import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q05_GoogleSearch {


    /*
     Create driver and go to http://www.google.com in the BeforeEach method
     With 3 different test methods:
      -Type "Desktop" in the search box and search it
      -Type "Smartphone" in the search box and search it
      -Type "Laptop" in the search box and search it
     NOTE: Print the result numbers in AfterEach method
     Close driver with AfterEach method
      */
//Create driver and go to http://www.google.com in the BeforeEach method
    WebDriver driver;
    @BeforeEach
   public void setUp(){

       WebDriverManager.chromedriver().setup();
       driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://www.google.com");


       }

       //-Type "Desktop" in the search box and search it

       @Test
    public void Test1(){

        driver.findElement(By.name("q")).sendKeys("Desktop", Keys.ENTER);



       }



    @Test
    public void Test2(){

        driver.findElement(By.name("q")).sendKeys("Smartphone",Keys.ENTER);


    }



    @Test
    public void Test3(){

        driver.findElement(By.name("q")).sendKeys("Laptop",Keys.ENTER);

    }

    @AfterEach
    public void afterMethod(){
        //Print the result numbers in AfterEach method
     String result =  driver.findElement(By.id("result-stats")).getText();
        System.out.println("result = " + result);
       String numOfResult = result.split(" ")[1];
        System.out.println("numOfResult = " + numOfResult);
        driver.quit();
    }



}

