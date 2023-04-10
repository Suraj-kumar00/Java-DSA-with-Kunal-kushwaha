public class Swap {
    public static void main(String[] args) {
        int a = 22;
        int b = 34;

        // swap numbers code
//        int temp = a;
//        a=b;
//        b=temp;
        swap(a,b);

        System.out.println(a + " " + b);

        String name = "suraj";
        changeName(name);
        System.out.println(name); // but here the name is not being changed
        // here name and naam both are pointing to same value which is surajk
       // System.out.println(naam); // so this is invalid to access namm over here
    }
    static void changeName(String naam){ // it's also didn't change the name here
        naam = "mahesh"; // here not changing but creating a  new object is being created and naam pointing to that object
     // and naam is available to only this function not outside the function, this is known as scoping
    }

     /* Q: the question is , that is it going to swap the value or not?
     answer is: it did not swap it
      */
   /*
   * primitives: int,short, char ,double,byte etc.. -> just passing value

   * objects and references: passing value of the reference veriable

    */
//    static void swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//    }

    static void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // this change will only be valid in this functionscope only.

        /* so in the primitive data types the value will be passed hence the original value isn't change
        but in non-primitives data types like arrays and stuff it's also pass
        by value but passing the value of reference variable in that case if
        you make change via that than the original value will be changed
         */
    }

}
