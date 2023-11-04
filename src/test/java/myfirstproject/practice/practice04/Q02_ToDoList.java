package myfirstproject.practice.practice04;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;

/*
  Given
      Go to http://webdriveruniversity.com/To-Do-List/index.html
  When
      Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
  And
      Strikethrough all todos.
  And
      Delete all todos.
  Then
      Assert that all todos deleted.
*/
public class Q02_ToDoList extends TestBase {
    @Test
    public void listTest() throws InterruptedException {
        //Go to http://webdriveruniversity.com/To-Do-List/index.html
        driver.get(" http://webdriveruniversity.com/To-Do-List/index.html");


       //Add todos: (Prepare breakfast, Wash the dishes, Take care of baby, Help your kid's homework, Study Selenium, Sleep)
     WebElement input  = driver.findElement(By.xpath("//input"));
     List<String> todos = new ArrayList<>(Arrays.asList("Prepare breakfast", "Wash the dishes", "Take care of baby," ,"Help your kid's homework", "Study Selenium", "Sleep"));

     for (String each: todos){
         input.sendKeys(each+Keys.ENTER);
     }



     //Strikethrough all todos.
     List<WebElement> todoList = driver.findElements(By.xpath("//li"));
     todoList.forEach(WebElement::click); //Lambda is recommended


      // Delete all todos.

      driver.findElements(By.xpath("//i[@class='fa fa-trash']")).forEach(WebElement::click);


      //  Assert that all todos deleted.
        //To handle the synchronization issue we need to put a little wait
        Thread.sleep(3000);
        assertTrue(driver.findElements(By.xpath("//li")).isEmpty());




    }

}
