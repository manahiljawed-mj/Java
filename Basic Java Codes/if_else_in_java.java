public class if_else_in_java {
    public static void main(String a[]) {
        // Conditional Statements are used to decide the flow of the program

        // Declaring and initializing two integer variables
        int first = 8;
        int second = 7;

        // if-else statement to compare the values of 'first' and 'second'
        if (first > second) {
            // If 'first' is greater than 'second', increment 'first' by 1
            first++;
            // Print the new value of 'first' to the console
            System.out.println("Value of first is: " + first);
        } else {
            // If 'first' is not greater than 'second', increment 'second' by 1
            second++;
            // Print the new value of 'second' to the console
            System.out.println("Value of second is: " + second);
        }
    }
}
