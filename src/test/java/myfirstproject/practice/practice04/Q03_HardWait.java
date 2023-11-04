package myfirstproject.practice.practice04;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Q03_HardWait extends TestBase {

    @Test
    public void waitTest() throws InterruptedException {

        //Go to https://testpages.herokuapp.com/styled/challenges/growing-clickable.html
    driver.get("https://testpages.herokuapp.com/styled/challenges/growing-clickable.html");

        //Click on "click me" button

        Thread.sleep(4000);
        driver.findElement(By.id("growbutton")).click();

        //Verify that "Event Triggered"

        Assertions.assertTrue( driver.findElement(By.id("growbuttonstatus")).getText().contains("Event Triggered"));


    }


}
