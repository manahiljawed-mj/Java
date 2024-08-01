package OOP;


class A extends Thread{
    public void run()
    {
        for(int i=0;i<50;i++)
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

class B extends Thread{
    public void run()
    {
        for(int i=0;i<50;i++)
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

public class Multiple_Threads {
    public static void main(String[] a)
    {
        A obj=new A();
        B obj1=new B();
        System.out.println("obj Thread priority is:"+obj.getPriority());
        obj1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("obj1 Thread priority is:"+obj1.getPriority());
         
        obj.start();
        obj1.start();

        
        
    }


}
