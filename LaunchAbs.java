abstract class Aeroplane3
{
    //abstract int age;
     abstract public void takeOff();
     abstract public void fly();
    public void landing()
    {
        System.out.println("Aeroplane is landing");
    }
}
class CargoPlane3 extends Aeroplane3
{
    public void takeOff()
    {
System.out.println("cargoplane requires longer runway");
    }
    public void fly()
    {
        System.out.println("cargoplane flies at lower height");
    }
    public void alert()
    {
        System.out.println("alert .....");
    }
}
class PassengerPlane3 extends Aeroplane3
{
public void takeOff()
{
    System.out.println("passengerplane requires medium size runway");
}
public void fly()
{
    System.out.println("passenger plane flies at medium height");
}
}
public class LaunchAbs {
    public static void main(String[] args) {
        Aeroplane3 ref1=new CargoPlane3();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane3) ref1).alert();
        Aeroplane3 ref3=new PassengerPlane3();
        ref3.takeOff();
        ref3.fly();
        ref3.landing();
        //Aeroplane3 ref=new Aeroplane3();
    }
    
}
