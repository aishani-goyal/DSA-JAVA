public class Operations {

    public static int getithBit(int n, int i){
        int bitMask = 1 << i;
        if ((n & bitMask) == 0){
            return 0;
        } else{
            return 1;
        }
    }
    
    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static void main(String[] args) {
        System.out.println(setithBit(10, 2));
        
    }
    
}
