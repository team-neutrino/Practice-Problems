package BasicProblems.D_Methods;

public class practice3_answerkey {
    // Make a method that prints out a name, age, and balance, but the name, age,
    // and balance are determined through paramters and user input
    public static void printPerson(String name, int age, double balance) {
        System.out.println("My name is " + name + ". I am " + age + " years old. My balance is $" + balance + ".");
    }

    // Run it in main
    public static void main(String[] args) {
        printPerson("John", 17, 100.3);
    }
}