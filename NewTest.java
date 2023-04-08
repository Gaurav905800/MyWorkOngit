import java.util.Scanner;

abstract class Shape{
    abstract public void input();
    abstract public void compute();
    float area ;

    void display(){
        System.out.println("area of the :"+area);
    }
}
class Rectangle extends Shape {
    float length ;
    float breath ;
    // float area ;
    public void input(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lenght of rectangle");
    length = sc.nextFloat();
    System.out.println("Enter the breath of rectangle");
    breath = sc.nextFloat();
    }
    public void compute(){
        area = length *breath;
    }
    public void display(){
        System.out.println("area of rectangle:"+area);
    }
}
class Square extends Shape{
    float length;
    // float area ;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of square");
        length = sc.nextFloat();
    }
    public void compute(){
        area = length *length;
    }
    public void display(){
        System.out.println("area of square"+area);
    }
}
class Circle extends Shape {
    float radius;
    final float pi = 3.15f;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextFloat();
    }
    public void compute(){
        area = pi*radius*radius;
    }
    public void display(){
        System.out.println("area of circle :"+area);
    }
}
class Result {
    public void poly(Shape s){
   s.input();
   s.compute();
   s.display();
    }
}
public class NewTest {
  public static void main(String[] args) {

    Rectangle re = new Rectangle();
    Square s = new Square();
    Circle c = new Circle();

    Result r = new Result();
    r.poly(re);
    r.poly(s);
    r.poly(c);

  }  
}
