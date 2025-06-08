/*public class subArrays {
    public static void subArray(int nums[]){
        int ts = 0;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i=0; i<nums.length; i++){
           
            for (int j=i; j<nums.length; j++){
                currSum = 0;

                for (int k = i; k<=j; k++){
                   //System.out.print(nums[k] + " " );

                   currSum += nums[k];    // Calculating sum of each subArray
                   
                }
                System.out.println("Sum: " + currSum);

                if (currSum > maxSum){
                    maxSum = currSum;
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Subarrays: " + ts);
        System.out.println("Max sum is: " + maxSum);
    }
    public static void main (String[] args){
        int nums[] = {2, 4, 6, 1, 7, 8};
        subArray(nums);
    }   
}*/

//Brute Force Approach - Max Subarray Sum & Min Subarray Sum

public class subArrays{

    public static void printSubArray(int nums[]){
        int count = 0;
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++){
            System.out.println();

            for (int j=i; j<nums.length; j++){
                sum = 0;
                for (int k=i; k<=j; k++){ //print
                    System.out.print(nums[k] + " ");   //subarray 
                    sum += nums[k];  
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                    if (sum < minSum) {
                        minSum = sum;
                    }
                }
                System.out.print(" sum: " + sum);
                System.out.println();
                count++;
                
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + count);
        System.out.println("Max Subarray sum: " + maxSum);
        System.out.println("Min subarray sum: " + minSum);
    }

    public static void main (String[] args){
        int arr[] = {1, -2, 6, -1, 3};

        printSubArray(arr);
    }
}


