package myfirstproject;

import myfirstproject.utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class Day10_RobotClass extends TestBase {
    @Test
    public void fileUploadTest(){
        driver.get("https://www.grammarly.com/plagiarism-checker");

        driver.findElement(By.xpath("//div[@id='sectionGrammarCheck_4VB8kepvT7ciShVSz6rHX']//span[@class='iconWrapper_PbRSndwM']")).click();


        //Then select a doucemnt and upload that file
        String path = System.getProperty("user.home")+"/Users/fatmakarmis/Desktop/samplefile.docx \n";

        uploadFile(path);

    }
}
