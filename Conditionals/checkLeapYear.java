import java.util.*;

public class checkLeapYear {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int year = sc.nextInt();
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " is a leap year.");
        }
        else if (year % 4 == 0 && year % 100 == 0){
            if (year % 400 == 0){
                System.out.println(year + " is a leap year.");
            }
            else {
                System.out.println(year + " is not a leap year.");
            }
        }
        else if (year % 4 != 0){
            System.out.println(year + " is not a leap year.");
        }

        /*boolean x = (year % 4 == 0);
        boolean y = (year % 100 != 0);
        boolean z = (year % 100 == 0 && year % 400 == 0);

        if (x && y || z){
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It is not a leap year.");
        }*/
        sc.close();


    }   
}
