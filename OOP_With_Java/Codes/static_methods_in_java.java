package OOP;

// Class representing a student
class Student {
    float marks;  // Instance variable for marks
    String rollNo;  // Instance variable for roll number
    static int age;  // Static variable for age, shared among all instances
    String name;  // Instance variable for name

    // Static method to display student information
    public static void viewinfo(Student st) {
        System.out.println("Marks of student: " + st.marks +
                           ", Roll No: " + st.rollNo + 
                           ", Age: " + age +  // Accessing static variable 'age'
                           ", Name: " + st.name);
    }
}

public class static_methods_in_java {
    public static void main(String[] args) {
        // Static method is a class member
        // Use class name to call it
        // It is shared between objects
        // It is stored in a special place in JVM

        // Creating the first student object
        Student st = new Student();
        st.marks = 8;
        st.rollNo = "19k-0210";
        // Assigning value to the static variable 'age' using the class name
        Student.age = 18;
        st.name = "Manahil Jawed";

        // Displaying the information of the first student using the static method
        Student.viewinfo(st);

        // Creating the second student object
        Student st1 = new Student();
        st1.marks = 8;
        st1.rollNo = "19k-02101";
        st1.name = "Manahil";

        // Displaying the information of the second student using the static method
        Student.viewinfo(st1);
    }
}
