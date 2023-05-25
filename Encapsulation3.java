class Student{
private int age;
private String name;
public void setData()
{
    age=18;
    name="ajrudin";
}
public void show()
{
    System.out.println(age+" "+name);
}
}

public class Encapsulation3 {
    public static void main(String[] args) {
        
        Student obj =new Student();
        Student obj1 =new Student();
        obj1.setData();
        obj.setData();
        obj.show();
        obj1.show();
    }
    
}
