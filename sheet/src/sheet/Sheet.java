/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sheet;

/**
 *
 * @author Z
 */
public class Sheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2
        calculateRectangle();
        System.out.println("------------------------------------------------");
        calculateSquare();
        System.out.println("------------------------------------------------");
        calculateCircle();
        System.out.println("------------------------------------------------");
        calculateTriangle();
    }
    
    public static void calculateRectangle() {
        double length = 5;
        double width = 14;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Rectangle area: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    public static void calculateSquare() {
        double side = 6;

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("Square area: " + area);
        System.out.println("Perimeter of the square: " + perimeter);
    }

    public static void calculateCircle() {
        double radius = 2.5;

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Circle area: " + area);
        System.out.println("Perimeter of the circle: " + circumference);
    }

    public static void calculateTriangle() {
        double base = 3;
        double height = 6;

        double area = (base * height) / 2;
        System.out.println("Triangle area: " + area);
    }
    
}
// 1
        /*int num1 , num2 , num3;
        num1 = 3;   num2 = 1;   num3 = 10;
        int smallest = num1;
        
        if (num2 < smallest) {
            smallest = num2;
        }else if (num3 < smallest) {
            smallest = num3;
        }
        System.out.println("The smallest number is : " + smallest);*/
        