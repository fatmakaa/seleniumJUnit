package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Set;

public class Day05_Windows extends TestBase {
    /*
    Given Go to https://the-internet.herokuapp.com/windows
    Assert if the window 1 title equals “The Internet”
    Click on the link
    Assert if the window 2 title equals “New Window”
    Switch back to window 1 title and assert if URL contains “windows”
    And assert if the URL doesn't contain 'new
     */



    @Test
    public void window() throws InterruptedException {

       //Given Go to https://the-internet.herokuapp.com/windows

        driver.get("https://the-internet.herokuapp.com/windows");

        //Assert if the window 1 title equals “The Internet”

        Assertions.assertTrue(driver.getTitle().equals("The Internet"));


        //Click on the link
        driver.findElement(By.xpath("//a[.='Click Here']")).click();


        //Assert if the window 2 title equals “New Window”
        /*
        NOTE: you can not get ONLY WINDOW 2 HANDLE
        NOTE: we must switch window 2 to get window title
         */


        String window1Handle =  driver.getWindowHandle();
        System.out.println(window1Handle);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
               driver.switchTo().window(eachHandle);
               break;
            }

        }

        // NOW DRIVER IS ON THE WINDOW 2
        Thread.sleep(3000);

        Assertions.assertTrue(driver.getTitle().equals("New Window"));
        String window2Handle = driver.getWindowHandle();




      //  Switch back to window 1 title and assert if URL contains “windows”

        driver.switchTo().window(window1Handle);
        Assertions.assertTrue(driver.getCurrentUrl().contains("windows"));


      //  And assert if the URL doesn't contain 'new'

        Assertions.assertFalse(driver.getCurrentUrl().contains("new"));


        //Switch back to window 2
        driver.switchTo().window(window2Handle);
        Thread.sleep(3000);

        //Switch back to window 1
        driver.switchTo().window(window1Handle);


    }

    @Test
    public void windowsTestWithReusableMethods() throws InterruptedException {

        //Given Go to https://the-internet.herokuapp.com/windows

        driver.get("https://the-internet.herokuapp.com/windows");

        //Assert if the window 1 title equals “The Internet”

        Assertions.assertTrue(driver.getTitle().equals("The Internet"));


        //Click on the link
        driver.findElement(By.xpath("//a[.='Click Here']")).click();


        //Assert if the window 2 title equals “New Window”
        /*
        NOTE: you can not get ONLY WINDOW 2 HANDLE
        NOTE: we must switch window 2 to get window title
         */


        switchNewWindowByIndex(1); //switching window 2(index=1)

        // Alternatively we can switch by title
       // switchNewWindowByTitle("New Window");



        // NOW DRIVER IS ON THE WINDOW 2
        Thread.sleep(3000);

        Assertions.assertTrue(driver.getTitle().equals("New Window"));
        String window2Handle = driver.getWindowHandle();

        //  Switch back to window 1(index=0) title and assert if URL contains “windows”

        switchNewWindowByIndex(0);

        Assertions.assertTrue(driver.getCurrentUrl().contains("windows"));

        //  And assert if the URL doesn't contain 'new'

        Assertions.assertFalse(driver.getCurrentUrl().contains("new"));

        //Switch back to window 2
        switchNewWindowByIndex(1);
        Thread.sleep(3000);

        //Switch back to window 1
        switchNewWindowByIndex(0);




    }






}
