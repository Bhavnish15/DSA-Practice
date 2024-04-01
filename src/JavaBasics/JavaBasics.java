package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class JavaBasics {

    static int OccuranceCount(int[]arr, int x){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                count++;
            }
        }
        return count;
    }

    static int lastOccurance(int[] arr, int x){
        int result = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                result = i;
            }
        }
        return result;
    }
    static int StrictlyGreater(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        return count;
    }

    static boolean SortedOrNot(int[] arr){
        boolean isSorted = true;


            for(int i = 1; i < arr.length; i++){
                if(arr[i]  < arr[i-1]){
                    isSorted = false;
                }
            }

        return isSorted;
    }

    static int[] reverseArray(int[]arr, int first, int last){
        while(first < last){
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;

            first++;
            last--;
        }
        return arr;
    }
    //x = 4
    //Program to find the total number of pairs in the arrays whose sum is equal to the given value x
    static int arrayPairs(int[] arr, int x){
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] + arr[j] == x){
                    counter++;
                }
            }
        }
        return counter;
    }
    static int triplets(int[] arr, int x) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        counter++;
                    }
                }
            }
        }
        return counter;
    }
    static int UniqueNumber(int[]arr){
        int result = -1;
       for(int i = 0; i < arr.length; i++){
           for(int j = i+1; j < arr.length; j++){
               if(arr[i] == arr[j]){
                   arr[i] = -1;
                   arr[j] = -1;
               }
           }
       }
       for(int i = 0; i < arr.length; i++){
           if(arr[i] > 0){
               result = arr[i];
           }
       }

       return result;
    }

    static int secondLargest(int[] arr){
        int max = 0;
        int secondLargest = 0;

        for(int i = 0; i < arr.length; i++){
                if(arr[i] > max){
                    secondLargest = max;
                    max = arr[i];
                } else if (arr[i] > secondLargest && arr[i] != max) {
                    secondLargest = arr[i];
                }
            }
        return secondLargest;
    }

    static int repeatingElement(int[] arr){
        int result = -1;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
            if(arr[i] == arr[j]){
                result = arr[j];
                }
            }

        }

        return result;
    }

    static void spiralMatrix(int[][]matrix) {
        // code here
        int start_row = 0; int end_row = matrix.length - 1;
        int start_col = 0; int end_col = matrix[0].length - 1;

        while(start_row <= end_row && start_col <= end_col) {
            //upper row
            for (int col = start_col; col <= end_col; col++) {
                System.out.print(matrix[start_row][col] + " ");
            }
            start_row++;
            //Right Col
            for (int row = start_row; row <= end_row; row++) {
                System.out.print(matrix[row][end_col] + " ");
            }
            end_col--;
            //Bottom Row
            for (int col = end_col; col >= start_col; col--) {
                System.out.print(matrix[end_row][col] + " ");
            }
            end_row--;
            //Left Column
            for (int row = end_row; row >= start_row; row--) {
                System.out.print(matrix[row][start_col] + " ");
            }
            start_col++;
            System.out.println();
        }

    }

    public static void main (String[] args){
        //Arrays
        Scanner sc = new Scanner(System.in);
        int num[] = {1,5,6,1};
        int[][] arr = {{1,5,7,9,10,11}, {6,10,12,13,20,21}, {9,25,29,30,32,41}, {15,55,59,63,68,70}, {40,70,79,81,95,105}};

        spiralMatrix(arr);






//       System.out.println(OccuranceCount(num, 5));
//       System.out.println(lastOccurance(num, 5));
//        System.out.println(StrictlyGreater(num));
//        System.out.println(SortedOrNot(num));
//        System.out.println(Arrays.toString(reverseArray(num, 0, num.length - 1)));
//        System.out.println(arrayPairs(num, 7));
//        System.out.println(triplets(num, 12));
//        System.out.println(UniqueNumber(num));
//        System.out.println(secondLargest(num));
        System.out.println(repeatingElement(num));

    }

}
