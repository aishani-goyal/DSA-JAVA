import java.util.*;

public class reverseNum {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        // Print Reverse of a number (Use Arithmetic operator)
        for (int i = num; i>0; i=i/10){
            int lastDigit = i % 10;
            System.out.print(lastDigit);
        }

        // Using while loop

        /*while (num > 0){
            int lastDigit = num % 10;
            num = num / 10;
            System.out.print(lastDigit);
        }*/
        sc.close();


    }
}