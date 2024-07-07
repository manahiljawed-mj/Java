public class Relational_Operators_In_Java {
    
    public static void main(String a[]) {
        int first = 5;
        int second = 6;

        // Result of Relational Operators is always true or false

        // Check if 'second' is greater than 'first'
        boolean greater = second > first;
        System.out.println("Is second greater than first: " + greater);

        // Check if 'second' is less than 'first'
        boolean less = second < first;
        System.out.println("Is second less than first: " + less);

        // Check if 'second' is less than or equal to 'first'
        boolean lessThanEqual = second <= first;
        System.out.println("Is second less than or equal to first: " + lessThanEqual);

        // Check if 'second' is greater than or equal to 'first'
        boolean greaterThanEqual = second >= first;
        System.out.println("Is second greater than or equal to first: " + greaterThanEqual);

        // Check if 'second' is equal to 'first'
        boolean equal = second == first;
        System.out.println("Are second and first equal: " + equal);

        // Check if 'second' is not equal to 'first'
        boolean notEqual = second != first;
        System.out.println("Are second and first not equal: " + notEqual);

    }
}
