package Assignment;

public class counting {

    public static void sort(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            max = Math.max(arr[i], max);
        }
        int[] count = new int[max+1];   // Creating a new array to store the frequency

        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }

        int j=0;
        for (int i=count.length-1; i>=0; i--){   //Descending Sorting
            while (count[i] > 0){
                arr[j] = i;
                count[i]--;
                j++;
            }
        } 
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 1, 3, 2, 4, 3, 7 };

        sort(arr);
        printArr(arr);
    }
    
}
