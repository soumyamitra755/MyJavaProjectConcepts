import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
     //   System.out.println("Enter :");
      //  int a = input.nextInt();
       //     boolean ans = isPrime(a);
        //    System.out.println(ans);
       // System.out.println(isArmstrong(a));
        for(int i = 1; i < 100000; i++){
            if(isArmstrong(i)){
                System.out.println(i + " ");
            }
        }
    }
    // Print all 3 digit armstrong numbers
    static boolean isArmstrong(int a){
        int original = a;
        int sum = 0;

        while (a > 0){
            int rem = a % 10;
            a = a / 10;
            sum =  sum + rem*rem*rem;
        }
        return sum == original;
    }
     static boolean isPrime(int a) {
         if (a <= 1) {
             return false;
         }
        int c = 2;
         while (c * c <= a){
             if (a % c == 0){
                 return false;
             }
             c++;
         }
         return c * c > a;

     }

}


