import java.util.*;

public class square_area {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println(area);
        sc.close();
    }
}
