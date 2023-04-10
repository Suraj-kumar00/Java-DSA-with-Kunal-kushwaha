import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
//     sum();// this is calling the function
//     sum();
//        int ans = sum2();
//        System.out.println(ans);
        int ans = sum3(20,30);
        System.out.println(ans);
    }

    /* pass the value of numbers when you are calling the method in main() and we can do this via parameters */
     static int sum3(int a, int b){
         int sum = a+b;
         return sum;

     }
    // return the value
//    static int sum2 () { // here in sum () in these parantheses  we can pass arguments
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter the number 2: ");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum; // it's done here so
//        System.out.println("this will never execute"); // this is showing erroe
//    }

//    static void sum(){ // here in sum () in these parantheses  we can pass arguments
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number 1: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter the number 2: ");
//        int num2 = in.nextInt();
//        int sum = num1+num2;
//        System.out.println("the sum = " + sum);
//    }

    /*
    return_type name(arguments){
    // body
    return statement;
    }
     */
}
