package firstassignmentjava;

import java.util.Scanner;

public class calculatepower {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

        
        System.out.print("Enter the voltage in volts");
        double vol = ki.nextDouble();
  
        System.out.println("Enter the Current in amperes");
        double cur = ki.nextDouble();
        System.out.println("Power in watts" + cur*vol);

       
    }
}
    


