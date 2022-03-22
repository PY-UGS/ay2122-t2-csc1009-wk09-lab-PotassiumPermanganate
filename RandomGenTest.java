package com.T9;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static  org.junit.Assert.*;

public class RandomGenTest {
    @Test
    public void testGetRandomLowerCaseLetter() {
        char test_data = RandomGen.getRandomLowerCaseLetter();
        char test_data2 = RandomGen.getRandomLowerCaseLetter();

        // check value
        assertTrue(test_data >= 'a' & test_data <= 'z');
        assertTrue(test_data2 >= 'a' & test_data2 <= 'z');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomUpperCaseLetter() {
        char test_data = RandomGen.getRandomUpperCaseLetter();
        char test_data2 = RandomGen.getRandomUpperCaseLetter();

        // check value
        assertTrue(test_data >= 'A' & test_data <= 'Z');
        assertTrue(test_data2 >= 'A' & test_data2 <= 'Z');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomDigitCharacter() {
        char test_data = RandomGen.getRandomDigitCharacter();
        char test_data2 = RandomGen.getRandomDigitCharacter();

        // check value
        assertTrue(test_data >= '0' & test_data <= '9');
        assertTrue(test_data2 >= '0' & test_data2 <= '9');
        // check random
        assertNotEquals(test_data, test_data2);
    }

    @Test
    public void testGetRandomCharacter() {
        char[] test_data = {RandomGen.getRandomCharacter(),
            RandomGen.getRandomCharacter()};

        // check value
        for (char test: test_data) {
            boolean condition1 = (test >= '0' & test <= '9');
            boolean condition2 = (test >= 'A' & test <= 'Z');
            boolean condition3 = (test >= 'a' & test <= 'z');
            assertTrue((condition1 || condition2 || condition3));
        }

        // check random
        assertNotEquals(test_data[0], test_data[1]);
    }

    @Test
    public void testPrime() {
        int digit = Character.digit(RandomGen.getRandomDigitCharacter(), 10);
        assertTrue(digit >= 0);
        System.out.println("Checking if: " + digit + "" + " is prime");

        boolean isPrime = false;
        for (int i = 2; i < digit; i++) {
            if (i == 0) {break;};
            if (digit % i == 0) {
                isPrime = true;
                break;
            }
        }
        assertTrue(!isPrime);

    }



    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(RandomGenTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

        System.out.println(result.wasSuccessful());
    }

}
