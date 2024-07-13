package OOP;

class Student {
    float marks;
    String rollNo;
    int age;
    String name;
}
public class enchanced_forloop_in_java {

    public static void main(String a[])
    {
        // Creating the first student object
        Student st = new Student();
        st.marks = 8;
        st.rollNo = "19k-0210";
        st.age = 18;
        st.name = "Manahil Jawed";

        // Creating the second student object
        Student st1 = new Student();
        st1.marks = 8;
        st1.rollNo = "19k-0211";
        st1.age = 18;
        st1.name = "Manahil";

        // Creating an array to hold student objects
        Student students[] = new Student[2];

        // Assigning student objects to the array
        students[0] = st;
        students[1] = st1;

        // Alternative way to create and initialize an array of student objects
        Student students1[] = {st, st1};

        // Printing the values of student objects
        System.out.println("Values of Student Object are:");

        //enchanced for loop can only be used with array or array like data types such as Collections
        

        for(Student std:students)
        {
            System.out.println("Marks of student " + ": " + std.marks +
            ", Roll No: " + std.rollNo + 
            ", Age: " + std.age + 
            ", Name: " + std.name);
        }

    }
    
}