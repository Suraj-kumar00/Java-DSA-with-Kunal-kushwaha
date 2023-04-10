public class PassingExample {
    public static void main(String[] args) {
        String name = "suraj"; // here name is not equal to below naam
        greet(name); // when name is passed in this method value of reference veriable  is passed
            //in java there is no pass by reference in java only
    }
    static void greet(String naam){ // here name is replaced by naam, and here the naam is contain the value of name is "suraj"
        System.out.println(naam); // here the naam veriable is the copy of name reference veriable, so this naam is also going to point the same value which is "suraj" here

    }
}
