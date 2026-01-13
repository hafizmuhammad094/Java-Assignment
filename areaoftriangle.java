package firstassignmentjava;

import java.util.Scanner;

public class areaoftriangle {
public static void main(String[] args){
    Scanner ki= new Scanner(System.in);

    System.out.print("Enter the length of first side");
        double firside = ki.nextDouble();

        System.out.print("Enter the length of second side");
        double secside = ki.nextDouble();

        System.out.print("Enter the length of third side");
        double thirside = ki.nextDouble();

        double S= (firside + secside + thirside)/2;
        double area= Math.sqrt(S*(S-firside)*(S-secside)*(S-thirside));

        System.out.println("AREA OF TRIANGLE IS"+area);
}



}
