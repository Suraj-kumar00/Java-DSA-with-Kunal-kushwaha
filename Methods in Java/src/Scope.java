public class Scope {
    public static void main(String[] args) {
        // scope basically means where we can access out variables

        int a = 10;
        int b = 39;

         // anything is initialized outside you can use inside the block but anything initialized inside the block you can't use outside
         // anything initialized outside the block can't be initialized inside but anything initialized inside the block can  definitely initialized again outside the block

        // this is the concept of Block Scope

        {
//            int a = 78; // already initialized outside the block in the same method, hence you can't initialize again
            a = 12;
            System.out.println(a);
            int c = 99;
           }
           /*
         -> we can't initialize same variable
          again in same block but we can update that reference variable's
          value like here int a = 10; so for updating , a = 12; that's it
          -> value initialized in this block, will remain in block

          */
//        System.out.println(c); // can't use outside the block


//        System.out.println(marks); // we can't access marks here because marks scope is in below function

////        for (int i = 0; i <; i++) {
////            System.out.println(i); // ths is right because i'm accessin this inside it's own block
//
//        }
//        System.out.println(i);// now it's showing error because i can't acces it outside the block

    }
    static void random(int marks){ // this also holds true for arguments
        // this is the first scope i.e. function scope
//        System.out.println(a); // here it says that you can access a in above function
        int num = 34;
        System.out.println(num);// but we can access num over here, because num exist in this function
        System.out.println(marks);
    }

}
