


class Demo
{

static void disp1()
{
    System.out.println("Static disp1");
}
void disp2()
    {
        System.out.println("none static disp2");
    }
}


public class Static2 {

    public static void main(String[] args)
    {

       Demo.disp1();
       //Demo.disp2();
       Demo d=new Demo();
       d.disp1();
       d.disp2();

    }
    
}
