public class Logical_Operators_In_Java {
    
    public static void main(String a[]) {
        // Example variables
        int first = 8;
        int second = 10;
        int third = 11;
        int fourth = 12;

        // && (Logical AND) operator
        boolean result = first > second && third > fourth;
        System.out.println("Result of first > second && third > fourth: " + result);

        // || (Logical OR) operator
        boolean result1 = first > second || third > fourth;
        System.out.println("Result of first > second || third > fourth: " + result1);

        // ! (Logical NOT) operator
        boolean result3 = !result1;
        System.out.println("Result of !result1: " + result3);

        // Print statements demonstrate the results of each logical operation
    }
}
