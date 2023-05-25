class Aeroplane1
{
    public void takeOff()
    {
        System.out.println("aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("aeroplane is flying");
    }
}
class CargoPlane1 extends Aeroplane1
{
    public void takeOff()
    {
        System.out.println("cargoplane require longerway");
    }
    public void fly()
    {
        System.out.println("cargoplane flies at lower height");
    }
}
class PassengerPlane1 extends Aeroplane1
{
public void takeOff()
{
    System.out.println("passenger plane requires medium size runway");
}
public void fly()
{
    System.out.println("passengerplane flies at medium height");
}
}
public class Launchpoly {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        PassengerPlane1 pp=new PassengerPlane1();
        Aeroplane1 ref;
        ref=cp;
        ref.fly();
        System.out.println("-----------------");
        ref=pp;
        ref.takeOff();
        ref.fly();
        //pp=cp;
    }
    
}
