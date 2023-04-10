import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5]; // here instead of this we can also do this int arr[] = new int[5]; this is also valid but it's not like the java way to do it
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 44;
        arr[3] = 22;
        arr[4] = 56;
//        System.out.println(arr[4]);

        // input using for loop
//        for (int i = 0; i < arr.length; i++) {// length represents the length of array
//            arr[i] = in.nextInt();
//
//        }
//
//        System.out.println(Arrays.toString(arr)); // this is the best one, here array class has a toString method and when you give a array into it , it basically converts into a string and prints that sting

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        }

//         for(int num: arr) {  // for every elements in array , print the elements
//                 System.out.print(num + " ");  // here num represents elements of the array
//                 }


//        System.out.println(arr[5]); // index out of bound error , it will give us error because we have only 5 elements and we are asking for 6th element

        // array of objects
        String[] str = new String[4];
        for( int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));
    }
}
