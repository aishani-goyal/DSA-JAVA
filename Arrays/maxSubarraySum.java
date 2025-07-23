public class maxSubarraySum {
    

        public static void maxSum(int[] nums){
            int currSum = 0;
            int max = Integer.MIN_VALUE;

            for (int i=0; i <nums.length; i++){

                for (int j= i ; j<nums.length; j++){
                    currSum = 0;
                    for (int k=i; k <=j; k++){
                        System.out.print (nums[k] + " ");
                        currSum += nums[k];
                    }
                    System.out.println();

                    if (currSum > max){
                        max = currSum;
                    }
                    
                }
                
                
            }
            System.out.print("Max Subarray sum is: " + max);
        }

        public static void main (String[] args){
            int nums[] = {32, 23, 16, 26, 32};
            maxSum(nums);

        }
    }

