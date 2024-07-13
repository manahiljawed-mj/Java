package OOP;


class A implements Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class Runnable_In_Java {
    public static void main(String[] a)
    {
        Runnable obj=new A();
        Runnable obj1=new B();

        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj1);

        t1.start();
        t2.start();
    
        
        
    }


}
