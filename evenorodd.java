package firstassignmentjava;
import java.util.Scanner;
public class evenorodd {
     public static void main(String[] args) {
        Scanner ki = new Scanner(System.in);

       
        System.out.print("Enter an Integer ");
        int number= ki.nextInt();

        if(number%2==0)
        {
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
}
}