package AdvancedProblems.CStar_IfStatements;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class practice3_answerkey {
    public static void main(String[] args) {
        /*
         * Every second, this code will add a random number between one and ten to a
         * list of numbers
         * If the sum of all of the numbers is divisible by three or by seven, keep the
         * number
         * Else, remove it from the list
         * 
         * Then, print the last number added to or discarded from the list,
         * and the sum of all numbers in the list.
         * 
         * Also, you are not allowed to modify lines of code that have '// *' appended
         * to them,
         * or add code outside of the while loop.
         */

        List<Integer> numberList = new ArrayList<>(); // *
        Random random_num_generator = new Random(); // *

        while (true) { // *
            numberList.add(random_num_generator.nextInt(1, 10)); // *

            Integer lastNumber = numberList.get(numberList.size() - 1);
            Integer sum = 0;

            Iterator<Integer> iterator = numberList.iterator();

            while (iterator.hasNext()) {
                sum += iterator.next();
            }

            if ((sum + lastNumber) % 3 == 0 || (sum + lastNumber) % 7 == 0) {
                System.out.println("Accepted number " + lastNumber + ", sum of list is " + sum);
            } else {
                numberList.remove(numberList.size() - 1);
                System.out.println("Rejected number " + lastNumber + ", sum of list is " + (sum - lastNumber));
            }

            try { // *
                Thread.sleep(1000); // *
            } catch (InterruptedException e) { // *
                System.out.println("oops"); // *
            } // *
        } // *
    }
}