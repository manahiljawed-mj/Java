package OOP;

// Normal Interface AA with two abstract methods
interface AA {
    void sum(); // Abstract method to be implemented
    void minus(); // Abstract method to be implemented
}

// Functional Interface BB with one abstract method (annotated with @FunctionalInterface)
@FunctionalInterface
interface BB {
    void multiply(); // Abstract method to be implemented
}

// Functional Interface BBB with one abstract method taking an integer parameter (annotated with @FunctionalInterface)
@FunctionalInterface
interface BBB {
    void multiply(int i); // Abstract method to be implemented
}

// Functional Interface BBBB with one abstract method taking an integer parameter and returning an integer (annotated with @FunctionalInterface)
@FunctionalInterface
interface BBBB {
    int multiply(int i); // Abstract method to be implemented
}

// Marker Interface CC (no methods)

// Class B implementing interface AA
class B implements AA {

    // Implementing method sum from interface AA
    public void sum() {
        System.out.println("Sum method implementation");
    }

    // Implementing method minus from interface AA
    public void minus() {
        System.out.println("Minus method implementation");
    }
}

// Main class lambda_expression to demonstrate interfaces and lambda expressions
public class lambda_expression {

    public static void main(String[] args) {
        B obj = new B(); // Creating an object of class B

        obj.sum(); // Calling implemented method sum() from interface AA
        obj.minus(); // Calling implemented method minus() from interface AA

        // Using anonymous class to implement BB interface and define multiply method
        BB obj1 = new BB() {
            public void multiply() {
                System.out.println("Multiply method implementation");
            }
        };
        obj1.multiply(); // Calling multiply method using anonymous class implementation

        // Using lambda expression to implement BB interface and define multiply method
        BB obj2 = () -> System.out.println("Multiply method implementation");
        obj2.multiply(); // Calling multiply method using lambda expression

        // Using lambda expression to implement BBB interface and define multiply method with parameter
        BBB obj3 = i -> System.out.println("Multiply method implementation: " + i);
        obj3.multiply(5); // Calling multiply method with parameter using lambda expression

        // Using lambda expression to implement BBBB interface and define multiply method with parameter and return value
        BBBB obj5 = i -> i * 5;
        int result = obj5.multiply(5); // Calling multiply method with parameter and returning a value using lambda expression
        System.out.println("Result of multiplication: " + result);
    }
}
