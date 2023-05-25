package multithreading;
class Example implements Runnable
{
public void run()
{
    for(int i=0;i<3;i++)
    {
       try{
        System.out.println("focus is impotant");
        Thread.sleep(2000);
       }
       catch(InterruptedException e)
       {
System.out.println("thread is interrruppted");
       }
    }

}

}
public class multi10 {
    public static void main(String[] args) {
        Example ex=new Example();
        Thread t1=new Thread(ex);
        t1.start();
        t1.interrupt();

    }
    
}
