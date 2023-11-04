package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day05_IFrames extends TestBase {

  //  Given Go to https://testpages.herokuapp.com/styled/frames/frames-test.html
//  Then Assert that "Left List Item 29" is the last element in the "Left"
//   And Assert that "Middle List Item 39" is the last element in the "Middle"

    @Test
    public void iframes(){

        //  Given Go to https://testpages.herokuapp.com/styled/frames/frames-test.html
        driver.get("https://testpages.herokuapp.com/styled/frames/frames-test.html");

        //  Then Assert that "Left List Item 29" is the last element in the "Left"
        //"Left List Item 29" IS INSIDE THE IFRAME SO SWITCH TO THAT FRAME FIRST

        /*
       NOTE 1: there are 3 ways to switch to a frame: index, id/name, web-element
        1.with web element  driver.switchTo().frame(By.xpath("//frame[@name='left']"));
        2.with index driver.switchTo().frame(1)
        3.with name driver.switchTo().frame("left")

        NOTE 2: when you want tı switch to non child such as sibling frames, we should go to parent then the child,
        we can not jump directly to siblings.

         */

        driver.switchTo().frame("left");


        // li[last()] this xpath returns the last "li" element.//now we are in side of the frame
        String lastElement =  driver.findElement(By.xpath("//li[@id='left29']")).getText();
        System.out.println("lastElement = " + lastElement);
        Assertions.assertTrue(lastElement.equals("Left List Item 29"));


        // And Assert that "Middle List Item 39" is the last element in the "Middle"
        // to go to sibling frames, switch to the parent first, then switch to the child

       // driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();  //switching to the main html page

        driver.switchTo().frame("middle"); //switching to the middle frame

       String middleLastItem =  driver.findElement(By.xpath("//li[last()]")).getText(); //driver is in the middle frame and getting that middle frame elements

       Assertions.assertTrue(middleLastItem.equals("Middle List Item 39"));














    }


}
