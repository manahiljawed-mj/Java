public class Ternary_Operator_In_Java {

    public static void main(String a[]) {
        // Declaring and initializing integer variables
        int first = 8;
        int second = 7;
        int result;

        // Using if-else statement to compare 'first' and 'second'
        if (first > second) {
            // Executes if 'first' is greater than 'second'
            result = first;
            System.out.println("Value of result is: " + result);
        } else {
            // Executes if 'first' is not greater than 'second'
            result = second;
            System.out.println("Value of result is: " + result);
        }

        // Using ternary operator as a shortcut for the above if-else statement
        // Ternary operator syntax: condition ? expression1 : expression2
        // If 'first' is greater than 'second', result is assigned 8; otherwise, 7.
        result = first > second ? 8 : 7;
        System.out.println("Value of result using ternary operator is: " + result);
    }
}
