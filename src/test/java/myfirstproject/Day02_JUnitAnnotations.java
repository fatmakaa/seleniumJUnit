package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day02_JUnitAnnotations {

        /*
        1. @Test : This is used to create TEST CASES...
        This is one of the most common annotation that we will use
        Note: All test methods should be void

        2. @BeforeAll and @AfterAll runs only once before or after each CLASS

        3. @BeforeAll and @AfterAll runs only once before or after each METHOD

        4. @Disabled is used to ignore or skip a test case


         */


    @BeforeAll
    public static void setUpClass(){    //static
        System.out.println("Before All...");
    }

    @AfterAll
    public static void tearDownClass(){  //static
        System.out.println("After All...");
    }

    @BeforeEach
    public void setUpMethods(){
        System.out.println("Before Each...");
    }

    @AfterEach
    public void tearDownMethods(){
        System.out.println("After Each...");
    }



        @Test
        public void test1() {
            System.out.println("Test Case 1...");
        }

        @Test
        public void test2() {
            System.out.println("Test Case 2...");
        }

        @Test
        public void test3() {
            System.out.println("Test Case 3...");
        }

        @Test @Disabled
        public void test4() {
            System.out.println("Test Case 4...");
        }

        @Test
        public void test5() {
            System.out.println("Test Case 5...");
        }

        @Test
        public void test6() {
            System.out.println("Test Case 6...");
        }

    public static class Day04_Dropdown extends TestBase {
        /*
        -How to select from a dropdown?
        3 ways to select a dropdown option: index, value, visibleText
        -How to get selected option from a dropdown?
        getFirstSelectedOption
         */

        @Test
        public void dropdownTest(){

            driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

            //2001 september 13

            //1.locate the dropdown element
            WebElement year = driver.findElement(By.id("year"));

            //2. create a select object
            Select selectYear = new Select(year);

            //3. now that we have select object, we can interact with this dropdown element
            selectYear.selectByVisibleText("2001"); //selecting by visible text


            // select the months
            WebElement months = driver.findElement(By.id("month"));
            Select selectMonths = new Select(months);
            selectMonths.selectByIndex(8); //selecting by index (index starts at 0)


            // SELECTING THE 9. MONTH USING REUSABLE METHOD
            dropdownSelectByIndex(driver.findElement(By.id("month")),9);
            dropdownSelectByIndex(driver.findElement(By.xpath("//select[@id='month']")),8);
            dropdownSelectByIndex(By.id("month"),0);
            dropdownSelectByIndex("//select[@id='month']",0);

            //select the days
            WebElement days = driver.findElement(By.id("day"));
            Select selectDays = new Select(days);
            selectDays.selectByValue("13"); //selecting by value

           //Assert if 2001 is selected
            WebElement selectedYear = selectYear.getFirstSelectedOption(); //getting the selected options
            System.out.println(selectedYear.getText()); //getting the text of the selected year
            Assertions.assertTrue(selectedYear.getText().equals("2001")); //asserting if selected test is as expected


            //get all the months and assert if April is an option in the month dropdown
           List<WebElement> allMonths = selectMonths.getOptions();

           boolean isAprilExist = false;
            for (WebElement eachMonth:allMonths) {
                System.out.println(eachMonth.getText());
                if (eachMonth.getText().equals("April")){
                    isAprilExist=true;
                }
            }


            Assertions.assertTrue(isAprilExist);



        }

    }
}



