class Human//super class //base class 
//Parent class
{
    int age;
    void sleep()
    {
        age=18;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human //child class //subclass //derived class
{


}
class Inheritance1
{
public static void main(String[] args) {
    Student st=new Student();
    st.sleep();
}

}