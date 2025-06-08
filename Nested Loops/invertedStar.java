public class invertedStar {

    public static void main (String [] args){
        for (int i=4; i>=1; i--){
            for (int j=i; j>=1; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

        // ANOTHER METHOD (using n-i+1) for INVERTED STAR PATTERN
        /*int n = 4;

        for (int i = 1; i<=n; i++){
            for (int j=1; j<=n-i+1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }*/

    }
    
}
