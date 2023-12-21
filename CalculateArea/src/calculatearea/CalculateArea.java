/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatearea;

import java.util.Scanner;

/**
 *
 * @author Z
 */
public class CalculateArea {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      // إنشاء كائن من فئة Scanner لقراءة الإدخال من المستخدم
        Scanner input = new Scanner(System.in);

        // طلب طول ضلع المربع من المستخدم
        System.out.print("الرجاء إدخال طول ضلع المربع: ");
        int side = input.nextInt();

        // حساب مساحة المربع
        int areaOfSquare = side * side;

        // طباعة مساحة المربع
        System.out.println("مساحة المربع: " + areaOfSquare);

        // طلب طول وعرض المستطيل من المستخدم
        System.out.print("الرجاء إدخال طول المستطيل: ");
        int length = input.nextInt();

        System.out.print("الرجاء إدخال عرض المستطيل: ");
        int width = input.nextInt();

        // حساب مساحة المستطيل
        int areaOfRectangle = length * width;

        // طباعة مساحة المستطيل
        System.out.println("مساحة المستطيل: " + areaOfRectangle);
  }
}
