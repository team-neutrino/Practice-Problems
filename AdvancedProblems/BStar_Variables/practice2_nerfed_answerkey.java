package AdvancedProblems.BStar_Variables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class practice2_nerfed_answerkey {
    public static void main(String[] args) {
        /*
         * You probably think variables are too good for you by this point, don't you?
         * But did you know you can store more than one value inside of a variable?
         * 
         * Even if you do, it'll be good for you to learn how to do it inside of Java
         * 
         * Create a List of capital I Integers
         * Ask the user in an infinite loop for a number to add to their List
         * Print out the list each iteration
         */

        @SuppressWarnings("resource")
        Scanner inputReader = new Scanner(System.in);
        List<Integer> array = new ArrayList<>();

        while (true) {
            System.out.println("Give me a number!");

            Integer num = Integer.valueOf(inputReader.nextInt());

            array.add(num);

            System.out.println("Your numbers are " + array.toString());
        }
    }
}
