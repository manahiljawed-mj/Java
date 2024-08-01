package OOP;

// Superclass A
class A {
    // Default constructor of class A
    A() {
        super(); // Calls the constructor of the Object class (implicit and optional)
        System.out.println("In A");
    }

    // Parameterized constructor of class A
    A(int b) {
        super(); // Calls the constructor of the Object class (implicit and optional)
        System.out.println("In A int");
    }
}

// Subclass B extends A
class B extends A {
    // Default constructor of class B
    B() {
        super(); // Calls the default constructor of class A
        // Every constructor's first line is by default super() if not explicitly written
        System.out.println("In B");
    }

    // Parameterized constructor of class B
    B(int a) {
        // super(5); // Uncommenting this will call the parameterized constructor of class A with value 5
        this(); // Calls the default constructor of class B
        System.out.println("In B int");
    }
}

// Main class to demonstrate the use of this() and super() methods
public class this_and_super_methods {
    public static void main(String[] args) {
        B obj = new B(5); // Creating an instance of class B using the parameterized constructor
    }
}
