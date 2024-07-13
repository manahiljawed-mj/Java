package OOP;

// Superclass Calculator
// Calculator class has an add method
class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

// Subclass AdvCalculator extends Calculator
// Single Inheritance: AdvCalculator inherits from Calculator
// AdvCalculator is a Calculator that has an addone method in addition to the add method
class AdvCalculator extends Calculator {
    // Method to add two integers and increment the result by 1
    public int addone(int a, int b) {
        return a + b + 1;
    }
}

// Subclass VeryAdvCalculator extends AdvCalculator
// Multilevel Inheritance: VeryAdvCalculator inherits from AdvCalculator which in turn inherits from Calculator
class VeryAdvCalculator extends AdvCalculator {
    // Method to add two integers and increment the result by 2
    public int addtwo(int a, int b) {
        return a + b + 2;
    }
}

// Main class inheritance
class inheritance {
    public static void main(String[] args) {
        // Creating an instance of VeryAdvCalculator
        VeryAdvCalculator adv = new VeryAdvCalculator();
        
        // Calling the inherited add method from Calculator
        int aa = adv.add(7, 8);
        
        // Calling the inherited addone method from AdvCalculator
        int b = adv.addone(7, 8);
        
        // Calling the addtwo method from VeryAdvCalculator
        int c = adv.addtwo(7, 8);
        
        // Printing the results
        System.out.println("add is: " + aa); // Output: add is: 15
        System.out.println("add one is: " + b); // Output: add one is: 16
        System.out.println("add two is: " + c); // Output: add two is: 17
    }
}
