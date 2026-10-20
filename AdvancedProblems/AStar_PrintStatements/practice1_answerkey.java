package AdvancedProblems.AStar_PrintStatements;

import java.util.Scanner;

public class practice1_answerkey {
    public static void main(String[] args) {
        /*
         * You know how to print Hello World ...
         * but how about printing something the user has asked for?
         * 
         * The Scanner class takes user input and is explained at
         * https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
         * 
         * Take three numbers from the user, find the least value, and print it out
         * Make sure to explain in a print line what your program does to the user!
         */

        System.out.println("Give me three numbers! Any three numbers !!!");

        Scanner input = new Scanner(System.in); // Create the scanner
        int leastNumber = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            int number = input.nextInt();

            if (number < leastNumber) {
                leastNumber = number;
            }
        }

        input.close(); // A scanner cannot be reopened after it is closed...

        System.out.println("The least number was... " + leastNumber);
    }
}
