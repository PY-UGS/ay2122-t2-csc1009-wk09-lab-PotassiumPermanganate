package com.T9;

import java.util.Random;

public class RandomGen {

    public static char getRandomLowerCaseLetter() {
        Random rand = new Random();
        int randInt = rand.nextInt(97, 123);
        return (char)randInt;
    }

    public static char getRandomUpperCaseLetter() {
        Random rand = new Random();
        int randInt = rand.nextInt(65, 91);
        return (char)randInt;
    }

    public static char getRandomDigitCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(48, 58);
        return (char)randInt;
    }

    public static char getRandomCharacter() {
        Random rand = new Random();
        int randInt = rand.nextInt(1, 4);
        switch (randInt) {
            case 1:
                return getRandomDigitCharacter();

            case 2:
                return getRandomLowerCaseLetter();

            case 3:
                return getRandomUpperCaseLetter();

            default:
                return 'a';
        }
    }

    public static void main(String[] args) {
        System.out.println("Generate fifteen random characters in random lower case character between ‘a’ and ‘z’.");
        for(int i=0;i<15;i++){
            System.out.print(RandomGen.getRandomLowerCaseLetter()+" ");
        }

        System.out.println("\nGenerate fifteen random characters in random upper case character between ‘A’ and ‘Z’.");
        for(int i=0;i<15;i++){
            System.out.print(RandomGen.getRandomUpperCaseLetter()+" ");
        }

        System.out.println("\nGenerate fifteen random characters in random digit number between ‘0’ and ‘9’.");
        for(int i=0;i<15;i++){
            System.out.print(RandomGen.getRandomDigitCharacter()+" ");
        }
        System.out.println("\nGenerate fifteen random characters.");
        for(int i=0;i<15;i++){
            System.out.print(RandomGen.getRandomCharacter()+" ");
        }
    }
}
