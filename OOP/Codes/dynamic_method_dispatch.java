package OOP;

// Superclass A
class A {
    // Method in superclass A
    public void hello() {
        System.out.println("In A");
    }
}

// Subclass B extends A
class B extends A {
    // Method overriding: Overrides hello() method from superclass A
    public void hello() {
        System.out.println("In B");
    }
}

// Subclass C extends B
class C extends B {
    // Method overriding: Overrides hello() method from superclass B
    @Override
    public void hello() {
        System.out.println("In C");
    }
}

// Main class to demonstrate dynamic method dispatch
public class dynamic_method_dispatch {

    // Example of runtime polymorphism

    public static void main(String[] a) {
        // Reference variable of type A
        A obj;

        // Assigning obj to an instance of class A
        obj = new A();
        // Calls hello() method of class A
        obj.hello();

        // Assigning obj to an instance of class B
        obj = new B();
        // Calls hello() method of class B
        obj.hello();

        // Assigning obj to an instance of class C
        obj = new C();
        // Calls hello() method of class C
        obj.hello();
    }
}
