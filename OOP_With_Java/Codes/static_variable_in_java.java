package OOP;
// Class representing a student
class Student {
    float marks;  // Instance variable for marks
    String rollNo;  // Instance variable for roll number
    static int age;  // Static variable for age, shared among all instances
    String name;  // Instance variable for name

    // Method to display student information
    public void viewinfo() {
        System.out.println("Marks of student: " + marks +
                           ", Roll No: " + rollNo + 
                           ", Age: " + age + 
                           ", Name: " + name);
    }
}

public class static_variable_in_java {


    public static void main(String[] args) {
        // Static variable is a class member
        // Use class name to call it
        // It is shared between objects
        // It is stored in a special place in JVM
        // Can be called in non-static methods

        // Creating the first student object
        Student st = new Student();
        st.marks = 8;
        st.rollNo = "19k-0210";
        // Assigning value to the static variable 'age' using the class name
        Student.age = 18;
        st.name = "Manahil Jawed";

        // Displaying the information of the first student
        st.viewinfo();

        // Creating the second student object
        Student st1 = new Student();
        st1.marks = 8;
        st1.rollNo = "19k-0210";
        st1.name = "Manahil Jawed";

        // Displaying the information of the second student
        st1.viewinfo();
    }
}
