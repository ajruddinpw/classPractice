class Aeroplane
{
    public void  takeOff()
    {
        System.out.println("Aeroplane is taking off");
    }
    public void fly()
    {
        System.out.println("aeroplane is flying");
    }
}
class CargoPlane extends Aeroplane
{
public void fly()
{
    System.out.println("cargoplane flies at lower height");
}
public void carryGoods()
{
    System.out.println("cargoplane carries goods");
}
}
class PassengerPlane extends Aeroplane
{
    public void fly()
    {
        System.out.println("passengerplane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("passenger plane carries passenger");
    }
}
public class Inheritance5 {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        cp.takeOff();
        cp.fly();
        PassengerPlane pp=new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }
    
}
