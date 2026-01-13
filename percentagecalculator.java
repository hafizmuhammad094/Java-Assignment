package firstassignmentjava;

import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

       
        System.out.print("Enter the sum of obtained marks: ");
        float obtm = ki.nextFloat();

      
        System.out.print("Enter the maximum marks: ");
        float maxm = ki.nextFloat();

       
        float percentage = (obtm / maxm) * 100;

        
        System.out.println("Percentage Marks: " + percentage + "%");

        
    }
}