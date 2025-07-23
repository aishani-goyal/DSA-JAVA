/*public class binarySearch {

    public static int binarySearchInArray(int num[], int key){

        int start = 0;
        int end = num.length - 1;

        while (start <= end){
            int mid = (start + end) / 2;
            if (num[mid] == key){  //found
                return mid;
            }
            else if (num[mid] > key){    //left
                end = mid - 1;
            }
            else{
                start = mid + 1;         //right
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int num[] = {23, 45, 63, 78, 90};
        int key = 78;

        int index = binarySearchInArray(num, key);
        if (index == -1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at index: " + index);
        }
   
    } 
}*/


public class binarySearch{

    public static int findKey (int arr[], int key){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = (start + end)/2;
            if (key == arr[mid]){
                return mid;
            }
            else if (key > arr[mid]){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[] = {27, 34, 45, 56, 67};
        int key = 34;

        System.out.println("Key found at index " + findKey(arr, key));
    }
}
