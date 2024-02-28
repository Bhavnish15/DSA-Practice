package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysInJava {

    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void sortingZeros(int[] arr) {
        int zeros = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    static void againSorting(int[]arr){
        int first = 0; int end = arr.length -1;
        while(first < end){
            if(arr[first] != 0 && arr[end] != 1){
                int temp = arr[first];
                arr[first] = arr[end];
                arr[end]= temp;
            }
            if(arr[first] == 0){
                first++;
            }
            if(arr[end] == 1){
                end--;
            }
        }
    }

    static void OddEvenArrangements(int[] arr){
        int left = 0; int right = arr.length -1;
        while(left < right){
            if(arr[left]%2 == 1 && arr[right]%2 == 0){
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
            if(arr[left]%2 == 0){
                left++;
            }
            if(arr[right]%2 == 1    ){
                right--;
            }
        }
    }

    static int[] squareArray(int[] arr){
        int n = arr.length;
        int left = 0, right = n-1;
        int[] squreArr = new int[n];
        int k = n-1;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                squreArr[k--] = arr[left] * arr[left];
                left++;
            }else{
                squreArr[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return squreArr;
    }

    static int[] MakePrifixSum(int[]arr){
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }

    static int[] MakePrifixSumWithoutNewArray(int[]arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            arr[i] = arr[i] + arr[i-1];
        }
        return arr;
    }

    static int subArray(int[] arr, int l, int r){
        int n = arr.length; int sum = 0;

            for(int j = l; j < r; j++){
                sum =  sum + arr[j];
            }

        return sum;
    }




    public static void main(String[] args) {
        int[] nums = {2,1,3,4,5};

//        sortingZeros(nums);
//        againSorting(nums);
//        OddEvenArrangements(nums);
//        squareArray(nums);
//        MakePrifixSum(nums);
//        MakePrifixSumWithoutNewArray(nums);
        System.out.println(subArray(nums,2,4));
//        printArray()


    }
}
