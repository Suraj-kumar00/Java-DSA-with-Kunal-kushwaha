import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float a = input.nextFloat(); // this is right
//        int a = input.nextFloat(); // error here because left side should be greater then right side
//        int a = input.nextInt();// this is right
//        float a = input.nextInt();// this ir right

        // type casting
//        int num  = (int)(67.56f); // here we are doing explicit type casting
//        System.out.println(a);


        // automatic type promotion in expressions
//        int a =  257;
//        byte b = (byte) (a);// 257 % 256 = 1


//        byte a =40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a*b)/c;

//        System.out.println(d);

//        int number = 'A';
//        System.out.println("नमस्ते"); // it's is unicode is java
//        System.out.println("你好");

//        System.out.println(8*5.5646545646566f);// rules of type promotion

        byte b = 12;
        char c = 's';
        short s = 34;
        int i = 2323;
        float f = 5.26f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        // float + int - double = double , double is greatest of all of these
        System.out.println((f*b) + " "  + (i/c) +" " + (d*s));
        System.out.println(result);




    }
}
