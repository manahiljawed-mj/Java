package OOP;

class A {
    // Method in superclass A
    public void hello() {
        System.out.println("In A");
    }
}

// Subclass B extends A
class B extends A {
    // Method overriding: Overrides hello() method from superclass A
    // Uncommenting this method will allow B to provide its own implementation
    // public void hello() {
    //     System.out.println("In B");
    // }
    
    // Method specific to subclass B
    public void hello1() {
        System.out.println("In B!");
    }
}

public class downcasting_and_upcasting {

    public static void main(String a[]) {
        // Upcasting: Reference of type A refers to an object of type B
        A obj = (A) new B();
        obj.hello(); // Calls the hello() method from class A because the method in B is commented out

        // Upcasting: Reference of type A refers to an object of type B
        A obj1 = new B();
        // Downcasting: Cast the reference of type A to type B to access B's methods
        ((B) obj1).hello1(); // Calls the hello1() method from class B
    }
}
