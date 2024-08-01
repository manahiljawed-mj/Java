package OOP;

// Defining a class Student
class Student {

    // Instance variable age initialized to 7
    int age = 7;

    // Overriding the toString() method to return age as a string
    @Override
    public String toString() {
        // Converting the age to an Integer object
        Integer a = age;
        // Converting the Integer object to a String
        String abc = a.toString();
        // Returning the string representation of age
        return abc;
    }

    // Overriding the equals() method to compare the age of two Student objects
    @Override
    public boolean equals(Object obj) {
        // Checking if the passed object is an instance of Student
        if (obj instanceof Student) {
            // Casting the object to Student
            Student studentObj = (Student) obj;
            // Comparing the age of the current object with the age of the passed object
            return this.age == studentObj.age;
        }
        // Returning false if the passed object is not an instance of Student
        return false;
    }
}

public class toString_and_equal_method {
    public static void main(String[] args) {

        // Creating two Student objects
        Student st = new Student();
        Student st1 = new Student();

        // Checking if the two Student objects are equal based on their age
        boolean state = st.equals(st1);

        // Printing the string representation of the first Student object
        System.out.println(st);

        // Printing the result of the equals() method
        System.out.println(state);
    }
}
