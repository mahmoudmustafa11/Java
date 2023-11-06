/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package length_hypotenuse_triangle;

/**
 *
 * @author Z
 */
public class Length_hypotenuse_triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculate the length of the hypotenuse of a right triangle
        double a = 3.0, b = 4.0;
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("\nThe hypotenuse =\t" + c + "\n");
    }
    
}
