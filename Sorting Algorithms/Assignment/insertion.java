package Assignment;

public class insertion {

    public static void sort(int[] arr) {

        for (int i=1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev >= 0 && arr[prev] < curr){   //Descending
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
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
