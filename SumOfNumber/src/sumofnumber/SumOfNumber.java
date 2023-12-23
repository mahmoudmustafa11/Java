package sumofnumber;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, sum, rest ;
        char result;
        
        do {        
            System.out.print("Enter the number : ");
            num = scanner.nextInt();
            sum = 0;

            while (true) {
                rest = num % 10;
                sum = sum + rest;
                num = num / 10;
                if (num == 0) {
                    break;
                }
            }
            System.out.println("Sum of digits: " + sum);
            
            System.out.print("Do you want to enter another number? (Y/N): ");
            result = scanner.next().charAt(0);

        } while (result == 'Y' || result == 'y');
        
        scanner.close();
    }    
}
