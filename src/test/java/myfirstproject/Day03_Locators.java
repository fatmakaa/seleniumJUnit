package myfirstproject;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Day03_Locators {
    WebDriver driver;

    @BeforeEach //runs before each test method
    public void setup(){
     driver = new ChromeDriver();//creating driver
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); //implicit wait


    }

    @Test
    public void locators(){
         // When user goes to : https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // And enter username
        driver.findElement(By.name("username")).sendKeys("Admin");

        // And enter password
        driver.findElement(By.name("password")).sendKeys("admin123");

        //  And click on submit button
      WebElement button =  driver.findElement(By.tagName("button"));
      button.click();

        // Then verify the login is successful


      /*
      1. using URL
       https://opensource-demo.orangehrmlive.com/web/index.php/auth/login > before login
       https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index  > after login
      If login is successful then current URL should contain dashboard OR
      If login is successful then current URL should not contain auth

     2. ALTERNATIVELY using a core element
      We can locate the profile element (or any other unique element on that page)
      And check if that element is displayed using isDisplayed() method


     NOTE: One of the bellow assertions is enough
      */

        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));

        Assertions.assertFalse(driver.getCurrentUrl().contains("auth"));

        Assertions.assertTrue(driver.findElement(By.className("oxd-userdropdown-name")).isDisplayed()); //profile part


         // Then logout the application  > click on the profile > click on logout

        driver.findElement(By.className("oxd-userdropdown-name")).click();
        driver.findElement(By.linkText("Logout")).click();//linkText accepts exact match
        // driver.findElement(By.partialLinkText("Logout")).click(); //partialLink accepts substring or exact match



          // Then verify the logout is successful

        /*
        If logout is successful then current URL should contain auth keyword
         */


        Assertions.assertTrue(driver.getCurrentUrl().contains("auth"));


    }

 @AfterEach
    public void tearDown(){
        driver.quit();
  }

}
