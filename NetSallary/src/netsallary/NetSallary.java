package netsallary;

public class NetSallary {
    public static void main(String[] args) {
        double sallary, taxSallary, healthSallary, netSallary;
        
        sallary = 5000;
        taxSallary = sallary * (10.0 / 100);
        healthSallary = sallary * (5.0 / 100);
        netSallary = sallary - taxSallary - healthSallary;
  
        System.out.println(netSallary);
    }
}
