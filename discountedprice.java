package firstassignmentjava;

import java.util.Scanner;

public class discountedprice {

    public static void main(String[] args){
    Scanner ki= new Scanner(System.in);
     System.out.println("Enter Original Selling Price");
     double Origp=ki.nextDouble();
    System.out.println("Enter Discount Percentage");
    double disper=ki.nextDouble();

    double dispri=Origp-((disper/100)*Origp);

    System.out.println(dispri);
}
}