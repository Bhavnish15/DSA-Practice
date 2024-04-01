package Recursion;

public class CountOfDigits {

    static int countOfDigits(int n){
        if(n <= 0 && n >= 9 || n/10 == 0){
            return 1;
        }
        System.out.println(n);
        return countOfDigits(n/10) + 1;
    }
    public static void main(String[] args) {
        System.out.println(countOfDigits(888));
    }
}
