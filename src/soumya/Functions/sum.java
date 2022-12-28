package soumya.Functions;

import java.util.Scanner;

public class sum {

    public static void main(String[] args) {

        //int ans = sum1();
        //System.out.println(ans);
        int add_res = sum2(23,76);
        System.out.println(add_res);

    }

    // pass the values when calling the method in main()

    static int sum2(int a, int b) {
        int add = a + b;
        return add;
    }

    // return the value
    static int sum1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = input.nextInt();
        System.out.println("Enter num2 :");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        return sum;

    }

    // void method doesn't return the value
    static void sum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter num1 :");
        int num1 = input.nextInt();
        System.out.println("Enter num2 :");
        int num2 = input.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum: " + sum);

    }
}
