package multithreading;
import java.util.*;
class Calc extends Thread{

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
class Message extends Thread{
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




public class multi4 {

     public static void main(String[] args) {
        System.out.println("main method started");
Calc t1=new Calc();
Message t2=new Message();
t1.start();
t2.start();


     }

      
        

}
