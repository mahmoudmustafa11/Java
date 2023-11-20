package maths_2;

public class Maths_2 {

  public static void main(String[] args) {
    
    int x = 6, y = 6;
    int i = 6, j = 8;
    double f = 6.5, k = -4.25;  

    System.out.println(x *= 3 + 6);
    System.out.println(y = i * 3 + 6);

    System.out.println("i=i+6     -> i=" + (i += 6));
    System.out.println("f=f-k     -> f=" + (f -= k));
    System.out.println("j=j*(i-4) -> j=" + (j *= i - 4));
    System.out.println("f=f/4     -> f=" + (f /= 4));
    System.out.println("i=i%2     -> i=" + (i %= 2));
  }
}
