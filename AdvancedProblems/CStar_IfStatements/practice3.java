package AdvancedProblems.CStar_IfStatements;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class practice3 {
    public static void main(String[] args) {
        /*
         * Every second, this code will add a random number between one and ten to a
         * list of numbers
         * If the sum of all of the numbers is still divisible by three, keep the number
         * Else, remove it from the list
         * 
         * Then, print the last number added to or discarded from the list,
         * and the sum of all numbers in the list.
         * 
         * Also, you are not allowed to modify lines of code that have '// *' appended
         * to them
         */

        List<Integer> numberList = new ArrayList<>(); // *
        Random random_num_generator = new Random(); // *

        while (true) { // *
            numberList.add(random_num_generator.nextInt(1, 10)); // *

            // code here

            try { // *
                Thread.sleep(1000); // *
            } catch (InterruptedException e) { // *
                System.out.println("oops"); // *
            } // *
        } // *
    }
}