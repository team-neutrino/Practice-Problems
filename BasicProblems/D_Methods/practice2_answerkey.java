package BasicProblems.D_Methods;

public class practice2_answerkey {
    // Make two int variables (make them static because the method uses them, and
    // the method needs to be static because main is static)
    public static int m_number1 = 34141;
    public static int m_number2 = 1345132;

    // Make a method that returns the sum of the two numbers.
    public static int addNumbers() {
        return m_number1 + m_number2;
    }

    // Print out what is returned from the method in main.
    public static void main(String[] args) {
        System.out.println(addNumbers());
    }
}
