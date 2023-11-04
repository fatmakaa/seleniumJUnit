package myfirstproject;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class Day04_JavaFaker {
    /*
    Java faker can be used to get some fake test data
     -Where do you get your test data?
        -BA (Writes the acceptance criteria)
        -Test leads
        -Manual Tester
        -Developer
        -Team lead
        - Database call
        -API calls
        -JAVA FAKER > randomly generates data

     */

    @Test
    public void fakerTest(){
        Faker faker = new Faker();
        String firstname = faker.name().firstName();

        System.out.println(firstname);

        //last name
        System.out.println(faker.name().lastName());

        //title
        System.out.println(faker.name().title());

        //city
        System.out.println(faker.address().city());

        //state
        System.out.println(faker.address().state());

        //address
        System.out.println(faker.address().fullAddress());

        //email
        System.out.println(faker.internet().emailAddress());

        //phone number
        System.out.println(faker.phoneNumber().cellPhone());

        //random digit number
        System.out.println(faker.number().digits(10));

        //random number in between
        System.out.println(faker.number().numberBetween(100000,200000));




    }

}
