/*public class reverseAray {

    public static void reverse(int numbers[]) {
        int start = 0;
        int end = numbers.length - 1;

        // functions by reference pass hote hain islie function mein reverse kardenge to
        // original mein bhi reverse of jayega
        while (start < end) {

            // swap start and end elements
            int temp = numbers[end];
            numbers[end] = numbers[start];
            numbers[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int num[] = { 23, 34, 45, 56, 67 };
        System.out.println("Reverse of array is: ");
        
        reverse(num);

        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }
}*/

public class reverseArr{

    public static void reverse(int nums[]){
        int start = 0;
        int end = nums.length - 1;

        while (start < end){

            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }
    public static void main (String[] args){
        int arr[] = {12, 24, 35, 46, 57};

        reverse(arr);
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}


