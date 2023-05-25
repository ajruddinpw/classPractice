package multithreading;
import java.util.Scanner;

public class Multi_task1 {
    public static void main(String[] args) {
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
        System.out.println("printing *task started");

for(int i=0;i<4;i++)
{
    System.out.println("*");
}


        System.out.println("printing * task ended");
        System.out.println("*******************************");
        System.out.println(" display important message task");
        for(int i=0;i<3;i++)
        {
            System.out.println("focus is important to master skills");
        }


        System.out.println("display important message task ended");

    System.out.println("*********************************");
    }
    
}
