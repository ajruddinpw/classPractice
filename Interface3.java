
interface A
{
    void show(); 
}
interface X
{
    void abc();
}
class B implements A,X
{
    public void show()
    {
        System.out.println("in show");
    }
    public void abc()
    {
        System.out.println("in abc");
    }
}

public class Interface3{
    public static void main(String[] args) {
       B obj = new B();
       obj.show();
       obj.abc();
      
    }
}

