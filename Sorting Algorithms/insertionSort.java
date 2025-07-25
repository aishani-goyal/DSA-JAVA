public class insertionSort {

    // Time Complexity: O(n^2)

    public static void insertion(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;

            // finding out the correct pos to insert by comparing the current element with
            // each element backwards
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 3, 2 };

        insertion(arr);
        printArr(arr);
    }

}
