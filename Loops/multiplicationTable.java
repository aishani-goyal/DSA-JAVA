import java.util.*;

public class multiplicationTable {
    public static void main (String[] args){
        
        Scanner sc = new Scanner (System.in);
        int input = sc.nextInt();
        System.out.println("Multiplication table of " + input);
        for (int i = 1; i<=10; i++){
            System.out.println(input + " * " + i + " = " + input*i);
        }
        sc.close();
    }  
}
