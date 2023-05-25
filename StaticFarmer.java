import java.util.Scanner;
//package String;

class Farmer{

    int pa;
    float td;
   static float ri;
    float si;
    static
    {
        ri=8.5f;
    }

void input()
{
    Scanner scan=new Scanner(System.in);
    System.out.println("please mention the amount required");
    pa=scan.nextInt();
    System.out.println("pleasee mention the time duration");
    td=scan.nextFloat();
    ri=8.5f;

}
void compute()
{
    si=(pa*td*ri)/100f;

}
void disp()
{
    System.out.println("simple interestis" + si);
}

}




public class StaticFarmer {

    public static void main(String [] args)
    {
Farmer f1=new Farmer();
f1.input();
f1.compute();
f1.disp();
Farmer f2=new Farmer();
f2.input();
f2.compute();
f2.disp();

    }
    
}
