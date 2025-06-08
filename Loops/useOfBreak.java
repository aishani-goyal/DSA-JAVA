import java.util.*;

public class useOfBreak {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        do {
            System.out.print("Enter you number: ");
            int num = sc.nextInt();
            if (num % 10 == 0){
                break;
            }
            System.out.println(num);
        } while (true);

        sc.close();
    }
    
}
