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

public class Day03_xpath_css {
    WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @Test
    public void xpath_css(){

        //login the aplication
         driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        //username

       WebElement username =  driver.findElement(By.xpath("//input[@name='username']"));
       username.sendKeys("Admin");

       //password
         WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
         password.sendKeys("admin123");

        //submit button xpath:  ("//button[@type='submit']")); ---- css:"button[type='submit']"
        WebElement button = driver.findElement(By.cssSelector("button[type='submit']"));
        button.click();

        //Assert login is successful
        Assertions.assertTrue(driver.getCurrentUrl().contains("dashboard"));


    }

    @AfterEach
    public void tearDown(){
        driver.quit();
    }

}
