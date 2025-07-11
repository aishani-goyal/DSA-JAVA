public class countingSort {

    public static void countSort(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        
        int[] count = new int[max+1];
        
        for (int i=0; i<arr.length; i++){  //Store frequency in Count Array
            count[arr[i]]++;
        }

        // Sorting
        int j=0;
        for (int i=0; i<count.length; i++){
            while (count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args){
        int[] arr = {1, 4, 1, 3, 2, 4, 3, 7};  
        
        countSort(arr);
        printArr(arr);
    }
    
}
