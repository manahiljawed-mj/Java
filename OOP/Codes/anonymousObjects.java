package OOP;

// Student class
class Student {
    // Default constructor
    Student() {
        System.out.println("Object Created"); // Message indicating object creation
    }

    // Method to display a message
    public void show() {
        System.out.println("In Show Method"); // Message indicating the method is called
    }
}

public class anonymousObjects {
    public static void main(String[] args) {
        // Reference Creation
        Student st;
        st = new Student(); // Object creation and assignment to reference 'st'
        st.show(); // Calling the 'show' method on the referenced object

        // Creating an anonymous object
        new Student(); // Object is created, but not referenced or used

        // Creating an anonymous object and immediately calling the 'show' method
        new Student().show(); // Object is created and 'show' method is called on it
    }
}
