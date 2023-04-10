import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    /* what do we mean by VarArgs method:
  VarArgs is basically means when you create when
  you create a method that takes a variable numbers
  of arguments
  -> we use it when we don't know how many inputs we are
  giving
  */
    public static void main(String[] args) {
//          fun(2,3,4,5,56,67,78,89);// any numbers of arguments i want that's the beauty of VarArgs
//        multiple(3,4,"suraj", "mohit"); // here we can't skip anything as declared and initialized as below in multiple method
       demo("suraj","mohit"); // the parameter can't be empty it shows error : this is know as ambiguity/ambiguous method
     }
     static void demo(int ...v){
         System.out.println(Arrays.toString(v));

     }

     static void demo(String ...v){
         System.out.println(Arrays.toString(v));

     }

    // this case of mix argumets
    static void multiple(int a, int b ,String ...v){ // VarArgs( variable length arguments)  always comes at the end

    }

 static void fun(int ...v){ // -> datatype ...(give and name) this is how we declare VarArgs when we don't know how many integers we are passing
     System.out.println(Arrays.toString(v));
 }

}
