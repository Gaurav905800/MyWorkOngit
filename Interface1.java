interface Animal{
    public void animalsSound();
    public void run();
}
class Tiger implements Animal{
    public void animalsSound(){
System.out.println("Tiger eat flash");
    }
    public void run (){
        System.out.println("Tiger run very fast");
    }
}
public class Interface1 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.animalsSound();
        t.run();
    }
}
