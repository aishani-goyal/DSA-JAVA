public class selectionSort {

    // Time Complexity: O(n^2)

    public static void sort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) { // turns
            int minPos = i;   //current position initialized as min. position

            for (int j = i+1; j < n; j++) {  // finding min element in unsorted array
                if (arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];   //swapped min element postion with current index
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };

        sort(arr);
        printArr(arr);
    }
}