/*public class pairs {

    public static void pairArray(int nums[]){
        for (int i=0; i<nums.length-1; i++){
            int curr = nums[i];
            for (int j=i+1; j<nums.length; j++){
                System.out.print("( " + curr + "," + nums[j] + ")") ;
            }
            System.out.println();
        }
        
    }

    public static void main (String[] args){
        int nums[] = {2, 3, 4, 5, 6, 7};
        pairArray(nums);

    }   
}*/

public class pairs{

    public static void findPair(int arr[]){
        int tp=0;
        for (int i=0; i<arr.length-1; i++){
            int curr = arr[i];
            for (int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + ", " + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs are: " + tp);
    }

    public static void main(String[] args){
        int nums[] = {2, 4, 6, 8, 3};
        findPair(nums);
    }
}
