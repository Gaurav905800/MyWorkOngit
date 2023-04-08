import java.util.Scanner;

class Rectangle {
    float length ;
    float breath ;
    float area ;
    public void input(){
    // System.out.println("area of rectangle");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the lenght of rectangle");
    length = sc.nextFloat();
    System.out.println("Enter the breath of rectangle");
    breath = sc.nextFloat();
    }
    public void compute(){
        area = length *breath;
        System.out.println("area of rectangle:"+area);
    }
}
class square{
    float length;
    float area ;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of square");
        length = sc.nextFloat();
    }
    public void compute(){
        area = length *length;
        System.out.println("area of square"+area);
    }
}
class circle{
    float radius;
    float area ;
    final float pi = 3.15f;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        radius = sc.nextFloat();
    }
    public void compute(){
        area = pi*radius*radius;
        System.out.println("area of circle :"+area);
    }
}
public class Test {
 public static void main(String[] args) {
    Rectangle re = new Rectangle();
    re.input();
    re.compute();
    square sq = new square();
    sq.input();
    sq.compute();
    circle c = new circle();
    c.input();;
    c.compute();
 }   
}
