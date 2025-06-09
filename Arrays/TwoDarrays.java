import java.util.*;

public class TwoDarrays {
    
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
    }
    
}
