/*@FunctionalInterface
interface Car
{
    void drive(int avg, int topSpeed);
}


public class AnnonymousInner {
    public static void main(String[] args) {
        Car obj = (avg, ts) -> System.out.println("Running with avg " + avg);
          
    
        obj.drive(16, 140);

       
    }
}*/
interface Car
{
    void drive();
}
// class Wagnor implements Car{
//     public void drive()
//     {
//         System.out.println("driveing...");
//     }
// }
public class AnnonymousInner{
    public static void main(String[] args) {
        Car obj=new Car() {
            public void drive()
            {
               System.out.println("driving....");
            }
        };
        obj.drive();
            
        
    }
}
