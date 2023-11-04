package myfirstproject;


import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Day11_TimeOutException extends TestBase {
    @Test
    public void timeoutExceptionTest(){
        driver.get("https://www.amazon.com/");
//        WebElement searchBox = driver.findElement(By.xpath("//input[@id=' twotabsearchtextbox']")); // wrong locator => NoSuchElementException
//        searchBox.sendKeys("iPhone 15");
        // using explicit wait with the webElement that is not located properly
        WebElement searchBox = waitForVisibility(By.xpath("//input[@id=' twotabsearchtextbox']"), 10); // TimeoutException because of wrong locator + timeout issue
        searchBox.sendKeys("iPhone 15");
    }
}