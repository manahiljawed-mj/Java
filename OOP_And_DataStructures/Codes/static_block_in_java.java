package OOP;

class Student {
    float marks;  // Instance variable for marks
    String rollNo;  // Instance variable for roll number
    static int age;  // Static variable for age, shared among all instances
    String name;  // Instance variable for name

    // Static block is called when the class is loaded
    // The class is loaded only once and stored in a special place 'class loader' in JVM
    static {
        System.out.println("In Static Block");
    }

    // Method to display student information
    public void viewinfo() {
        System.out.println("Marks of student: " + marks +
                           ", Roll No: " + rollNo + 
                           ", Age: " + age + 
                           ", Name: " + name);
    }
}

public class static_block_in_java {
    public static void main(String[] args) throws ClassNotFoundException {
        // Static variable is a class member
        // Use class name to call it
        // It is shared between objects
        // It is stored in a special place in JVM
        // Can be called in non-static methods
        Class.forName("OOP.Student");

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
        st1.marks = 9;
        st1.rollNo = "19k-0211";
        st1.name = "Ahmed Ali";

        // Displaying the information of the second student
        st1.viewinfo();
    }
}
