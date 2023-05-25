class Student1// extends object
{
    private String name;
    private int age;
    public Student1()
    {
        //super();
        this("rohit ",19);
        System.out.println("default constructor is called ");
        name="rohan";
        age=18;
    }
    public Student1(String name)
    {
        this();
        this.name=name;
        age=19;
    }
    public Student1(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void disp()
    {
        System.out.println(name);
        System.out.println(age);
    }
}



public class Constructor3 {
    public static void main(String[] args) {
        Student st1=new Student 1();
        st1.disp();
        Student1 st2=new Student1("rahul");
        st2.disp();
    }
    
}
