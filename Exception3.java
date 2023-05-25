import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {
    public static void main(String[] args) {
        int num=0;
        Scanner sc=new Scanner(System.in);
        try
       {
        num=sc.nextInt();
       } 
    //    catch(InputMismatchException e)
    //    {
    //     System.out.println("please enter a number");
    //    }
    finally
    {
        sc.close();
        System.out.println("resource closed");
    }
        System.out.println(num);
    } 
    
}
