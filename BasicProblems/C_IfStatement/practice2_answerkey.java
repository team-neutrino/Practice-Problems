package BasicProblems.C_IfStatement;

public class practice2_answerkey {
    public static void main(String[] args) {
        // Make two variables of different types
        int m_number = 5;
        boolean m_false = false;
        // Make an if statement that compares both of the variables to values and prints
        // something out if they are both true
        if (m_false == true && m_number == 9) {
            System.out.println("Both conditions are met");
        }
        // Make an if statement that compares both of the variables to value and prints
        // something out if at least one of them are true
        if (m_false == false || m_number == 9) {
            System.out.println("At least one of these conditions are met");
        }
    }
}
