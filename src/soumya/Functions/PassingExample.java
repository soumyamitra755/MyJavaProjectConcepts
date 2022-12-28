package soumya.Functions;

// for objects or complex data types -- pass by value of the reference variable
public class PassingExample {
    public static void main(String[] args) {
        String name = "Soumya Mitra";
        greet(name);

    }

     static void greet(String name) {
        name = "Suchandra Paul";
        System.out.println(name);

    }
}
