import java.util.*;

public class continueStatement{

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        do{
            System.out.print("Enter your number: ");
            int num = sc.nextInt();
            if (num % 10 == 0){
                continue;
            }
            System.out.println(num);
        } while (true);

    }
    

}