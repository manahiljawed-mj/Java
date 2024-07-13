package OOP;

public class wrapper_class {
    public static void main(String[] a) {
        // Autoboxing: Converting int to Integer
        int b = 7;
        Integer bb = b; // Autoboxing

        float f = 7.5f;

        // Boxing: Converting float to Integer
        Integer c = (int) f; // Boxing

        Float dd = f;

        // Printing value of Integer c
        System.out.println("Integer c value is: " + c.intValue());

        // Auto unboxing: Converting Integer to int
        int d = c; // Auto unboxing

        float z = dd;

        int ddd = (int) z;

        // Printing value of int d and int ddd
        System.out.println("Value of d: " + d);
        System.out.println("Value of ddd: " + ddd);
    }
}
