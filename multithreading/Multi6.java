
package multithreading;
import java.util.*;
class Demo
{

}
class Calc extends Demo implements Runnable{

public void run()
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


}
class Message implements Runnable{
public void run()
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




public class Multi6 {

     public static void main(String[] args) {
        System.out.println("main method started");
Calc c1=new Calc();
Message m1=new Message();
Thread t1=new Thread(c1);
Thread t2=new Thread(m1);
t1.start();
t2.start();


     }

      
        

}



