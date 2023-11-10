package heartratecalculator;
import java.util.Scanner;

public class HeartRateCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get the user's age and resting heart rate
        System.out.print("Enter your age in years: ");
        int age = scanner.nextInt();

        System.out.print("Enter your resting heart rate: ");
        double restingHeartRate = scanner.nextDouble();

        // Calculate the heart rate during aerobic training
        double trainingHeartRate = 0.7 * (220 - age) + 0.03 * restingHeartRate;

        // Display the result
        System.out.println("Your heart rate during aerobic training is: " + trainingHeartRate + " beats per minute");

        scanner.close();
    }
}
