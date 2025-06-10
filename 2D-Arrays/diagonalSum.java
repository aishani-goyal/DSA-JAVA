public class diagonalSum {
    public static int diagSum(int arr[][]) {
        int sum = 0;
        
        // Brute Force Approach: O(n^2)

        /* for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                } else if (i + j == arr.length - 1) {
                    sum += arr[i][j];
                }
            }
        } */

        for (int i=0; i<arr.length; i++){   // Time Complexity: O(n)

            sum += arr[i][i];  //Primary Diagonal

            if (i != arr.length-1-i){   //Secondary Diagonal

                sum += arr[i][arr.length-1-i];
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        System.out.print(diagSum(arr));
    }

}
