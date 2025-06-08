import java.util.*;

public class sumEvenOdd {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        int evenSum = 0;
        int oddSum = 0;
        int choice;
        
        do{
            System.out.print("Enter any integer: ");
            int a  = sc.nextInt();

            if (a % 2 == 0) {
                evenSum += a;
            } else {
                oddSum += a;
            }
            System.out.println("Do you want to continue? 1(yes) or 0(no): ");
            choice = sc.nextInt();
            
            
        } while (choice == 1);

        System.out.println("Sum of even no.: " + evenSum);
        System.out.print("Sum of odd no.: " + oddSum);
        
        sc.close();

    }
    
}
