package OOP;

public class methods_in_java {

    public static void main(String a[]) {
        // Declaring two integer variables
        int first = 7;
        int second = 8;

        // Creating an instance of the Calculator class
        Calculator calc = new Calculator();

        // Performing various calculations using methods of the Calculator class
        int sum = calc.sum(first, second);
        int minus = calc.minus(first, second);
        int multiply = calc.multiply(first, second);
        int divide = calc.divide(first, second);
        int modulo = calc.modulo(first, second);

        // Printing the results of the calculations
        System.out.println("Sum of first and second is: " + sum);
        System.out.println("Result of second minus first is: " + minus);
        System.out.println("Product of first and second is: " + multiply);
        System.out.println("Result of second divided by first is: " + divide);
        System.out.println("Modulo of second by first is: " + modulo);
    }

}

class Calculator {

    // Method to calculate the sum of two integers
    public int sum(int first, int second) {
        return first + second;
    }

    // Method to calculate the difference between two integers
    public int minus(int first, int second) {
        return second - first;
    }

    // Method to calculate the product of two integers
    public int multiply(int first, int second) {
        return second * first;
    }

    // Method to calculate the quotient of dividing second by first
    public int divide(int first, int second) {
        return second / first;
    }

    // Method to calculate the remainder of dividing second by first
    public int modulo(int first, int second) {
        return second % first;
    }

}
