public class equalityCheck {

    public static void main (String[] args){
        String s1 = "Tony";
        String s2 = new String("Tony");

        if (s1.equals(s2)){
            System.out.print("Strings are equal");
        } else{
            System.out.print("Strings are not equal");
        }
    }
    
}
