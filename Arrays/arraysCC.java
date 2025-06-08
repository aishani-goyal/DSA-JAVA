/*public class linearSearch {

    public static int linearSearchArr(int arr[], int key){
        for (int i=0; i< arr.length; i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main (String[] args){
        int arr[] = {23, 34, 54, 67};
        int key = 34;

        int index = linearSearchArr(arr, key);
        if (index == -1){
            System.out.print("key not found");
        }
        else{
            System.out.print("Key found at index: " + index);
        }
        

    }
    
}*/


public class arraysCC{

    public static int linearSearch(int num[], int key){
        
        for (int i=0; i<num.length; i++){
            if (num[i] == key){
                return i;
            } 
        }
        return -1;
    }

    public static int linearSea(String fruits[], String fruit) {

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i] == fruit) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {23, 12, 3, 45, 13, 56, 87};
        String fruits[] = {"Apple", "Mango", "Banana", "Cherry", "Orange"};
        int key = 45;
        String fruit = "Mango";

        int index = linearSearch(numbers, key);
        if (index == -1){
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index " + index);
        }

        int search = linearSea(fruits, fruit);
        if (search == -1) {
            System.out.println("Fruit not found");
        } else {
            System.out.println("Fruit found at index " + search);
        }

    }
}
