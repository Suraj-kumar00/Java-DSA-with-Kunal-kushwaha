import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
             1 2 3
             4 5 6
             7 8 9

         */
        Scanner in = new Scanner(System.in);
//        int [][] arr = new int[3][]; // here adding the rows is mandatory but columns not

//        int[][] arr2D = { // another way to declare multidimentional array
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

//        int[][] arr = { // so we can write it like this as well, number of column if not mandatory
//                {1,2,3},//0th index
//                {4,5},// 1st index
//                {6,7,8,9}//  2nd index -> arr2D[2] = { 6,7,8,9}
//        };

        int [][] arr = new int[3][3];
        System.out.println(arr.length); // give me no. of rows


        // input

        for (int row = 0; row < arr.length; row++) {
            // for each col(column) in every row i want to take input
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();

            }
        }

         // output

//        for (int row = 0; row < arr.length; row++) {
//            // for each col(column) in every row i want to take input
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.println(arr[row][col] + " ");
//
//            }
//            System.out.println(); // this is for new line so that it output looks like an array
//        }

           // output another way
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//
//        }
          // enhanced for loop
        for(int[] a : arr){ // for the outside array every single element itself is an array that's why we're saying here the datatype of every single element in this (arr) array itself is an array
            System.out.println(Arrays.toString(a));
        }
    }
}
