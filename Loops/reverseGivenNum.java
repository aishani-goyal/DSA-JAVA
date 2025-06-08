import java.util.*;

public class reverseGivenNum {

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter any number: ");

        int num = sc.nextInt();
        int rev = 0;

        while (num > 0){
            int lastDigit = num % 10;
            rev = (rev*10) + lastDigit;
            num = num / 10;
        }
        
        System.out.print("Reverse of given number is " + rev);

        sc.close();
    }
    
    
}
