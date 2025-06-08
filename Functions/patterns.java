public class patterns {

    public static void hollow_rectangle(int tot_rows, int tot_columns){
        //Outer loop for rows
        for (int i =1; i<=tot_rows; i++){

            //Inner loop for columns in each row
            for (int j=1; j<=tot_columns; j++){

                //Boundary condition to print stars
                if (i==1 || i==tot_rows || j==1 || j==tot_columns){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_pyramid(int tot_rows){
        //Outer loop for rows
        for (int i=1; i<=tot_rows; i++){
            //spaces print
            for (int j=1; j<=tot_rows-i; j++){
                System.out.print("  ");
            }

            //stars print
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void inverted_pyr_withNum(int tot_rows){
        //Outer loop for rows

        for (int i=1; i<=tot_rows; i++){
            //Numbers print
            for (int j=1; j<=(tot_rows-i+1); j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void floyd_triangle(int tot_rows){
        //outer loop for rows
        int counter = 1;
        for (int i=1; i<=tot_rows; i++){
            //for how many times should counter be printed in a row
            for (int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int tot_rows){
        for (int i=1; i<=tot_rows; i++){
            for (int j=1; j<=i; j++){
                if ((i+j)%2 ==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int tot_rows){
        for (int i=1; i<=tot_rows; i++){
            //stars
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }

            //spaces
            for (int j=1; j<=2*(tot_rows-i); j++){
                System.out.print("  ");
            }

            //stars
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = tot_rows; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            for (int j = 1; j <= 2 * (tot_rows - i); j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void rhombus(int tot_rows){
        for (int i=1; i<=tot_rows; i++){
            //spaces
            for (int j=1; j<=tot_rows-i; j++){
                System.out.print("  ");
            }

            //stars
            for (int j=1; j<=tot_rows; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int tot_rows){
        for (int i=1; i<=tot_rows; i++){

            //spaces
            for (int j=1; j<=(tot_rows-i); j++){
                System.out.print("  ");
            }

            //hollow rectangle - stars
            for (int j=1; j<=tot_rows; j++){
                if (i==1 || i==tot_rows || j==1 || j==tot_rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }

    public static void diamond(int n){
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            //stars
            for (int j=1; j<=2*i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Inveretd Diamomd
        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void number_pyramid(int n){
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //numbers
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

    public static void palindromic_num(int n){
        for (int i=1; i<=n; i++){
            //spaces
            for (int j=1; j<=(n-i); j++){
                System.out.print("  ");
            }
            //numbers - reverse
            for (int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            
            //numbers - order-wise
            for (int j=2; j<=i; j++){
                if (i==1){
                    System.out.print(" ");
                }
                else{
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
    

    public static void main(String args[]){
        
        //hollow_rectangle(4,5);
        //inverted_pyramid(4);
        //inverted_pyr_withNum(5);
        //floyd_triangle(5);
        //zero_one_triangle(5);
        //butterfly(5);
        //rhombus(5);
        //hollow_rhombus(5);
        //diamond(4);
        //number_pyramid(5);
        //palindromic_num(5);
        
    }
    
}
