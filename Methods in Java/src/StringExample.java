import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//     String message = greet();
//        System.out.println(message);

        // this is when you want to take input from user

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = in.next();
        String personalised = myGreet(name); // here we just passing name
        System.out.println(personalised);

//        String personalised = myGreet("suraj"); // this is used when you don't want to take input form user
//        System.out.println(personalised);


    }

     static String myGreet(String name) {
        String message = "hello "+ name;
        return  message;
    }

    static  String greet(){
        String greeting  = "how are you ";
        return greeting;
    }

}
