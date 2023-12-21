/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heartratecalculator11;
import java.util.Scanner;
/**
 *
 * @author Z
 */
public class HeartRateCalculator11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
 
    Scanner scanner = new Scanner(System.in);
    System.out.print("أدخل عمرك");
    int age = scanner.nextInt();
    System.out.print("أدخل شدة التدريب");
    int intensity = scanner.nextInt();
    int targetRate = (int) (0.7 * (220 - age) + (0.03 * intensity));
    System.out.print("معدل ضربات القلب" + targetRate );

  }
}
