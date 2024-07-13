package OOP;

// Student class with different constructors
class Student {
    float marks;  // Instance variable for marks
    String rollNo;  // Instance variable for roll number
    int age;  // Instance variable for age
    String name;  // Instance variable for name

    // Default constructor
    Student() {
        marks = 7;
        rollNo = "19";
        age = 8;
        name = "Manahil";
    }

    // Parameterized constructor
    //Constructor Overloading
    Student(float marks, String rollNo, int age, String name) {
        this.marks = marks;  // Using 'this' to refer to instance variable
        this.rollNo = rollNo;  // Using 'this' to refer to instance variable
        this.age = age;  // Using 'this' to refer to instance variable
        this.name = name;  // Using 'this' to refer to instance variable
    }

    // Copy constructor
    Student(Student s) {
        this.marks = s.marks;  // Copying marks from another Student object
        this.rollNo = s.rollNo;  // Copying roll number from another Student object
        this.age = s.age;  // Copying age from another Student object
        this.name = s.name;  // Copying name from another Student object
    }
}

public class Constructors_in_java {
    public static void main(String[] args) {
        // Creating a Student object using the default constructor
        Student st = new Student();
        System.out.println("Name is: " + st.name + ", Age is: " + st.age + ", Roll No is: " + st.rollNo + ", Marks are: " + st.marks);

        // Creating a Student object using the parameterized constructor
        Student st1 = new Student(78.5f, "196", 7, "Manahil Jawed");
        System.out.println("Name is: " + st1.name + ", Age is: " + st1.age + ", Roll No is: " + st1.rollNo + ", Marks are: " + st1.marks);

        // Creating a Student object using the copy constructor
        Student st2 = new Student(st1);
        System.out.println("Name is: " + st2.name + ", Age is: " + st2.age + ", Roll No is: " + st2.rollNo + ", Marks are: " + st2.marks);
    }
}
