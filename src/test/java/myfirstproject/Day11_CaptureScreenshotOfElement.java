package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Day11_CaptureScreenshotOfElement extends TestBase {
    /*
    When user goes to the application home page techproeducation
    Then verify the logo is displayed
     */
    @Test
    public void captureScreenshotOfElementsTest(){
//        Given user is on https://techproeducation.com/
        driver.get("https://techproeducation.com/");
        waitFor(1);
//       Then verify the logo is displayed
        WebElement logo = driver.findElement(By.xpath("//img[@alt='TechPro Education']"));
        waitFor(1);
        captureScreenshotOfElement(logo);
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        searchBox.sendKeys("Testing");
        waitFor(1);
        captureScreenshotOfElement(searchBox);
    }
}
