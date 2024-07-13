package OOP;
abstract class Student
{
   //abstract method can only be used in abstract class
   //abstract class can have both abstract and non abstract methods
   public abstract void studentInfo();

}
class Manahil extends Student //concrete class
{
    //should give definition of all abstract methods 
  public void studentInfo()
  {
    System.out.println("Hello");
  }
}
public class abstractClass {
    //object of abstract class cannot be created
    public static void main(String[] a)
    {
    Manahil obj=new Manahil();
    
    obj.studentInfo();
    }
}
