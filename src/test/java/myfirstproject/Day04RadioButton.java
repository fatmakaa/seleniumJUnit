package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day04RadioButton extends TestBase {




    @Test
    public void radioTest() throws InterruptedException {

        //Go to the url https://testcenter.techproeducation.com/index.php?page=radio-buttons
        driver.get("https://testcenter.techproeducation.com/index.php?page=radio-buttons");

        Thread.sleep(3000);

        //Click on Red if not already checked
        WebElement red = driver.findElement(By.cssSelector("#red"));
        if (!red.isSelected()){
            red.click();
        }
        Thread.sleep(3000);

        //Click on Football if not already checked
        WebElement football = driver.findElement(By.cssSelector("#football"));
        if (!football.isSelected()){
            football.click();
        }
        Thread.sleep(3000);

        //Assertion
        Assertions.assertTrue(red.isSelected());
        Assertions.assertTrue(football.isSelected());

        Thread.sleep(3000);
    }

}
