public class Main {
    public static void main(String[] args) {
        // Q: why we need arrays?
        // Q: store a roll number
        int a = 23;
        // Q: store a person's name
        String name = "Suraj";
        // Q: main question is store 5 roll numbers?
        int rno1 = 12; // now these are not a good practice or way to store like this so we need array to store large collection of data of same datatype
        int rno2 = 23; // now suppose we have to store 500 roll no then what we have to do so we need arrays for this
        int rno3 = 34;
         // what is array - "  collection of datatype either can be primitives or your objects or complex datatype , whatever you want to store you can store in array
         /* Syntax of array
         datatype[] variable_name = new datatype[size];
          */
        // let say we want to store 5 roll numbers:
//        int [] rnos = new int[5];// this line means that the "rnos" reference variable that pointing to an array object that contain type integer
        // or directly
//        int[] rnos2 = {23,12,45,32,15}; //now here the int datatype basically represents what is the  type of data stored inside of array
        // we can only store one type of data in an array like in  above example we stored integer type data we in that we can't store String with integer

        // Explaination
        int [] ros; // declaration of array . ros is getting defined in the stack
        ros = new int[5]; // Initialisation: actually here object is being created in the memory (heap)
        // above if we don't give size of array it'll give error

        /* in C++ arrays are stored in continuous memory location but in java
        there is no concept of pointers so it's totally depend on  JVM
        that it will store it in continuous or not! why?
        1.) array objects are in heap and the second thing if we check
        JLS( java language specification - where they have mentioned about the internals
        and workings of java , in that they have specifically mentioned that
        heap objects are not continuous , there is like no confident proof
        2.) Heap objects are not continuous, and the heap is runtime data area
        from which the memory for all the classes and instances like all the arrays
        are allocated.
        3.) Dynamic memory allocation
        hence array objects in java may not be continuous  -> depends  on JVM
         */
         // Index in array - it's just like the position of array which starts from 0

       // new keyword is basically  used to create an object
//        System.out.println(ros[1]);

        String [] arr = new String[4];
        System.out.println(arr[0]); // it's output is "null" -> null is basically a special literal of null type
//        String str = null; // it's right
//        int num = null; // it's wrong it'll give error
        // every reference variable that you have by default it's going to have the null type

        // let's dive into null
        // what if we arrays of objects not primitives? , for example we have string array
        // primitives(int,char, float , boolean etc..) are stored in stack memory only

        // iterating this enhanced for loop
//        for(String element : arr){
//            System.out.println(element);
//        }





    }
}