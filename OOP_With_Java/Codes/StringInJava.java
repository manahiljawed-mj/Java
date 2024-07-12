package OOP;

public class StringInJava {

    public static void main(String[] args) {
        // Creating a string using string literal
        String name = "manahil";

        // Creating a string using the 'new' keyword
        String name1 = new String("manahil");

        // Printing the memory address name1 is pointing to
        System.out.println("Address name1 is pointing to: " + System.identityHashCode(name1));

        // In JVM's heap, there is a special memory area known as the constant String pool
        // By default, strings are immutable

        // Demonstrating immutability of strings
        // Concatenating a new string to name1 creates a new String object
        name1 = name1.concat(" jawed");
        System.out.println("Updated name1: " + name1);
        // Printing the new memory address name1 is pointing to
        System.out.println("Address name1 is now pointing to: " + System.identityHashCode(name1));

        // To make strings mutable, there are two common classes: StringBuilder and StringBuffer

        // Using StringBuilder for mutable strings
        StringBuilder mutableName = new StringBuilder("manahil");
        // Appending a string to the StringBuilder object
        mutableName.append(" jawed");
        System.out.println("Mutable name using StringBuilder: " + mutableName);
        // Printing the memory address mutableName is pointing to
        System.out.println("Address mutableName is pointing to: " + System.identityHashCode(mutableName));

        // Using StringBuffer for mutable strings
        StringBuffer mutableNameBuffer = new StringBuffer("manahil");
        // Appending a string to the StringBuffer object
        mutableNameBuffer.append(" jawed");
        System.out.println("Mutable name using StringBuffer: " + mutableNameBuffer);
        // Printing the memory address mutableNameBuffer is pointing to
        System.out.println("Address mutableNameBuffer is pointing to: " + System.identityHashCode(mutableNameBuffer));
    }
}
