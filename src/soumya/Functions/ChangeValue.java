package soumya.Functions;

import java.util.Arrays;
// for objects or complex data types -- pass by value of the reference variable
public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        nums[0] =89; // if you make a change to the object via this ref variable,same obj will be changed.
    }
}
