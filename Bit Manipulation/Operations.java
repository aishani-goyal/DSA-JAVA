public class Operations {

    public static int getithBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setithBit(int n, int i) {
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearithBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateithBit(int n, int i, int newBit) {
        /*
         * if (newBit == 0){
         * return clearithBit(n, i);
         * } else{
         * return setithBit(n, i);
         * }
         */

        n = clearithBit(n, i);
        int bitMask = newBit << i;
        return (n | bitMask);
    }

    public static int clearIBits(int n, int i) {
        int bitMask = (~0) << i; // (~0 << i) or (-1 << i)
        return (n & bitMask);
    }

    public static int clearBitsInRange(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static boolean isPowerOfTwo(int n){
        return n>0 && (n&(n-1)) == 0;
    }

    public static int countSetBits(int n){    // Time Complexity: O(log(n))
        int count = 0;

        while (n > 0){
            if ((n & 1) != 0){   //Checking LSB
                count++;
            }
            n = n>>1;  //Right shift by 1 bit
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBits(29));

    }

}
