import java.util.*;

public class printSum {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 1;
        while (count <= n){
            sum += count;
            count++;
        }
        System.out.println("Sum of first " + n + " natural numbers is " + sum);

        sc.close();
    }
}
