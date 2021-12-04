package IntroToUnitTest;

import static org.testng.Assert.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class IntroToUnitTest {

    int numOne = 200;
    int numTwo = 200;

    String key = "KeyValue";
    String value = "Some Value";

    double[] numberListOne = {12.99, 24.99, 53.99};
    double[] numbersListTwo = {12.99, 24.99, 53.99};

    IntroToUnitTest obj;

    @AfterTest
    public void testCleanUp(){
        System.out.println("This is before test case");
    }

    @BeforeTest
    public void testSetup(){
        obj = new IntroToUnitTest();

    }


//    IntroToUnitTest obj = new IntroToUnitTest();


    //How do I check if both variable has same value or not

//    public static void main(String[] args) {
//        IntroToUnitTest obj = new IntroToUnitTest();
//        if (obj.numOne == obj.numTwo) {
//            System.out.println(true);
//
//        }

    @Test(invocationCount = 3)
    public void testNumbers(){

        assertEquals(obj.numOne,numTwo);
        System.out.println("This is the test case to verify the number");
    }


    @Test
    public void testForString(){
        assertNotEquals(obj.key, obj.value);
    }

    @Test
    public void testForArray(){
        assertEquals(obj.numberListOne, obj.numbersListTwo);
    }
    }
