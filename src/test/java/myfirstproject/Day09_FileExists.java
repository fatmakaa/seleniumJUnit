package myfirstproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Day09_FileExists {
    @Test
    public void fileExistsTest(){

     //Class: FileExistTest
	//Method: isExist
	//Pick a file on your desktop

        String pathOfFlower = System.getProperty("user.home") +"/Downloads/flower.jpeg";
        System.out.println(pathOfFlower);
	//And verify if that file exist on your computer or not
        boolean isFlowerExists =   Files.exists(Paths.get(pathOfFlower)); //checking if the path exists
        Assertions.assertTrue(isFlowerExists);


    }
}
