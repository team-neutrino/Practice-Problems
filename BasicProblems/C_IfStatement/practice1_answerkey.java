package BasicProblems.C_IfStatement;

public class practice1_answerkey {
    public static void main(String[] args) {
        // Make a double variable
        double m_decimal = 0.02;
        // Make 3 if statements that compare that variable to a value and print out
        // something if that comparison is true (use >, <, and ==)
        if (m_decimal > 0) {
            System.out.println("This number is positive");
        }
        if (m_decimal < 0) {
            System.out.println("This number is negative");
        }
        if (m_decimal == 0) {
            System.out.println("This number is zero");
        }
    }
}
