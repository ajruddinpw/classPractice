package multithreading;
class Demo1 implements Runnable
{
    public void run()
    {
System.out.println("child thread executing");
try{
    Thread.sleep(3000);
}
catch(Exception e)
{
    System.out.println("some problem");
}
System.out.println("child thraed task completeed");
    }
}
public class multi8 {
    public static void main(String[] args) {
        System.out.println("main thread started");
        Demo1 d=new Demo1();
        Thread t1=new Thread();
        t1.start();
    }
    
}
