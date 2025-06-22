public class evenOrOdd {

    public static void evenOddCheck(int n){
        int bitmask = 1;
        if ((n & bitmask) == 0){
            System.out.println("Even Number");
        } else{
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args){
        evenOddCheck(3);
        evenOddCheck(11);
        evenOddCheck(14);

    }
    
}
