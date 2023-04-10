import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        /*
        -> What is an Arraylist?

        -> Why we need Arraylist?
        the idea is that here the arrays of fixed size
         like arr[5] for example but what if you don't know
         how much size you need, then like hey Java please handle
         the size for me and let me input the any number of
         elements that i want , in C++ it is similar to Vectors.
         Arraylist is a part of collection framework,
         and it's in the java.util.package
         */

        // Syntax
        ArrayList<Integer> list = new ArrayList<>(10);//here in <> these we can also write the datatype there but it's not mandatory
           // above in ArrayList <> here we can't pass primitives but we can pass wrapper classes like above example

//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(45);
//        list.add(45);


//        System.out.println(list.contains(46)); // this for checking any number or elements
//        System.out.println(list);
//        list.set(0,34); // this for adding a new element to a list
////        System.out.println(list);
//
//        list.remove(3); // this for remove any element from given index
//        System.out.println(list);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

         // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }

        System.out.println(list);








    }
}
