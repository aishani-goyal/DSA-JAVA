import java.util.*;
public class stringBasics {
    public static void main (String args[]){

        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("abcd");
        
       // Strings are IMMUTABLE - Purani String mein koi change ni ho sakta, humesha new string banti hai with new change

       //Input in String
        Scanner sc = new Scanner (System.in);
        //String name = sc.next(); //Takes only a single word
        String name = sc.nextLine();   //Takes complete line
        System.out.println(name);  //Output

    }
    
}
