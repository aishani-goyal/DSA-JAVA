//import java.util.*;

public class helloWorld{

    public static void printHelloWorld(){
        System.out.println("Hello World");
        return;
    }

    public static int calculateSum(int num1, int num2){ //parameters or formal parameteers
        int sum = num1 + num2;
        return sum;
    }

    public static void swapNum(int c, int d){
        int temp = c;
        c = d;
        d = temp;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }

    public static int multiply(int a, int b){
        int product = a*b;
        return product;
    }

    public static int factorial(int n){
        int f = 1;
         for (int i=1; i<=n; i++){
            f*=i;
         }
         return f;
    }

    //Function Overloading 

    //Function to calculate sum of 2 no.

    // public static int sum(int a, int b){
    //     return a+b;
    // }

    // //Function to calculate sum of 3 no.

    // public static int sum(int a, int b, int c){
    //     return a+b+c;
    // }/

    //func to calc sum of 2 int

    public static int sum(int a, int b){
        return a+b;
    }

    //func to calc sum of 2 float values

    public static float sum(float a, float b){
        return a+b;
    }

    public static int binomialCoeff(int n1, int r){
        int n_fact = factorial(n1);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n1-r);
        return n_fact/(r_fact*nmr_fact);
    }

    //Check Prime

    // public static boolean isPrime(int n){

    //     //corner case
    //     if (n==2){
    //         return true;
    //     }
    //     for (int i=2; i<=n-1; i++){
    //         if (n%i == 0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    //Check Prime Optimized

    public static boolean isPrime(int n){
        if (n==2){
            return true;
        }
        for (int i=2; i<=Math.sqrt(n); i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }

    //Print all primes in a range
    public static void primesInRange(int n){
        for (int i=2; i<=n; i++){
            if (isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    // Convert Binary to Decimal
    public static void binToDec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int dec = 0;
        while (binNum>0){
            int lastDigit = binNum % 10;
            dec = dec + (lastDigit * (int)Math.pow(2,pow));

            binNum = binNum/10;
            pow++;
        }
        System.out.println("Decimal of " + myNum + " = " + dec);
    }

    // Convert Decimal to Binary
    public static void decToBin(int decNum){
        int myNum = decNum;
        int pow = 0;
        int bin = 0;
        while (decNum>0){
            int rem = decNum % 2;
            bin = bin + rem * (int)Math.pow(10,pow);

            decNum = decNum / 2;
            pow++;
        }
        System.out.print("Binary of " + myNum + " = " + bin);
    }

    public static void findAvg(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("Average of 3 numbers is: " + avg);
    }


    public static boolean isEven(int num){
        if (num%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome(int number){
        int palindrome = number;
        int rev = 0;

        while (palindrome > 0){
            int lastDigit = palindrome % 10;
            rev = (rev * 10) + lastDigit;

            palindrome = palindrome/10;

        }

        if (number == rev){
            return true;
        }
        else{
            return false;
        }
    }

    public static void mathClass(int n1, int n2){
        System.out.println("Min of 2 numbers is: " + Math.min(n1, n2));
        System.out.println("Max of 2 no. is: " + Math.max(n1, n2));
        System.out.println("Square root of 9 is: " + Math.sqrt(9));
        System.out.println("5 to the power 3 is: " + Math.pow(5,3));
        System.out.println("Absolute value of " + (n1-n2) + " is: " + Math.abs(n1-n2));
    }

    public static int calcSumOfDigits(int n){
        int sum = 0;

        while (n>0){
            int lastDigit = n%10;
            sum = sum + lastDigit;

            n = n/10;
        }
        return sum;

    }
    public static void main(String[] args) {
        int num = 345;

        System.out.println("Sum of digits in " + num + " is: " + calcSumOfDigits(num));

        //mathClass(3,5);


        //Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // if (isPalindrome(n)){
        //     System.out.println("Number " + n + " is a Palindrome.");
        // }
        // else{
        //     System.out.println("Number " + n + " is not a Palindrome.");
        // }
        //sc.close();
    }
}