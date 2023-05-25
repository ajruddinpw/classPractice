//custom exception and throw keyword
class MyException extends Exception
{
public MyException(){}
public MyException(String msg)
{
    super(msg);
}
}




public class Customexcep  {
    public static void main(String[] args) {
        int num1=8;
        int num2=-2;
        try{
            if(num2<0)
            {
                Exception e = new MyException("negative number");
               // Exception e= new ArithmeticException("negative number");
             //  Exception e= new Exception();

                throw e;
                //System.out.println("enter a valid number");
            }
            else
            {
                int res=num1/num2;
                System.out.println(res);
            }
           
        }
        catch(Exception e)
        {
           // System.out.println("error"+e);
           System.out.println("enter a valid number"+e);
        }
       
        
    }
    
}
