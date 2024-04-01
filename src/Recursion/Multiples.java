package Recursion;

public class Multiples {

    // Print Table of a Number mum up to k Times

    static void multiples(int num, int k){
        if(k == 0){
            return;
        }
        multiples(num, k-1);
        System.out.println(num * k);
    }
    public static void main(String[] args) {
        multiples(5,5);
    }
}
