package OOP;

// Superclass A
class A {
    // Method in superclass A
    public void hello() {
        System.out.println("Hello from A");
    }
}

// Subclass B extends A
class B extends A {
    // Method overriding: Overrides hello() method from superclass A
    @Override
    public void hello() {
        System.out.println("Hello from B");
    }

    // Method overloading: add() method with no parameters
    public void add() {
        System.out.println("add is: " + (7 + 8));
    }

    // Method overloading: add() method with one parameter
    public void add(int a) {
        System.out.println("add is: " + (a + 8));
    }
}

public class polymorphism {

    // Polymorphism: poly means many, morphism means forms/behaviors
    // Polymorphism is of two types:
    // 1. Compile-time (early binding) - method overloading
    // 2. Run-time (late binding) - method overriding

    public static void main(String[] a) {
        // Creating an instance of subclass B
        B obj = new B();

        // Method overriding: This will call the hello() method of class B
        obj.hello();

        // Method overloading: This will call the add() method with no parameters
        obj.add();

        // Method overloading: This will call the add() method with one integer parameter
        obj.add(8);
    }
}
