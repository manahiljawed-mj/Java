package OOP;

// Superclass A
class A {
    // Method in superclass A
    final public void hello() {
        System.out.println("In A");
    }
}

// Subclass B extends A
final class B extends A {
    // Method in subclass B
    // This is a new method, not an override of hello() in A
    public void hello1() {
        System.out.println("In B");
    }
}

// // Subclass C cannot extend B as B is declared final
// class C extends B {
//     // Attempt to override hello() method will result in a compile-time error
//     @Override
//     public void hello() {
//         System.out.println("In C");
//     }
// }
// The above code is commented out because it will result in a compile-time error as B is a final class and cannot be subclassed

public class final_keyword {

    // Example demonstrating the use of the final keyword with variables, methods, and classes

    public static void main(String[] a) {
        // Declaring a final variable
        final int num = 8;
        // num = 9; // Uncommenting this line will result in a compile-time error as final variables cannot be reassigned

        // Creating a reference variable of type A
        A obj;

        // Assigning obj to an instance of class A and calling hello() method
        obj = new A();
        obj.hello(); // Output: In A

        // Creating an instance of class B and calling hello1() method
        obj = new B();
        ((B)obj).hello1(); // Output: In B

        // Calling the hello() method using the obj reference
        obj.hello(); // Output: In A (because obj is of type A)
        // ((B)obj).hello1(); // This works because obj is actually an instance of B, but must be cast to B to call hello1()
    }
}
