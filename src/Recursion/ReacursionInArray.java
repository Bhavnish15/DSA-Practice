package Recursion;
import java.util.Scanner;

public class ReacursionInArray {

    // Print the Array
    static void printArr(int[]arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]+ ",");

        printArr(arr, idx+1);
    }

    // Maximum in Array
    static int printMaxArr(int[]arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns = printMaxArr(arr, idx+1);
        return Math.max(smallAns, arr[idx]);
    }

    // Sum of the Array
    static int PrintSum(int[]arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        return arr[idx] += PrintSum(arr, idx+1);

    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
        int[]arr = {6,7,8};

        printArr(arr, 0);
        System.out.println("Maximum in Array = "+printMaxArr(arr, 0));
        System.out.println("Sum of the Array = "+PrintSum(arr, 0));


    }
}
