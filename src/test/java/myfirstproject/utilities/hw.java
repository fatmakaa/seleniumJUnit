package myfirstproject.utilities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

import static myfirstproject.utilities.TestBase.driver;

public class hw extends TestBase {


      /*

       https://testcenter.techproeducation.com/index.php?page=dropdown
       Create a new test method: stateTest in this class
       Then print the total number of states from the dropdown
       Then print all the state names
       Select 'Texas' opting using one of the method
       Assert if Texas is selected or not
       Then check is the state names are in alphabetical order (THIS WILL FAIL B/C STATE LIST IS NOT IN ALPHABETICAL)

     */


    //       Create a new test method: stateTest in this class

    @Test
    public void stateTest(){

        //https://testcenter.techproeducation.com/index.php?page=dropdown

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        //Then print the total number of states from the dropdown
        WebElement states = driver.findElement(By.id("state"));
        Select selectState = new Select(states);


        // Then print all the state names
        List<WebElement> allStates = selectState.getOptions();
        for (WebElement eachState:allStates){
            System.out.println(eachState.getText());
        }


        //Select 'Texas' option using one of the method

        selectState.selectByVisibleText("Texas");



        // Assert if Texas is selected or not

        WebElement selectedState = selectState.getFirstSelectedOption();
        System.out.println("selectedState= " + selectedState.getText());
        Assertions.assertTrue(selectedState.getText().equals("Texas"));


        // Then check is the state names are in alphabetical order (THIS WILL FAIL B/C STATE LIST IS NOT IN ALPHABETICAL)






    }

    /*
  When Navigate to https://testpages.herokuapp.com/styled/windows-test.html
When Click on "Alerts In A New Window From JavaScript"
And Switch to new window
And Click on "Show alert box" button
And Accept alert
And Click on "Show confirm box" button
And Cancel alert
Then Assert that alert is canceled
When Click on "Show prompt box" button
And Send "Hello World!" to the alert
Then Assert that "Hello World!" is sent
     */


    @Test
    public void alertHw() throws InterruptedException {

   //   When Navigate to https://testpages.herokuapp.com/styled/windows-test.html
   driver.get("https://testpages.herokuapp.com/styled/windows-test.html");


   //When Click on "Alerts In A New Window From JavaScript"
        driver.findElement(By.id("goalerts")).click();

      //And Switch to new window
       String window1Handle =  driver.getWindowHandle();
        System.out.println("window1Handle = " + window1Handle);

        Set<String> allWindowHandles = driver.getWindowHandles();
        System.out.println(allWindowHandles);

        for (String eachHandle : allWindowHandles){
            if (!eachHandle.equals(window1Handle)){
                driver.switchTo().window(eachHandle);
                break;

            }

        }

        Thread.sleep(3000);

        String window2Handle = driver.getWindowHandle();
        System.out.println("window2Handle = " + window2Handle);

         String title =  driver.getTitle();  //kinda make sure that im on the right page
        System.out.println("title = " + title);


        //And Click on "Show alert box" button
        driver.findElement(By.xpath("//input[@id='alertexamples']")).click();


        //And Accept alert

        Thread.sleep(3000);
        driver.switchTo().alert().accept();



        //And Click on "Show confirm box" button

        driver.findElement(By.xpath("//input[@id='confirmexample']")).click();


       // And Cancel alert
        driver.switchTo().alert().dismiss();

        //Then Assert that alert is canceled
       Assertions.assertTrue("You clicked Cancel, confirm returned false.".contains(driver.findElement(By.xpath("//p[@id='confirmexplanation']")).getText()));


       Thread.sleep(2000);
        //When Click on "Show prompt box" button
        //And Send "Hello World!" to the alert
        driver.findElement(By.xpath("//input[@id='promptexample']")).click();

        driver.switchTo().alert().sendKeys("Hello World!");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();



        //Then Assert that "Hello World!" is sent
       Assertions.assertTrue("You clicked OK. 'prompt' returned Hello World!".equals(driver.findElement(By.id("promptexplanation")).getText()));



    }


    /*
    HOMEWORK : Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
     */





 /*
 HOMEWORK : Print country, capitol key value pairs as map object()
        create a map
        then use a loop to add key value pains in the map
        use the pattern of indexes
        String countries = sheet1.getRow(row number).getCell(0).toString
        String capitals = sheet1.getRow(row number).getCell(1).toString
        add this to the map
        then print
        {greece = athens, Canada= Ottowa,...}
  */


    /*
    Create a class:
Create a test method : contextClickMethod() and test the following scenario:
Given user is on the https://testcenter.techproeducation.com/index.php?page=context-menu
When use Right clicks on the box
Then verify the alert message is “You selected a context menu”
Then accept the alert
     */


}
