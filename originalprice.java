package firstassignmentjava;

import java.util.Scanner;

public class originalprice {

    public static void main(String[] args){
    Scanner ki= new Scanner(System.in);
     System.out.println("Enter Discounted Selling Price");
     double disp=ki.nextDouble();
    System.out.println("Enter Discount Percentage");
    double disper=ki.nextDouble();

    double Origpri=((disp/(100-disper))*disper)+disp;

    System.out.println(Origpri);
}
}