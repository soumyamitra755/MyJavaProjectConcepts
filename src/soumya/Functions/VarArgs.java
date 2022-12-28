package soumya.Functions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
      fun(2,3,4,5,6,7,34,45,56);
      multiple(1,3,"Soumya","Mitra");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
      System.out.println(Arrays.toString(new int[]{a}));

    }
    static void fun(int ... v){
        System.out.println(Arrays.toString(v));
    }
}
