class ArithematicOperatorsInJava {

    public static void main(String a[]) {
        // Declaring and initializing integer variables
        int first = 8;
        int second = 7;

        // Performing addition
        int sum = first + second;
        System.out.println("Sum: " + sum); // Print statement for sum

        // Performing subtraction
        int minus = first - second;
        System.out.println("Difference: " + minus); // Print statement for difference

        // Performing multiplication
        int multiply = first * second;
        System.out.println("Product: " + multiply); // Print statement for product

        // Performing integer division
        int divide = first / second;
        System.out.println("Division (integer): " + divide); // Print statement for integer division

        // Declaring and initializing floating-point variable
        float third = 8.8f;

        // Performing floating-point division
        float division = third /(float) first;//better to type cast first to float 
        System.out.println("Division (floating-point): " + division); // Print statement for floating-point division

        // Incrementing 'first' variable in different ways
        first = first + 1;
        System.out.println("Incremented (first = first + 1): " + first);

        first += 1;
        System.out.println("Incremented (first += 1): " + first);

        first++;
        System.out.println("Post Increment (first++): " + first);

        ++first;
        System.out.println("Pre Increment (++first): " + first);

        // Example of prefix and postfix increment operators
        int result = ++first; // Prefix increment
        System.out.println("Prefix Increment Result: " + result);

        int result1 = first++; // Postfix increment
        System.out.println("Postfix Increment Result: " + result1);
    }

}
