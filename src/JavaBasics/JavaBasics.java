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

    public static void main (String[] args){
        //Arrays

        int num[] = {1,5,6,1};



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
