package myfirstproject.practice.practice05;


import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Q02_ClickTypes extends TestBase {
    //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
    //Click all the buttons and verify they are all clicked

    @Test
    public void test() {

        //Go to https://testpages.herokuapp.com/styled/events/javascript-events.html
        driver.get("https://testpages.herokuapp.com/styled/events/javascript-events.html");

        //Click all the buttons and verify they are all clicked
        WebElement onblur = driver.findElement(By.id("onblur"));
        WebElement onclick = driver.findElement(By.id("onclick"));
        WebElement oncontextmenu = driver.findElement(By.id("oncontextmenu"));
        WebElement ondoubleclick = driver.findElement(By.id("ondoubleclick"));
        WebElement onfocus = driver.findElement(By.id("onfocus"));
        WebElement onkeydown = driver.findElement(By.id("onkeydown"));
        WebElement onkeyup = driver.findElement(By.id("onkeyup"));
        WebElement onkeypress = driver.findElement(By.id("onkeypress"));
        WebElement onmouseover = driver.findElement(By.id("onmouseover"));
        WebElement onmouseleave = driver.findElement(By.id("onmouseleave"));
        WebElement onmousedown = driver.findElement(By.id("onmousedown"));

        Actions actions = new Actions(driver);

        actions
                .click(onblur)
                .click(onclick)//This click will trigger onblur
                .click(onclick)//This click will trigger onclick
                .contextClick(oncontextmenu)//Right click on mouse
                .doubleClick(ondoubleclick)
                .click(onfocus)
                .click(onkeydown)
                .sendKeys(Keys.SPACE)//To trigger onkeydown button we need to press any button after click
                .click(onkeyup)
                .sendKeys(Keys.SPACE)//To trigger onkeyup button we need to press and release any button after click
                .click(onkeypress)
                .sendKeys(Keys.SPACE)//To trigger onkeypress button we need to press any button after click
                .moveToElement(onmouseover)//To trigger onmouseover, moving mouse on it is enough. No need to click.
                .moveToElement(onmouseleave)//To move mouse on onmouseleave will not trigger it. After move we need to move mopuse somewhere else.
                .click(onmousedown)//This click will trigger onmouseleave
                .click(onmousedown)//This click will trigger onmousedown
                .perform();


        //Verify they are all clicked
        int numOfClicks = driver.findElements(By.xpath("//p[.='Event Triggered']")).size();
        assertEquals(11, numOfClicks);

    }
}