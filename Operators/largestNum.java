import java.util.*;
public class largestNum {
    public static void main(String[] args){
        int a, b, c;
        Scanner sc = new Scanner (System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a>=b && a>=c){
            System.out.println(a + " is largest.");
        }
        else if (b>=c){
            System.out.println(b + " is largest.");
        }
        else{
            System.out.println(c + " is largest.");
        }
        sc.close();
    }
}
