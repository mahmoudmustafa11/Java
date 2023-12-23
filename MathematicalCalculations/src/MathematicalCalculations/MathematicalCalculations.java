package MathematicalCalculations;
public class MathematicalCalculations {
    public static void main(String[] args) {
        // System.out.println(30/(12*2-9)+2^3);
        System.out.println(30/(12*2-9)+Math.pow(2,3));
        System.out.println("-----------------------------");
        
        // Math Operatons
        int a = 22, b = 10;
        int x,y,z,v,u;
        x=a+b;
        y=a-b;
        z=a*b;
        v=a/b;
        u=a%b;
        
        System.out.println("---");
        System.out.println("a+b = " + x);
        System.out.println("a-b = " + y);
        System.out.println("a*b = " + z);
        System.out.println("a/b = " + v);
        System.out.println("a%b = " + u);
    }
}
