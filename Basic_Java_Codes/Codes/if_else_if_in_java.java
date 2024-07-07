public class if_else_if_in_java {
    public static void main(String a[]) {
        // Declaring and initializing two integer variables
        int first = 8;
        int second = 7;

        // Using if-else-if ladder to check different conditions
        if (first > second) {
            // Executes if 'first' is greater than 'second'
            System.out.println("If Condition Is True");
        } else if (first == second) {
            // Executes if 'first' is equal to 'second'
            System.out.println("Else if Condition Is True");
        } else {
            // Executes if none of the above conditions are true
            System.out.println("Else Condition Is True");
        }
    }
}
