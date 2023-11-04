package myfirstproject.practice.practice05;


import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Q05_ActionsClass extends TestBase {
       /*
    Given
        Go to https://www.facebook.com/
    When
        Click on "Create New Account"
    And
        Fill all the boxes by using keyboard actions class

    Note: Do not use any locator.
     */

    @Test
    public void test() {
//        Go to https://www.facebook.com/
        driver.get("https://facebook.com/");

//        Click on "Create New Account"
//        Fill all the boxes by using keyboard actions class
        Actions actions = new Actions(driver);

        actions
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER).pause(500)
                .sendKeys("John")
                .sendKeys(Keys.TAB)
                .sendKeys("Doe")
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys("John.123")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("25")
                .sendKeys(Keys.TAB)
                .sendKeys("Jul")
                .sendKeys(Keys.TAB)
                .sendKeys("1999")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

    }

}