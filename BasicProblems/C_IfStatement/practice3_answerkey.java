package BasicProblems.C_IfStatement;

public class practice3_answerkey {
    public static void main(String[] args) {
        // Make a double variable
        double m_bankAccount = 0.01;
        // Make an else if statement that compares that value and prints out something
        // based on which condition is met
        if (m_bankAccount > 50.0) {
            System.out.println("You're rich!");
        } else if (m_bankAccount > 15.0) {
            System.out.println("You're not poor");
        } else {
            System.out.println("You might be poor");
        }
    }
}
