public class substring {

    public static String printSubstring(String str, int si, int ei){
        String substr = "";
        for (int i=si; i<ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main (String[] args){
        String str = "HelloWorld";
        System.out.print(str.substring(0, 5)); //Function for substring already exist in Java
        //System.out.print(printSubstring(str, 0, 5));
    }
    
}
