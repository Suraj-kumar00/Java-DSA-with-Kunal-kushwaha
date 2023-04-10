import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in. next();

//        if (fruit == "mango" ) { // here it suggests that don't use  '==' use .equal

//            if (fruit.equals("mango")) { // .equals check the value only

                 String a = "Suraj"; //  first approach here how do we know that String a and String b pointing to same "Suraj" object
                 String b = "Suraj"; // and second thing might be happend that String a and String b have own different "Suraj" object
                // how do we know that which one is right
                // we can do by comparing a==b, '==' checks the referance of these two strings
        System.out.println(a==b);




    }
}