package OOP; // Package declaration

// Abstract class definition
abstract class Student {
    // Abstract method declaration
    public abstract void studentInfo();
}

// Main class declaration
public class anonymous_inner_class_and_abstract_class {

    // Main method
    public static void main(String[] a) {
        // Creating an instance of an anonymous inner class that extends Student
        Student st = new Student() {
            // Implementing the abstract method
            public void studentInfo() {
                System.out.println("hello world"); // Print statement
            }
        };

        st.studentInfo(); // Calling the overridden method
    }
}
