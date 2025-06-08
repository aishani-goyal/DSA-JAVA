/*public class largestNum {

    public static  int largest (int numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;

    }

    public static void main (String[] args){
        int numbers[] = {2, 7, 1, 3, 6};
        System.out.println("Largest number is: " + largest(numbers));

    }
}*/

import java.util.*;

public class findNum{

    public static int largest(int nums[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i=0;  i<nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }

            if (nums[i] < min){
                min = nums[i];
            }
        }
        System.out.println("Smallest number is " + min);
        return max;
    }
    
    public static void main(String[] args){
        int nums[] = {23,12,24,2,54,26};

        System.out.println("Maximum value is " + largest(nums));
    }
}
