import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
          int [] nums = { 3,4,5,23};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change (int[] arr){ // String are immutable in java and arrays are mutable (means you can change the objects) in java
        arr[0] = 99;

    }
}
