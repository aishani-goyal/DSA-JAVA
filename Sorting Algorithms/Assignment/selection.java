package Assignment;

public class selection {

    public static void sort(int[] arr){

        int n = arr.length;
        for (int i=0; i<n-1; i++){
            int minPos = i;

            for (int j=i+1; j<n; j++){
                if (arr[minPos] < arr[j]){   //Descending Condition
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        sort(arr);
        printArr(arr);
    }
    
}
