import java.util.Arrays;
import java.util.Collections;


// Time Complexity: O(nlogn)
public class inbuiltSort {

    public static void printArr(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Integer arr[] = { 5, 4, 1, 3, 2 };

        //Arrays.sort(arr);   //by default sort in ascending

        //Arrays.sort(arr, 0, 3);

        //Arrays.sort(arr, Collections.reverseOrder());
        //Arrays.sort(arr, 0, 4, Collections.reverseOrder());
        printArr(arr);

        
    }
    
}
