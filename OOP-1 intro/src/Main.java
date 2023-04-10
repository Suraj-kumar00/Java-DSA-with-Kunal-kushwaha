import java.rmi.StubNotFoundException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];


        //and what if we have to store data of 5 students : { roll no, name, marks}
        // this is where classes and objects oriented programming comes in
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] matks = new float[5];
        /*
        class : A class is a named grouped of properties and functions
        by convention class starts with capital latte
        if you want to create your own datatype in below i created Student
        yuu can to that via class
         */


        Student[] students = new Student[5];
        // here it's just declaring
//        Student suraj; // here suraj is a reference variable of type student are own datatype that we created using class
//        suraj = new Student();

        // or in one line
        Student suraj = new Student(12, "suarj kumar",59.9f);
        Student mohit = new Student();

        // Q: when you are creating the object like above can you not just allocate below like rno, name & marks is during that time because it's repetitive, let's say Student has 100 properties we don't write 100 times right
        // isn't there's better way - yes that's where Student()[constructor] this thing comes in

//        suraj.changename("God lover");
//        suraj.greeting();


//        suraj.rno = 12; // here suraj.rno means rno inside the suraj object
//        suraj.name = "suraj kumar";
//        suraj.marks = 55.5f;
//        System.out.println(suraj); // it'll give the by default value of suraj
        System.out.println(suraj.rno); // by default it giving 0 because it is primitive
        System.out.println(suraj.name); // by default value of string when it's not initialized  is null
        System.out.println(suraj.marks); // it's also primitive so by default it gives 0.0
//        System.out.println(Arrays.toString(students));
        Student random = new Student(suraj);
        System.out.println(random.name);

        Student random1 = new Student(); // so here the Student will replaced with name of the class
        System.out.println(random1.name);
        //  here when student is not initialized  by default it's value in java is null

        Student one = new Student();
        Student two = one;

        one.name = "Someting something";
        System.out.println(two.name); // here we change the name of one but the name of two was also changed





    }


    }

    /*
    Constructor - A constructor basically defines what happens when your object
    will be created, it's special function, that runs when you create an object and
    allocate som variable.
    // what part
    -> Student suraj = new Student( 12, "suraj kumar" , 12.3); // here we want to bind these arguments with the object
    now it i do sura.rno it give me 12 and so on
    -> Here Student() is a special type of function in the class


     */





    // create a class( template )
    // for every single student
    class Student {
        int rno ;
        String name ;
        float marks = 90;

          // we need a way to add the values of the above
         // properties object by object

        // here we need  one word to access every object

        void greeting(){
            System.out.println("Hello my name is " + name);
        }

        void changename(String newName) {
            this.name = newName;
        }

        Student (Student other){
            this.name = other.name; // so here basically other.name replaced with suraj.name , and this.name is replaced with random.name
            this.rno = other.rno;
            this.marks = other.marks;

        }

        // this is  creating a constructor
        // below the example of constructor overloading
        Student() {

            /*  for example if this constructor is empty so
            this is how we call a constructor from another constructor
            using 'this' keyword
                // internally : new Student(13,"default person", 100.0f);
             */
            this(13,"default person", 100.0f);



//            suraj.rno = 12;
//            suraj.name = " suraj kumar";
//            suraj.marks = 22.3f;
             // what is the keyword to access the variable like that/the reference variable/ the object, known as "this"
//            this.rno = 12; // this entire thing is replaced with suraj.rno
//            this.name = "suraj kumar";
//            this.marks = 22.3f;
        }
        // Student mohit = new Student (23, "mohit", 89.8f);
        // here, this will be replaced with mohit
        Student(int roll, String name, float marks){
            this.rno = roll; // in this case if we have same variable name so we use "this" keyword here
            this.name = name; // the 'this' keyword basically replaced with the reference variable
            this.marks = marks;
            // above roll in Student and roll in this keyword same and anything, because here roll or name or marks are reference variable
        }


    }

   // NOTE:
    /* in java the primitives datatypes are not implemented as objects
    objects are stored in the heap memory and in java primitives( are not objects)
       hence they  are stored in stack
    memory only
    so why we don't use new keyword because they are implemented
    like as normal variables we don't implement those like as objects
    why does java do it to increase efficiency to make more fast,
     that's why python is slow language
     */


