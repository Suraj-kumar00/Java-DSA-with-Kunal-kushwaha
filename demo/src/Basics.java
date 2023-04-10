import java.sql.SQLOutput;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        // simple if conditions
//        int a = 10;
//        if (a == 10) {
//            System.out.println("hello world");
//        }

           // while loop
//         int count = 1;
//         while (count != 5) {
//             System.out.println(count);
//             count++;
//         }


          // for loop
//        for(int count =1; count != 5; count++)
//        {
//            System.out.println(count);
//        }

        // celsius to fahrenheit
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter temp in C:");
        float tempc =in.nextFloat();
        float tempf = (tempc * 9/5 +32);
        System.out.println(tempf);


    }

}
