public class stringBuilder {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");  //Initialized with an empty string
        for (char ch='a'; ch<='z'; ch++){
            sb.append(ch);
        }
        System.out.print(sb.length());

        //Time Complexity: O(26)
        //Time Complexity: O(n^2) -> In case of strings
        
    }
    
}
