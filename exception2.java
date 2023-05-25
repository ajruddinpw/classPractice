public class exception2 {
    
    public static void main(String[] args) {
        int num1=6;
        int num2=2;
        int res=0;
        int values[]={1,2,3,4};
        String name=null;
        
    

try
{
    res=num1/name.length();
   // System.out.println("in try statement");
   System.out.println(values[5]);

}
catch(ArithmeticException e)
{
    System.out.println("cannot divide by zero............"+e);
}
catch(ArrayIndexOutOfBoundsException e)
{
    System.out.println(values[values.length-1]);
    System.out.println("stay in your limits");
}
catch(Exception e)
{
    System.out.println("something went wrong");
}

//    System.out.println("addition is ="+res);
System.out.println("result ="+res);
   System.out.println("bye...");
}

}
