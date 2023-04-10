import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        // the Q: is here is this going to change the original array or not
        int[] arr = {1,2,3,4,5,6};
       change(arr);
        System.out.println(Arrays.toString(arr)); // here toString is another method, it just takes the integer array and return the string value of it
    }
    static void change(int[] nums){
        nums[0] = 99;// if you make a change to the object via this reference variable, same object will be changed
    }
}
