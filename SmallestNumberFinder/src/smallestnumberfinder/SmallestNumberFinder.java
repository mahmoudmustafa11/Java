package smallestnumberfinder;

import javax.swing.*;

public class SmallestNumberFinder {
  public static void main(String[] args) {

    // Input three numbersئ
    double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter The First number: "));
    double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter The Second number: "));
    double num3 = Double.parseDouble(JOptionPane.showInputDialog("Enter The Third number: "));

    // Find the smallest number
    double smallestNumber = findSmallestNumber(num1, num2, num3);

    // Display the result
    JOptionPane.showMessageDialog(null, "The Smallest number is: " + smallestNumber,
            "Smallest number",JOptionPane.INFORMATION_MESSAGE);
  }
  
  // Method to find the smallest number among three numbers
  private static double findSmallestNumber(double num1, double num2, double num3) {
    double smallest = num1;

    if (num2 < smallest) {
      smallest = num2;
    }

    if (num3 < smallest) {
      smallest = num3;
    }

    return smallest;
  }
}
