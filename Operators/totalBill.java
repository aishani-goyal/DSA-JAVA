import java.util.*;

public class totalBill {
    public static void main(String[] args){
        System.out.println("Enter cost of pen, pencil, eraser: ");
        Scanner sc = new Scanner (System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total_bill = pencil + pen + eraser;
        System.out.println("\nTotal bill is: " + total_bill);
        float newCost = total_bill + (0.18f * total_bill);
        System.out.println("\nBill with 18% gst: " + newCost);
        sc.close();

    }
}
