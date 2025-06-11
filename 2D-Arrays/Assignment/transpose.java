package Assignment;

public class transpose {

    public static void printArr(int matrix[][]){
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    

    public static void main (String[] args){
        int row = 2, col = 3;
        int matrix[][] = {{2, 3, 7}, {5, 6, 7}};
        System.out.println("Original Matrix: ");

        printArr(matrix);  //Original Matrix

        int transposeMatrix[][] = new int[col][row];

        for (int i=0; i<row; i++){            //Transpose of Matrix
            for (int j=0; j<col; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        System.out.println();
        System.out.println("Transpose Matrix: ");

        printArr(transposeMatrix);

        
    }
    
}
