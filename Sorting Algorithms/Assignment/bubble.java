package Assignment;

public class bubble {

    public static void sort(int[] arr){

        int n = arr.length;

        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-1-i; j++){
                if (arr[j] < arr[j+1]){   //Descending condition
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        int n = arr.length;

        for (int i=0; i<n; i++){
            System.out .print(arr[i] + " ");
        }
    }

    public static void main (String[] args){
        int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};

        sort(arr);
        printArr(arr);
    }
    
}
