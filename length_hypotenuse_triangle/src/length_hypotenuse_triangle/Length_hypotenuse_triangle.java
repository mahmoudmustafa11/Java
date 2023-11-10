package length_hypotenuse_triangle;

public class Length_hypotenuse_triangle {
    public static void main(String[] args) {
        // Calculate the length of the hypotenuse of a right triangle
        double a = 3.0, b = 4.0;
        double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
        System.out.println("\nThe hypotenuse =\t" + c + "\n");
    }
   
}
