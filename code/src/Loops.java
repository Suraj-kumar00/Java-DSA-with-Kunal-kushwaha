import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        /*
              Syntax of for loop:
              for( initialisation; condition ; increment / decrement){
              //body
              }
         */
        // we use for loop when we know the number of iterations
        // Q: Print numbers form 1 to 5

        // Print  numbers from 1 to n
//        Scanner in  = new Scanner(System.in);
//        int n = in.nextInt();
//        for (int num =1; num<=n ;num++) {
//            System.out.println(num + " ");

//        }

        // while loop:
        /*
           Syntax :
           while (condition){
           //body
           }
         */
          // while loop we use when we don't no the number of iterations
//        int num = 1;
//        while ( num <= 5){
////            System.out.println(num);
//            num+=1;
//        }

        // do while
        /*
        do {
        // body
        } while (condtion);
         */
        // difference in while and do while loop : the do while loop is going to be execute atleast once
//        int n = 1;
//        do {
//            System.out.println(n);
//            n++;
//        }while(n<=5);

        int n = 1;
        do {
            System.out.println("suraj"); // first it will execute the body and then check condition
        }while(n !=1);

    }
}
