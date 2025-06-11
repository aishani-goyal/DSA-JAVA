package Assignment;

public class sumOfNums {

    public static void sumOfSecondRow(int matrix[][]){
        int sum = 0;
        int i = 1;
        for (int j=0; j<matrix[0].length; j++){
            sum+=matrix[i][j];
        }
        System.out.print("Sum of 2nd row is: " + sum);
    }
    
    public static void main (String[] args){
        int matrix[][] = {{1, 4, 9},
                        {11, 4, 3},
                        {2, 2, 3}};

        sumOfSecondRow(matrix);
    }
}
