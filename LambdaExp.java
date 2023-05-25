@FunctionalInterface
interface Car
{
    void drive(int avg,int ts);

}
public class LambdaExp{
    public static void main(String[] args) {
        Car obj=(avg,ts)-> System.out.println("driving..." + avg + " :"+ ts);
        obj.drive(22, 77);
    }
}
// {
//     void drive(int avg);
//     //void drive();
//     //void show(); only works with functional interface
// }

// public class LambdaExp {
//     public static void main(String[] args) {
//         Car obj=avg -> System.out.println("driving..." + avg);
        
        
//         obj.drive(16);
//     }
    
// }

