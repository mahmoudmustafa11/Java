package zakatcalculator;
import javax.swing.*;

public class ZakatCalculator {

  public static void main(String[] args) {
    

        // Input the amount of money
        double amount = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount of money in pounds: "));

        // Check if the amount is above the Zakat threshold
        if (amount >= 85000) {
            // Calculate Zakat (2.5% of the amount)
            double zakat = 0.025 * amount;

            // Display the Zakat amount
            JOptionPane.showMessageDialog(null, "The Zakat amount is: " + zakat + " pounds");
        } else {
            // Amount is below the Zakat threshold
            JOptionPane.showMessageDialog(null, "Zakat is not paid as the amount is below 85 thousand pounds.");
        }

  }
}
