package Recursion;

public class ArmstrongChecker {

    static int armstrongChecker(int n){
        if(n < 10){
            return n*n*n;
        }
        return ((n%10)*(n%10)*(n%10)+armstrongChecker(n/10));


    }
    public static void main(String[] args) {

        System.out.println(armstrongChecker(153));
    }
}
