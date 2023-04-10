import java.util.Scanner;

// short notes
/*
In switch statements, you can jump to various cases based on your expression.
Syntax
switch(expressionO{
// cases
case one:
     // do something
     break;
case two:
     // do something
     break;
default:
     // do something
}

NOTE:
- cases have to be the same type as expressions, must be a constant or literal
- duplicate case values are not allowed
- break is use to terminate the sequence
- if break is not used, it will continue to next case
- default will execute when none of the above does
- if default is not at the end, put break after it
 */
public class SwitchCase {
    public static void main(String[] args) {
//      System.out.println("Please enter the fruit:");
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        switch (fruit){
//            case "Mango":
//                System.out.println("King of fruits");
//                break;  // if we don't add a break keyword here it will keep going on to the next statements
//            case "Apple":
//                System.out.println("A sweet red furit");
//                break;
//            case "Orange":
//                System.out.println("Round fruit");
//                break;
//            case "Grapes":
//                System.out.println("Small fruit");
//                break;
//            default:
//                System.out.println("Please enter the valid fruit");

//   }
        // so above code of switch is not so good and the better version of above switch case is below:
        // this is Enhanced 'switch'
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet red furit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter the valid fruit");
//        }

        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");




        }


    }

}
