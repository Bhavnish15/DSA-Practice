package JavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class twoDArrays {

    // Printing 2D Array
    static void print2dArray(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int SearchElement(int[][] arr, int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                    if(key == arr[i][j]){
                        System.out.println("Element is on index: "+ i + " " + j);
                    }
            }
        }
        return -1;
    }

    static int smallestElement(int[][] arr){
        int small = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(small > arr[i][j]){
                    small = arr[i][j];
                }
            }
        }
        return small;
    }

    static void addition(int[][] arr, int r1, int c1, int r2, int c2){
        if(r1 != r2 || c1 != c2){
            System.out.println("Adding is not possible. Your matrix Row and Column should be same.");
        }
        int[][] sum = new int[r1][c1];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                sum[i][j] = arr[i][j] + arr[i][j];
            }
        }
        print2dArray(sum);
    }

    static void Multiply(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if(c1 != r2){
            System.out.println("Sorry the Dimensions are incorrect.");
            return;
        }
        int[][] mul = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }

            }

        }
        System.out.println("Multiplication of Matrices are: ");
        print2dArray(mul);
    }

    static void TransposeInPlace(int[][] arr, int r, int c){
        for(int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

    }

    static void reverseArr(int[] arr){
        int i = 0, j = arr.length-1;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    // 90 degree rotation of an matrix
    static void RotationOfMatrix(int[][] arr, int n){
        TransposeInPlace(arr,n, n);  // First Transpose the matrix
        for(int i = 0; i < n; i++){
            reverseArr(arr[i]);  // Second Reverse each rows of matrix
        }
    }

    static int[][] pascal(int r){
        int[][] arr = new int[r][]; //  --->   JAGGED Array
        for(int i = 0; i < r; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;

            for (int j = 1; j < i; j++){
                arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
            }
        }
        return arr;
    }

    static void SpiralMatrix(int[][] arr, int r, int c){
        int topRow = 0, endRow = arr.length - 1;
        int topCol = 0, endCol = arr[0].length - 1;

        while (topRow <= endRow && topCol <= endCol){
            for(int i = topRow; i <=endRow; i++){
                System.out.println(arr[topRow][i]);
            }

            for(int i = topRow + 1; i <= endRow; i++){
                System.out.println(arr[i][endCol]);
            }

            for(int i = endCol - 1; i >= topCol; i--){
                if(topRow == endRow){
                    break;
                }
                System.out.println(arr[endRow][i]);
            }
            for(int i = endRow - 1; i >= topRow + 1; i++){
                if(topCol == endCol){
                    break;
                }
                System.out.println(arr[i][topCol]);
            }
            topCol++;
            topRow++;
            endCol--;
            endRow--;

        }
    }

    static int SumOfRangeIn2DArr(int[][] matrix, int R1, int C1, int R2, int C2){
        int sum = 0;
        for(int i = R1; i <= R2; i++){
            for(int j = C1; j <= C2; j++){
                sum+= matrix[i][j];
            }
        }
        return sum;
    }

    static void FindSumOfMatrix(int[][]matrix){
        for(int i = 0; i <= matrix.length; i++){
            for(int j = 1; j <= matrix[0].length; j++){
                matrix[i][j] = matrix[i][j] + matrix[i][j-1];
            }
        }
        for(int j = 0; j < matrix[0].length; j++){
            for(int i = 0; i < matrix.length; i++){
                matrix[i][j] = matrix[i][j] + matrix[i-1][j];
            }
        }
    }
    static int FindSumOfRange(int[][]matrix, int r1, int c1, int r2, int c2){
        int sum = 0;
        FindSumOfMatrix(matrix);

        for(int i = c1; i <= c2; i++){
            if(r1 >= 1) {
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            }else{
                sum += matrix[i][r2];
            }
         }
        return sum;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Rows: ");
//        int r = sc.nextInt();
//        System.out.println("Enter Columns: ");
//        int c = sc.nextInt();
//
//        int[][] arr = new int[r][c];
//
//        System.out.println("Enter "+r*c+" elements: ");
//        for(int i = 0; i < r; i++){
//            for(int j = 0; j < c; j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }

        int[][] arrr = {{1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9,10,11,12},
                        {13,14,15,16}};

        int[][] brrr = {{2,1}, {1,3}, {1,1}};

        int[] oneDArr = {4,5,3,2,1};

//        print2dArray(arr);
//        System.out.println((SearchElement(arrr, 5)));
//        System.out.println(smallestElement(arrr));

//        System.out.println("Sum of matrix: ");
//        addition(arrr, 4,4,4,4);
//        Multiply(arrr, 2, 3, brrr, 3, 2);
//        TransposeInPlace(arrr, 2, 3);
//        RotationOfMatrix(arrr, 3);
//        int[][] arr = pascal(5);
//        SpiralMatrix(arrr, 4,4);
//        print2dArray(arr);

        System.out.println("Enter The Range: ");
        int R1 = sc.nextInt();
        int C1 = sc.nextInt();
        int R2 = sc.nextInt();
        int C2 = sc.nextInt();

//        System.out.println(SumOfRangeIn2DArr(arrr, R1, C1, R2, C2));
        FindSumOfRange(arrr, R1, C1, R2, C2);







    }
}
