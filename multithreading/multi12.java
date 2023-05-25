package multithreading;

class Library implements Runnable
{
    String res1=new String("java");
    String res2=new String("dbms");
    String res3=new String("sql");
public void run()
{
String name=Thread.currentThread().getName();
if(name.equals("student1"))
{
try{
Thread.sleep(3000);
synchronized(res1)
{
    System.out.println("student1 has aquired "+res1);
    Thread.sleep(3000);
    synchronized(res2)
    {
        System.out.println("student2 has aquired "+res2);
        Thread.sleep(3000);
        synchronized(res3)
        {
            System.out.println("student2 has aquired "+res3);
            Thread.sleep(3000);
       
       
             }
        }
    }
}
catch(Exception e)
{
    System.out.println("some problem");
}


}
else
{
    try
    {
        Thread.sleep(3000);
        synchronized(res1)
        {
            System.out.println("student1 has aquired "+res1);
            Thread.sleep(3000);
            synchronized(res2)
            {
                System.out.println("student2 has aquired "+res2);
                Thread.sleep(3000);
                synchronized(res3)
                {
                    System.out.println("student2 has aquired "+res3);
                    Thread.sleep(3000);
                }
            }

        }

    }
    catch(Exception e)
    {
        System.out.println("some problem");
    }
}


public class multi12 {
    public static void main(String[] args) {
        Library lb=new Library();
        Thread t1=new Thread(lb);
        Thread t2=new Thread(lb);
        t1.setName("student1");
        t2.setName("student2");
        t1.start();
        t2.start();

    }
    
}}}

