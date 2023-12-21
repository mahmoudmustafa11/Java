package calculatenumbers;
import java.util.Scanner;


public class CalculateNumbers {
  public static void main(String[] args) {
    // إنشاء كائن من فئة Scanner لقراءة الإدخال من المستخدم
        Scanner input = new Scanner(System.in);

        // طلب رقمين من المستخدم
        System.out.print("الرجاء إدخال الرقم الأول: ");
        int number1 = input.nextInt();

        System.out.print("الرجاء إدخال الرقم الثاني: ");
        int number2 = input.nextInt();

        // حساب الناتج
        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;

        // طباعة الناتج
        System.out.println("المجموع: " + sum);
        System.out.println("الفرق: " + difference);
        System.out.println("الضرب: " + product);
        System.out.println("القسمة: " + quotient);

  }
  
}
