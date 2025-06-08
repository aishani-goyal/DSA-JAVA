import java.util.*;

public class variable_q1 {
    public static void main(String[] args){
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner (System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        float avg = (a+b+c)/3;
        System.out.println(avg);
        sc.close();
    }
    
}
