package firstassignmentjava;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

        
        System.out.print("Enter the radius of circle");
        double rad = ki.nextDouble();

        
        double circumference = 2 * Math.PI * rad;
        double area = Math.PI * rad * rad;

       
        System.out.println("Circumference " + circumference);
        System.out.println("Area " + area);

       
    }
}
    

