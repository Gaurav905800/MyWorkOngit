class Aeroplane1{
    public void takeOf(){
        System.out.println("The plane is takeOf");
    }
    public void fly(){
        System.out.println("plane fly's ");
    }
}

class CargoPlane1 extends Aeroplane1{
     public void takeOf(){
        System.out.println("The plane is takeof from the long runway");
    }
    public void fly(){
        System.out.println("Plane fly's on low altitude");
    }
}
class FighterPlane extends Aeroplane1{
    public void takeOf(){
        System.out.println("The plane is takeof from the short runway");
    }
    public void fly(){
        System.out.println("plane fly's on high altitude");
    }
}
class PassangerPlane extends Aeroplane1{
    public void takeOf(){
        System.out.println("The plane is takeof from the medium runway");
    }
    public void fly(){
        System.out.println("plane fly's on medium altitude");
    }
}
class Airport 
{
    public void ploy(Aeroplane1 ref){
        ref.takeOf();
        ref.fly();
        System.out.println("--------------------------------------");
}
}
public class Polymorphism{
    public static void main(String[] args) {
        
        CargoPlane1 cp = new CargoPlane1();
        FighterPlane fp = new FighterPlane();
        PassangerPlane pp = new PassangerPlane();

        Airport a = new Airport();
        a.ploy(cp);
        a.ploy(fp);
        a.ploy(pp);

   
        
    }
}