package OOP;

// Class Student to demonstrate the use of 'this' keyword
class Student {
    public int age; // Public variable to store the age of the student

    // Method to set age without using 'this' keyword
    public void set(int age, Student s) {
        age = age; // This assigns the parameter 'age' to itself, not affecting the class variable
        s.age = age; // This sets the age of the passed Student object to the parameter 'age'
    }

    // Method to set age using 'this' keyword
    public void set1(int age) {
        this.age = age; // 'this.age' refers to the class variable, and assigns the parameter 'age' to it
    }
}

public class this_keyword {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student st = new Student();
        
        // Calling set method without 'this' keyword
        st.set(7, st);
        // The first assignment in set() does nothing, but the second one sets st.age to 7
        System.out.println("Age is: " + st.age); // Prints: Age is: 7
        
        // Calling set1 method with 'this' keyword
        st.set1(8);
        // This sets st.age to 8
        System.out.println("Age is: " + st.age); // Prints: Age is: 8
    }
}
