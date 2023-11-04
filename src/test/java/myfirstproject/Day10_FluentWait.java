package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day10_FluentWait extends TestBase {

    @Test
    public void fluentWaitTest(){
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']//button")).click();
//       1. create fluent wait object
     //   Wait<WebDriver> wait = new FluentWait<>(driver)
       //         .withTimeout(Duration.ofSeconds(20))//max timeout
        //       .pollingEvery(Duration.ofSeconds(3))//time interval-check every 3 second
        //        .withMessage("Ignoring no Such Element Exception")//custom message
         //       .ignoring(NoSuchElementException.class);//ignore this exception
//      2. rest is the same as explicit wait
       // WebElement helloWorld = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']//h4")));
       // Assertions.assertEquals("Hello World!",helloWorld.getText());



    //with resuable method
      WebElement helloWorld =   fluentWait("//div[@id='finish']//h4",20,3);
    Assertions.assertEquals("Hello World!",helloWorld.getText());
    }
}