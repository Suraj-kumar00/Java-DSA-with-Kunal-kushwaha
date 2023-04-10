public class Overloading {
    public static void main(String[] args) {
        /* so what is basically overloading:
        it means when two or more functions/method have
        same name but different arguments like below

         */

//       fun(45); // at compiler time it will decide which function/method to run
//       fun("suraj");
        int ans = sum(3,4,5);
        System.out.println(ans);
    }
    static int sum(int a, int b){
        return  a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }


    static void fun(int a ){
        System.out.println("First one ");
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);


        }
    }

