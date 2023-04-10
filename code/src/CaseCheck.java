import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String word = "hello";
//        System.out.println(word.charAt(0));
//        char ch = in.next().trim().charAt(0); // in.next().trim() it is a string and charAt(0) means give me the character the index(0,1,2....n) of string
//        System.out.println(in.next()); // this will print a word only from whole sentence
//        System.out.println(in.next().trim()); // .trim means remove the extra space that are present at the end of these words
           char ch = in.next().trim().charAt(0);
           if ( ch >= 'a' && ch <= 'z'){ // we use && means both the conditons are true
               System.out.println("Lowercase");
                }
           else {
               System.out.println("Uppercase");
           }

    }
}
