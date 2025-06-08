import java.util.*;

public class printNum {

    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        int count = 1;
        while (count <= num){
            System.out.print(count + " ");
            count++;
        }
        sc.close();
    }
    
}
