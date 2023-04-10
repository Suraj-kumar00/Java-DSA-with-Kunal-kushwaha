import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number 1: ");
        int num1 = in.nextInt();
        System.out.println("Enter the number 2: ");
        int num2 = in.nextInt();
        int sum = num1+num2;
        System.out.println("the sum = " + sum);

        /*now if someone says like hey! do this 10 times or 1000
        time so what we do, we don't waste our time in copy pasting
        so that's why we use functions/methods
         */

    }
}