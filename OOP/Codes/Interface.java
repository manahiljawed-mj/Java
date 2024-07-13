package OOP;

// Define interface A
interface A {

    // Variables are by default final and static
    int a = 7; // Constant variable 'a'
    int b = 9; // Constant variable 'b'

    // Methods are by default public and abstract
    void sum(); // Abstract method to be implemented
    void minus(); // Abstract method to be implemented
}

// Interface C extends interface A
interface C extends A {

    // Additional methods in interface C
    void multiply(); // Abstract method to be implemented
    void divide(); // Abstract method to be implemented
}

// Class B implements interface C
class B implements C {

    // Implementing method sum from interface A
    public void sum() {
        System.out.println("Sum method implementation");
    }

    // Implementing method minus from interface A
    public void minus() {
        System.out.println("Minus method implementation");
    }

    // Implementing method multiply from interface C
    public void multiply() {
        System.out.println("Multiply method implementation");
    }

    // Implementing method divide from interface C
    public void divide() {
        System.out.println("Divide method implementation");
    }
}

// Main class Interface to demonstrate interface usage
public class Interface {

    public static void main(String[] args) {

        // Create an object of class B
        B obj = new B();

        // Call implemented methods
        obj.sum();
        obj.minus();
        obj.multiply();
        obj.divide();
    }
}
