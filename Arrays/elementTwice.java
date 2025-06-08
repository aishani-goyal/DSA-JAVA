import java.util.*;

public class elementTwice {

    public static boolean checkCount(int arr[]){
        int n = arr.length;
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter no. of elements in an array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(checkCount(arr));
    }
    
}
