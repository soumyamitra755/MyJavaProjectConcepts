package soumya.Functions;

public class Scoping {
    public static void main(String[] args) {

        int a =10;
        int b =20;

        {
            int c =67;
            System.out.println(c);
            //values initialised in a block, will remain in the block
            a =100; // reassign the original ref variable

        }
        // System.out.println(c); cannot use outside the block
        System.out.println(a);
    }

    static void random(int marks){
        int num = 87;
        System.out.println(num);
        System.out.println(marks);
    }
}
