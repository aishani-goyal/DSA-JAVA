/*public class prefixSum {

    public static void maxSum(int[] numbers){
        int currSum = 0;
        int maxSumArr = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + numbers[i];

        }
        for (int i=0; i<numbers.length; i++){

            int start = i;
            for (int j = i; j<numbers.length; j++){

                int end = j;
                currSum = (start == 0) ? prefix[end] : (prefix[end] - prefix[start-1]);

                if (currSum > maxSumArr) {
                    maxSumArr = currSum;
                }

            }
            
        }
        System.out.print("Max sum is: " + maxSumArr);
    }

    public static void main (String[] args){
        int numbers[] = {-1, 2, -2, 4, 8};
        maxSum(numbers);

    }
}*/

public class prefixSum{

    public static void maxSubarray(int nums[]){

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];

        // build prefix array
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for (int i=0; i<nums.length; i++){
            for (int j=i; j<nums.length; j++){
                currSum = (i==0) ? prefix[j] : prefix[j] - prefix[i-1];

                if (currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum of subarrays : " + maxSum);

    }

    public static void main (String[] args){
        int nums[] = {1, -2, 6, -1, 3};

        maxSubarray(nums);

    }
}
