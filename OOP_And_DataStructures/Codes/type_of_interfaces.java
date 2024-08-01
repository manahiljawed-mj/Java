package OOP;


//Normal Interface having 2 or more methods
interface AA{
    void sum(); // Abstract method to be implemented
    void minus(); // Abstract method to be implemented
}
//Functional Interface having one method
@FunctionalInterface
interface BB{
    void multiply();

}
//Marker Interface having no method
interface CC
{

}

class B implements AA {

    // Implementing method sum from interface A
    public void sum() {
        System.out.println("Sum method implementation");
    }

    // Implementing method minus from interface A
    public void minus() {
        System.out.println("Minus method implementation");
    }
}


class D implements BB {

    // Implementing method multiply from interface A
    public void multiply() {
        System.out.println("Multiply method implementation");
    }
}
public class type_of_interfaces {

    public static void main(String[] a)
    {
        B obj=new B();

        obj.sum();
        obj.minus();

        D obj1=new D();
        obj1.multiply();
    }
    
}
