public class arrayArgument {

    public static void update(int marks[]){
        for (int i=0; i<marks.length; i++){
            marks[i] += 1;
        }
    }

    public static void  main (String[] args){
        int marks[] =  {97, 98, 99};
        update(marks);   //Arrays are passed into functions by reference

        //print marks

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
    
}
