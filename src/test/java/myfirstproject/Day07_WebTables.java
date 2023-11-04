package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/*
        https://the-internet.herokuapp.com/tables
Create a class: WebTables
Task 1 : Print the entire table
Task 2 : Print All Rows
Task 3 : Print Last row data only
Task 4 : Print column 5 data in the table body

 */


public class Day07_WebTables extends TestBase {

    @Test
    public void webtablesTest() throws InterruptedException {

        Thread.sleep(2000);
        driver.get("https://the-internet.herokuapp.com/tables");
        Thread.sleep(2000);

        //Task 1 : Print the entire table
        System.out.println("***ENTIRE TABLE");
        String entireTable =  driver.findElement(By.xpath("//table[@id='table1']")).getText();
        System.out.println(entireTable);

        //ALTERNATIVELY
        List<WebElement> elementList = driver.findElements(By.xpath("//table[@id='table1']//td"));
        for (WebElement eachELement: elementList) {
            System.out.println(eachELement.getText());
        }


        //Assert if the last element in the table 1 is "edit delete"

        System.out.println("*****TASK2*****");
       // Task 2 : Print All Rows

        List<WebElement> allRows  = driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowNum=1;
        for (WebElement eachRow: allRows) {
            System.out.println("Row " +rowNum+ "=>>" + eachRow.getText());
            rowNum++;
        }
        System.out.println("*****TASK3*****");

       //Task 3 : Print Last row data only
        System.out.println("Last row : " + allRows.get(allRows.size()-1).getText());


        System.out.println("*****TASK4*****");

        //Task 4 : Print column 5 data in the table body

      List<WebElement> fifthColumn = driver.findElements(By.xpath("//table[@id='table1']//tr//td[5]"));
       for (WebElement each: fifthColumn){
           System.out.println( each.getText());

       }



    }


    public static void rowAndColumn(int row,int column){

        return;
    }
/*


HOMEWORK : Task 5 : Write a method that accepts 2 parameters
Parameter 1 = row number
Parameter 2 = column number
printData(2,3);  => prints data in 2nd row 3rd column
         */




}
