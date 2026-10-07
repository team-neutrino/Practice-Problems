package AdvancedProblems.BStar_Variables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class practice2_answerkey {
    public static void main(String[] args) {
        /*
         * You probably think variables are too good for you by this point, don't you?
         * But did you know you can store more than one value inside of a variable?
         * 
         * Even if you do, it'll be good for you to learn how to do it inside of Java
         * 
         * Spin up the old scanner again, and ask the user for their name
         * Then map their name in a HashMap to a List of capital I Integers
         * Afterward, ask the user in an infinite loop for a number to add to their List
         * Print out the list each iteration
         */

        HashMap<String, List<Integer>> userMap = new HashMap<String, List<Integer>>();

        @SuppressWarnings("resource")
        Scanner inputReader = new Scanner(System.in);

        System.out.println("What is your name?");
        String answer = inputReader.next();

        userMap.put(answer, new ArrayList<>());

        while (true) {
            System.out.println("Give me a number!");

            Integer num = Integer.valueOf(inputReader.nextInt());
            List<Integer> array = userMap.get(answer);

            array.add(num);

            System.out.println(answer + " Your numbers are " + array.toString());
        }
    }
}
