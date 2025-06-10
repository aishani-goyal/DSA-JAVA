import java.util.*;

public class TwoDarrays {

    // Searching an element in 2D Array
    public static boolean search (int matrix[][], int key){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key){
                    System.out.print("Key found at index (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.print("Key not found");
        return false;
    }
    
    public static void main (String[] args){
        int matrix[][] = new int[3][3];
        int n = 3;  //rows: matrix.length
        int m = 3;  //columns: matrix[0].length

        Scanner sc = new Scanner(System.in);

        //Taking input
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //Printing 2D Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        search(matrix, 4);
    }
}
