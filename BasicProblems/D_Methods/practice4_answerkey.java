package BasicProblems.D_Methods;

public class practice4_answerkey {
    // Make a method that inputs a number and it prints if it is even or odd
    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Run it in main
    public static void main(String[] args) {
        evenOrOdd(9);
    }
}
