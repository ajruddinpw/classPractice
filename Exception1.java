public class Exception1 {
    public static void main(String[] args) {
       // system.out.println(".........................")//syntax error bcoz s is small or not terminated
    //    int num1=6;
    //    int num2=5;
    int num1=6;/* line 6 and 7 are normal statement*/
    int num2=0;
    int res=0;
    //    int res=num1-num2;//logical error
    // int res=num1*num2;// critical statement1
    try
    {
        res=num1/num2;
        System.out.println("in try statement");
    }
    catch(Exception e)
    {
        System.out.println("something went wrong............"+e);
    }
   
    //    System.out.println("addition is ="+res);
    System.out.println("result ="+res);
       System.out.println("bye...");
    }
    
}
