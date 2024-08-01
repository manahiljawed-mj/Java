package OOP; // Package declaration

class Student { // Outer class definition
    int a = 7; // Instance variable

    // Inner class definition
    class B {
        // Method in inner class
        public void studentInfo() {
            System.out.println("Hello"); // Print statement
        }
    }
}

public class innerClass { // Main class declaration

    public static void main(String[] a) { // Main method
        Student st = new Student(); // Creating an instance of the outer class
        Student.B obj = st.new B(); // Creating an instance of the inner class

        // Accessing the method of the inner class through its object
        obj.studentInfo();
    }
}
