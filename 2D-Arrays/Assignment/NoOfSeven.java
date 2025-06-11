package Assignment;

public class NoOfSeven {

    public static void countSeven(int matrix[][]){
        int count = 0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                if (matrix[i][j] == 7){
                    count++; 
                }
            }
        }
        System.out.print("No. of 7 in given array is: " + count);
    }

    public static void main (String[] args){
        int matrix[][] = {{4, 7, 8},
                        {8, 7, 7}};

        countSeven(matrix);
    }
    
}
