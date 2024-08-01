package OOP;

import java.util.Scanner;

public class input_from_console {

    public static void main(String a[]) {
        // Create a Scanner object to read input from the console
        Scanner scan = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.println("Enter an Integer Value:");
        int first = scan.nextInt(); // Read integer input
        scan.nextLine(); // Consume newline left by nextInt()

        // Display the integer entered by the user
        System.out.println("Integer Entered is: " + first);

        // Prompt user to enter a string
        System.out.println("Enter a String:");
        String stringValue = scan.nextLine(); // Read string input

        // Display the string entered by the user
        System.out.println("You entered the string: " + stringValue);

        // Prompt user to enter a float
        System.out.println("Enter a Float value:");
        float third = scan.nextFloat(); // Read float input

        // Display the float entered by the user
        System.out.println("Float entered is: " + third);

        // Prompt user to enter a character
        System.out.println("Enter a Character:");
        char fourth = scan.next().charAt(0); // Read character input

        // Display the character entered by the user
        System.out.println("Character Entered is: " + fourth);

        // Close the Scanner to release resources
        scan.close();
    }
}
