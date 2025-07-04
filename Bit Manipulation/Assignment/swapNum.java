package Assignment;

public class swapNum {

    public static void main(String[] args) {

        // Swap two numbers without using any third variable
        int x = 11, y = 3;
        System.out.println("Before swap:\n" + "x = " + x + ", y = " + y);
        x = x ^ y;
        y = x ^ y;
        x = x ^ y; 

        System.out.println("\nAfter swap:\n" + "x = " + x + ", y = " + y);
    }
    
}
