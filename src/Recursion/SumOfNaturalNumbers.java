package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    static void Sum(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        Sum(n-1);
        System.out.println(n);

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        Sum(n);
    }
}
