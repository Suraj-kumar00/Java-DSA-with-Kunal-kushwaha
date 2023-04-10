public class WrapperExample {
    public static void main(String[] args) {
//        int a = 20;
//        int b = 23;
//        Integer num = 33; // this is wrapper class
        // what wapper class do -> use primitives like as an object


        Integer a = 12;
        Integer b = 23;   

        swap(a, b);
        System.out.println(a + " " + b); // it will not swap because the Integer class in a final class

//        final int bonus = 4;
//        bonus = 5; // we can't update it, it's giving error

        final A suraj = new A( "suraj kumar");
        suraj.name = "other name";

        //when a non primitive is final , you can't reassign it.
//        suraj = new A("new object");

        A obj = new A ("lakjdflsad");
        System.out.println(obj);
//        for (int i = 0; i < 1000000000; i++) {
//            obj = new A ("Random name");
//        }
        

    }
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }




}

class A {
    final int num = 10;
    String name;

    public A (String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed"); // here object is destroying it is doing by own we can't manually do it
    }
}

