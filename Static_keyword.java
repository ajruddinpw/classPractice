//package Static;
public class Static_keyword
{

static int age;

static{
    age=10;
    System.out.println("Static block pahle");
    System.out.println(age);

}
static void disp()
{

    System.out.println("static disp method main  ke baad call karenge");
}
public static void main( String [] args)
{

    System.out.println("main method baadme");
    disp();
}




}