import java.util.*;

public class arrayCC{
    public static void main (String[] args){

        int marks[] = new int[50];  //Array of size 100 declared with name 'marks'

        Scanner sc = new Scanner (System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("Maths: " + marks[0]);
        // System.out.println("Phy: " + marks[1]);
        // System.out.println("Chem: " + marks[2]);

        // int percentage  = (marks[0] + marks[1] + marks[2]) / 3;
        // System.out.println("Percentage: " + percentage + "%");

        System.out.println("Length of array: " + marks.length);

        //Passing arrays as argument (Arrays follows pass by reference)
        sc.close();

    }
}

