    
  class Student{
    int age;
    String name;
    public void  show()
    {
        System.out.println(age+" "+name);
    }
}
  
    public class Encapsulation2 {

        public static void main(String[] args) {
            Student obj=new Student();
            obj.age=19;
            obj.name="ajju";
            obj.show();

        }
    
}
// output: 19 ajju