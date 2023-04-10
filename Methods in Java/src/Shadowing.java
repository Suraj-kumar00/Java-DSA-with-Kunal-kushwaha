public class Shadowing {
    /*Shadowing in Java is the practice of using variables in
    overlapping scopes with the same name where the variable in
    low-level scope overrides the variable of high-level scope.
     */
    // this scope is as above curly brases
    static int x = 20; // this will be shadowed at line 8
    // here lower is overriding the upper level, higher level is shadowed
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // this class variable at line 4 is shadowed by this
//        System.out.println(x);// it's showing error because we have to first initialize it and than use it
        // scope will begin when value is initialized
        x = 40;
        System.out.println(x);// here it don't give error

        System.out.println(x); // 40
           fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
