package Assignment;

import java.util.Arrays;

public class checkAnagram {

    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()){
            char[] str1CharArr = str1.toCharArray();
            char[] str2CharArr = str2.toCharArray();

            Arrays.sort(str1CharArr);
            Arrays.sort(str2CharArr);

            boolean result = Arrays.equals(str1CharArr, str2CharArr);
            if (result){
                System.out.print(str1 + " and " + str2 + " are anagrams of each other.");
            } else{
                System.out.print(str1 + " and " + str2 + " are not anagrams of each other.");
            }
        } else{
            System.out.print(str1 + " and " + str2 + " are not anagrams of each other.");
        }
    }
    
}
