import java.util.Scanner;

public class ArmstongNumber {
    /* Q: Print all 3 Digit Armstrong Numbers
    ->  what is Armstrong Numbers: if we have any three digit
    number take individual digit do cube of every digit and add
    them and if the result is same is given number it is
    armstrong number
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        System.out.println(isArmstrong(n));

        for (int i = 100; i <1000 ; i++) {
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }

        }
    }
    static boolean isArmstrong(int n){
        int original =n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;

    }
}
