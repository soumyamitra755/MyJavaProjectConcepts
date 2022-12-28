import java.util.Scanner;

public class TyeCast {
    public static void main(String[] args) {
        Scanner a =  new Scanner(System.in);
        float num =  a.nextFloat();
        System.out.println(num);

        int num1 = (char)(45.3f);
        System.out.println(num1);

        byte b =34;
        int c = 3;
        
        int d = b*c;
    }
}
