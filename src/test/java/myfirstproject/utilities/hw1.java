package myfirstproject.utilities;

/*

Task2:
Go to https://testcenter.techproeducation.com/index.php?page=dropdown
1.Create method selectByIndexTest and Select Option 1 using index from Simple dropdown
2.Create method selectByValueTest Select Option 2 by value from Simple dropdown
3.Create method selectByVisibleTextTest Select Option 1 value by visible text from Simple dropdown
4.Create method printAllTest
Print all dropdown elements from State selection dropdown,
and print the size of  State selection dropdown
and Verify State selection dropdown dropdown contains Texas text
5. Create method printFirstSelectedOptionTest Print first selected option of State selection dropdown

Task3:
Create A Class:
Create A Method dropdownTest
Go to https://www.amazon.com/
Find the element of the dropdown element. HINT: By.id(“searchDropdownBox")
Print the first selected option and assert if it equals “All Departments”.If it fails, then comment that code out and continue rest of the test case.
Select the 4th option by index (index of 3) and assert if the name is “Amazon Devices”.(after you select you need to use get first selected option method). If it fails, then comment that code out and continue rest of the test case.
Print all of the dropdown options-getOptions(); method returns the List<WebElement>. Using loop, print all options.
Print the the total number of options in the dropdown
Assert if ‘Appliances’ is a drop down option. Print true if “Appliances” is an option. Print false otherwise.
BONUS: Assert if the dropdown is in Alphabetical Order

Task4:
Create a new class
Create Test method and complete the following task.
When user goes to https://www.google.com/
Search for “porcelain teapot”
And print how many related results displayed on Google

Task5:
Create a new class and create 3 different test methods using the following names. And Go to google.
titleTest =>Verify if google title = “Google”
imageTest => Verify if google image displays or not
gmailLinkTest => Verify if the Gmail link is displayed or not

 */

public class hw1 extends TestBase {

    /*
    Task2:
Go to https://testcenter.techproeducation.com/index.php?page=dropdown
 2.Create method selectByValueTest Select Option 2 by value from Simple dropdown
3.Create method selectByVisibleTextTest Select Option 1 value by visible text from Simple dropdown
4.Create method printAllTest
Print all dropdown elements from State selection dropdown,
and print the size of  State selection dropdown
and Verify State selection dropdown dropdown contains Texas text
5. Create method printFirstSelectedOptionTest Print first selected option of State selection dropdown

     */
    public void Test1(){
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");





    }

}
