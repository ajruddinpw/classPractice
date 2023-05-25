//package Static;

class Demo1
{

    static int a;
    static int b;

    int m;
    int n;

    static
    {
     a=10;
     b=20;
    System.out.println("control in static block");
    }

    {
m=100;
n=200;
System.out.println("control in non static  block ");
    }
    static void disp1()
    {
        System.out.println("value of static var " + a);
        System.out.println("value of static var" + b);
    }
     void disp2()
    {
        System.out.println("value of instance var " + m);
        System.out.println("value of instance var" + n);
    }


}

public class Static3 {
    public static void main(String[] args) 
    {
        Demo1 d=new Demo1();
        Demo1.disp1();
        d.disp2();
    }
    
}

