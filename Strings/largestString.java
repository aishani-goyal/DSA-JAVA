public class largestString {

    public static void main(String[] args) {
        String fruits[] = {"apple", "mango", "banana"};   // Lexicographical Order Largest String

        String largest = fruits[0];
        for (int i=1; i<fruits.length; i++){
            if (largest.compareTo(fruits[i]) < 0){
                largest = fruits[i];
            }
        }

        //Time Complexity: O(x * N)  -> x: length of largest string, N: No. of Strings
        System.out.print(largest);
    }
    
}
