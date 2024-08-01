package OOP;

class Count{

    public int value=0;

    public synchronized void increment()
    {
        value++;
    }

}

class First extends Count implements Runnable 
{
    public void run(){
    for(int i=0;i<10;i++)
    {
        increment();
    }
}
}
public class race_condition {


    public static void main(String[] a) throws InterruptedException
    {
        Runnable fr = new First(); // Create a single instance

        Thread t1 = new Thread(fr); // Pass the same instance to both threads
        Thread t2 = new Thread(fr);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Count is " + ((First)fr).value); // Print the value from the single instance
    

        
    }
    
}
