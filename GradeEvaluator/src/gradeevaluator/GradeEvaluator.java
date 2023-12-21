package gradeevaluator;
import javax.swing.*;

public class GradeEvaluator {
  public static void main(String[] args) {
    
        // Input the student's grade
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Enter the student's grade: "));

        // Evaluate the grade and print the appropriate sentence
        if (grade >= 80) {
            JOptionPane.showMessageDialog(null, "Excellent");
        } else if (grade >= 70) {
            JOptionPane.showMessageDialog(null, "Good");
        } else if (grade >= 50) {
            JOptionPane.showMessageDialog(null, "Fair");
        } else {
            JOptionPane.showMessageDialog(null, "Fail");
        }
  }
}
