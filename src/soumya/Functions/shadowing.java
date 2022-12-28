package soumya.Functions;

public class shadowing {
    static int x =90; // this will be shadowed
    public static void main(String[] args) {
        System.out.println(x); // 90
        int x;// class variable shadowed at line 4 is shadowed by this
        x = 45;
        System.out.println(x); //45.. scope will begin when value is initialised
        fun();
    }

     static void fun() {
         System.out.println(x);
    }
}
