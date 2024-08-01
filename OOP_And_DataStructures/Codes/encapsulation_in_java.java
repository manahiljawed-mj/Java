package OOP;

// Encapsulation example: Student class with private, public, and protected fields
class Student {
    private String name; // Private variable, only accessible within this class
    public int age; // Public variable, accessible from anywhere
    protected float height; // Protected variable, accessible within package and subclasses

    // Setter method for name (encapsulation)
    public void setName(String objname) {
        name = objname;
    }

    // Getter method for name (encapsulation)
    public String getName() {
        return name;
    }

    // Method to print the information of the student
    public void info() {
        System.out.println("Name: " + name + ", Age: " + age + ", Height: " + height);
    }
}

// Subclass Manahil extends Student
class Manahil extends Student {
    // Constructor to initialize height
    public Manahil() {
        // Setting the protected variable 'height' from the subclass
        height = 7;
    }
}

public class encapsulation_in_java {
    public static void main(String[] args) {
        // Creating an instance of Student
        Student st = new Student();

        // Setting the name using setter method
        st.setName("Manahil");

        // Getting the name using getter method and printing it
        System.out.println("Name is: " + st.getName());

        // Setting the age directly since it is public
        st.age = 23;

        // Printing the age
        System.out.println("Age is: " + st.age);

        // Creating an instance of Manahil (subclass of Student)
        Manahil m = new Manahil();

        // Accessing and printing the protected height field of the subclass instance
        System.out.println("Height is: " + m.height);

        // Displaying the information of the Student instance using the info method
        st.info();
    }
}
