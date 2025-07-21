public class bubbleSort{

    // Time Complexity: O(n^2)

    public static void sort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1; i++){  //turns
            for (int j=0; j<n-1-i; j++){   //comparisons in 1 turn
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr){
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main (String[] args){
        int arr[] = {5, 7, 1, 3, 2};

        sort(arr);
        printArr(arr);
    }
}