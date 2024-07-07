package OOP;

// Defining the sum class
class sum {

    // Method to calculate the sum of two integers
    public int sumCalculator(int first, int second) {
        // Calculating the sum of the two integers
        int sum = first + second;

        // Returning the calculated sum
        return sum;
    }
}
public class classes_and_objects {

    public static void main(String a[]) {
        // Declaring two integer variables
        int first = 9;
        int second = 9;

        // Creating an instance of the sum class
        sum calc = new sum();

        // Calling the sumCalculator method of the sum class
        // and storing the result in the result variable
        int result = calc.sumCalculator(first, second);

        // Printing the result of the sum calculation
        System.out.println("Sum of first and second is " + result);
    }
}


