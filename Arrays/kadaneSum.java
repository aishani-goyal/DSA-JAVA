public class kadaneSum {

    public static void kadane(int nums[]){
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        
        /*int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                count++;
            }
            ms = Math.max(nums[i],ms);
        }
        if (count == nums.length) {
            System.out.println("Max subarray sum is: " + ms);
        } else { 
            kadane For loop
        } */
        
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("Max subarray sum is: " + ms);        

    }

    public static void main (String[] args){
        int nums[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        kadane(nums);

    }
    
}
