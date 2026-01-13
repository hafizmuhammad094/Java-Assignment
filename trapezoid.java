package firstassignmentjava;
import java.util.Scanner;
public class trapezoid {
     public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

       
        System.out.print("Enter the Length of First Parallel side ");
        double firside = ki.nextDouble();

      System.out.print("Enter the Length of Second Parallel side ");
        double secside = ki.nextDouble();

        System.out.print("Enter the height: ");
        double hi = ki.nextDouble();

        double Area= hi*(firside+secside)/2;
        System.out.print("Area: " +Area);
}
}
