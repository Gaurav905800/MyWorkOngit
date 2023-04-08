class A{
    public void show(){
        System.out.println("in show");
    }

   static class B{
    public void display(){
    System.out.println("in display");
    }
    }
}

public class implementation {
    public static void main(String[] args){
        A obj = new A();
        A.B obj1 = new A.B();
        obj1.display();
        obj.show();
    }
}
