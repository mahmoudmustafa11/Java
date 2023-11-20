package increment_decrement;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x, y, z, u;
        z = u = 5;
        x = z++ * 3 + z++ + z;      
        
        System.out.println("x = " + x + "\n" + "z = " + z); 
        
        y = ++u *3;
        System.out.println("y = " + y + "\n" + "u = " + u);
        
        x = x++ + ++x;
        y = ++y;
        
        System.out.println("x = " + x + "\n" + "y = " + y);
       
        // Task
        z = y * 2;
        System.out.println("z = " + z);
    }
}
