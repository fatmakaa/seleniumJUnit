package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Day09_FileUpload extends TestBase {
    @Test
    public void fileUploadTest(){

     /*
     •Class Name: FileUploadTest
	•Method Name: fileUploadTest
	•When user goes to https://testpages.herokuapp.com/styled/file-upload-test.html
	•When user selects an image from the desktop
	•And click on the upload button
	•Then verify the ‘You uploaded a file. This is the result.’ Message displayed
      */

    driver.get("https://testpages.herokuapp.com/styled/file-upload-test.html ");


   WebElement choseFile =  driver.findElement(By.id("fileinput"));
   String pathOfFlower = System.getProperty("user.home") +"/Downloads/flower.jpeg";
   choseFile.sendKeys(pathOfFlower);
   choseFile.click();


    }
}
