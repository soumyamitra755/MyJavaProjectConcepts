package soumya.Functions;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Q. take input of 2 nos and print the sum

        Scanner input = new Scanner(System.in);
        int count = 2;
        for (int z = 0; z <= count; z++) {
            System.out.println("Enter num1 :");
            int num1 = input.nextInt();
            System.out.println("Enter num2 :");
            int num2 = input.nextInt();

            int sum = num1 + num2;

            System.out.println("Sum: " + sum);

        }
    }
}

