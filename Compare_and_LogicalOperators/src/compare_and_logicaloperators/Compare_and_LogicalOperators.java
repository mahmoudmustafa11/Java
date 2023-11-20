package compare_and_logicaloperators;

public class Compare_and_LogicalOperators {
    public static void main(String[] args) {
        boolean x1, x2, x3, x4;
        int y = 7;
        double z = 5.5;
        char ch = 'w';
        
        x1 = (y>=6) && (ch==119);
        x2 = (y>6) || (ch=='w');
        x3 = (z<11) && (y>100);
        x4 = (ch!='p') || ((y+z)<=10);
        
//        System.out.println("(y>=6) && (ch==119) is " + x1);
        System.out.println((y>=6) + " && " + (ch==119) + " is " + x1);
        
//        System.out.println("(y>6) || (ch=='w') is " + x2);
        System.out.println((y>6) + " || " + (ch=='w') + " is " + x2);
        
//        System.out.println("(z<11) && (y>100) is " + x3);
        System.out.println((z<11) + " && " + (y>100) + " is " + x3);
        
//        System.out.println("(ch!='p') || ((y+z)<=10) is " + x4);
        System.out.println((ch!='p') + " || " + ((y+z)<=10) + " is " + x4);
    }
   
}
