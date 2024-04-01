package Recursion;

public class Fibonacci {

    static int fibonacci(int n){
        if(n < 2){
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

//    static String printNames(String str, int n){
//        System.out.println(str);
//        if(n < 1){
//            return str;
//        }
//        return printNames(str, n-1);
//    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
//        printNames("Bhavnish Bhardwaj", 10);

    }
}
