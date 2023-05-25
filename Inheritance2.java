class Human1
{
     String name;
    int age;
    Human1()
    {
        System.out.println("Human class constructor");
    }
    void sleep()
    {
        age=18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1
{
    public Student1()
    {
        super();
    }
    void disp()
    {
        System.out.println("the age is: " +age);
       System.out.println("the name is :" +name);
    }
}
public class Inheritance2 {
    public static void main(String[] args) {
         Student1 st1=new Student1();
         st1.sleep();
         st1.disp();
    }
    
}
