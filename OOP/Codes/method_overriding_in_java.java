package OOP;

// Superclass A
class A {
    // Method in superclass A
    public void hello() {
        System.out.println("Hello From A");
    }
}

// Subclass B extends A
class B extends A {
    // Method overriding: Overrides hello() method from superclass A
    @Override
    public void hello() {
       
        System.out.println("Hello From B");
    }
}

// Main class to demonstrate method overriding
public class method_overriding_in_java {
    public static void main(String[] args) {
        B obj = new B(); // Creating an instance of subclass B
        obj.hello(); // Calling hello() method on object of subclass B
    }
}
