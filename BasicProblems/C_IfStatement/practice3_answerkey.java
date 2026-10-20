package BasicProblems.C_IfStatement;

public class practice3_answerkey {
    public static void main(String[] args) {
        // Make a double variable
        double m_bankAccount = 0.02;
        // Make 3 if statements that compare that variable to a value and print out
        // something if that comparison is true (use >, <, and ==)
        if (m_bankAccount > 0) {
            System.out.println("Not in debt");
        }
        if (m_bankAccount < 0) {
            System.out.println("In debt");
        }
        if (m_bankAccount == 0) {
            System.out.println("No money");
        }
    }
}
