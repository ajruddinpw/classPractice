
class Aeroplane2
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
class CargoPlane2 extends Aeroplane2
{
    public void takeOff()
    {
        System.out.println("cargoplane requires longer runway");
    }
    public void fly()
    {
        System.out.println("cargoplane flies at lower height");
    }

}
class PassengerPlane2 extends Aeroplane2
{
public void takeOff()
{
    System.out.println("passengerplane requires medium size runway");
}
public void fly()
{
    System.out.println("passengerplane flies at medium height");
}
}
class FighterPlane extends Aeroplane2
{
public void takeOff()
{
    System.out.println("fighter plane requires small size runway");
}
public void fly()
{
    System.out.println("fighter plane flies at high height");
}
}
class Airport
{
    public void poly(Aeroplane2 ref){
        ref.takeOff();
        ref.fly();
        System.out.println("---------------------------------");
    }
}
public class LaunchPoly1 {
    public static void main(String[] args) {
        CargoPlane2 cp=new CargoPlane2();
        PassengerPlane2 pp=new PassengerPlane2();
        FighterPlane fp=new FighterPlane();
        Airport a=new Airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
        //cp.takeOff();
        //cp.fly();
        //pp.takeOff();
        //pp.fly();
        //fp.takeOff();
        //fp.fly();
    }
}
