public class pair {

    public static void findPair(int num[]){
        int tp = 0;
        for (int i=0; i<num.length-1; i++){
            for (int j=i+1; j<num.length; j++){
                System.out.print("(" + num[i] + "," + num[j] +  ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs: " + tp);
    }

    // Time Complexity:  O(n^2) : Use of nested loop 



    public static void main (String[] args){
        int num[] = {2,3,4,5,6,7};
        findPair(num);
    }
    
}
