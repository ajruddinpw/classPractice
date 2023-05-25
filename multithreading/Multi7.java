
package multithreading;
import java.util.*;

class MyThread1 extends Thread{

public void run()
{
  String tName= Thread.currentThread().getName();
  if (tName.equals("calc"))
  {
    calc();
  }
  else{
    importantMessage();
  }
}
public void calc()
{
    System.out.println("calculation  task started");
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter the first number");
    int num1=sc.nextInt();
    System.out.println("please enter the second  number");
    int num2=sc.nextInt();
    int res=num1+num2;
    System.out.println(res);
    System.out.println("calculation task ended");
    System.out.println("*********************************");
}
public void importantMessage()
{
    System.out.println(" display important message task");
    try{

        for(int i=0;i<3;i++)
        {
            System.out.println("focus is important to master skills");
            Thread.sleep(2000);
        }
    }
    catch(Exception e)
    {
        System.out.println("some problem");
    }
    
        System.out.println("display important message task ended");

    }
}





public class Multi7 {

     public static void main(String[] args) {
        System.out.println("main method started");

MyThread1 thread1= new MyThread1();
MyThread1 thread2= new MyThread1();
thread1.setName("calc");
thread2.setName("print");
thread1.start();
thread2.start();

     }

      
        

}




