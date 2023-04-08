interface  Computer {
  void compileCode();
}

class Laptop implements Computer{
  public void compileCode(){
System.out.println("you get 5 error");
  }
}
class Desktop implements Computer{
  public void compileCode(){
    System.out.println("you get 5 error,faster");
      } 
}
class Developer{
public void buildApp(Computer obj){
  System.out.println("Building app.....");
  // Laptop obj = new Laptop();
  obj.compileCode();
}
}
public class Interface2 {
    public static void main(String[] args ){
      Developer d = new Developer();
      // Desktop obj = new Desktop();
      Computer obj = new Desktop();
      // Laptop obj = new Laptop();
      d.buildApp(obj);
    }
   }
