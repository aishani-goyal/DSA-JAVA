import java.util.*;

public class checkPrime {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        //Check Prime
        System.out.print("Enter any number: ");
        int num = sc.nextInt();
        boolean isPrime = true;

        // Condition: loop from 2 to (root n)

        if (num == 2){
            System.out.println("It is a prime no.");
        }
        
        else{
            for (int i=2; i<=Math.sqrt(num); i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                } 
            }
            if (isPrime == true){
                System.out.println("It is a Prime no.");
            }
            else{
                System.out.println("It is not a prime no.");
            }
        }
        sc.close();
        
        // Condition: loop from 2 to (n-1)

        /*if (num == 2) {
            System.out.println("It is a prime no.");
        }

        else {
            for (int i = 2; i <= n-1; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("It is a Prime no.");
            } else {
                System.out.println("It is not a prime no.");
            }
        }*/

    }
    
}
