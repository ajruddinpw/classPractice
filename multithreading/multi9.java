package multithreading;
class Printing implements Runnable{
    public void run()
    {
        try{
            for(int i=0;i<2;i++)
            {
                System.out.println("focus is important");
                Thread.sleep(3000);
            }
        }
        catch(Exception e)
        {
            System.out.println("some problem");
        }
    }

}
public class multi9 {
    public static void main(String[] args) throws Exception
    {
        
        System.out.println("main Thread started");
Printing p=new Printing();
Thread t1=new Thread(p);
System.out.println(t1.isAlive());//false
t1.start();
System.out.println(t1.isAlive());//true
t1.join();


        System.out.println("main thread finished the work");
    }
    
}
