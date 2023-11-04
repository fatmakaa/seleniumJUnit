package myfirstproject.practice.practice01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Q01_Navigate {
    /*
     Set Driver Path
     Create chrome driver object
     Maximize the window
     Open google home page https://www.google.com/
     Navigate to techproeducation home page https://techproeducation.com/
     Navigate back to google
     Navigate forward to techproeducation
     Refresh the page
     Close/Quit the browser
     And last step : print "ALL OK" on console
*/

    public static void main(String[] args) throws InterruptedException {

 //    Set Driver Path
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");

//     Create chrome driver object
       ChromeDriver driver = new ChromeDriver();

 //     Maximize the window
        driver.manage().window().maximize();

 //     Open google home page https://www.google.com/
        Thread.sleep(2000);
        driver.get("https://google.com/");


 //     Navigate to techproeducation home page https://techproeducation.com/
        Thread.sleep(2000);
        driver.get(" https://techproeducation.com/");

//      Navigate back to google
        Thread.sleep(2000);
        driver.navigate().back();

 //       Navigate forward to techproeducation
        driver.navigate().forward();


 //      Refresh the page
        driver.navigate().refresh();

 //     Close/Quit the browser
        driver.quit();

 //     And last step : print "ALL OK" on console

        System.out.println("ALL OK");



    }





}
