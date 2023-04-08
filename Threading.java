import java.util.*;
class Live extends Thread{
    public void run(){
        System.out.println("calculation");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number ");
        int num2 = sc.nextInt();
        System.out.println("operation");
        int result = num1+num2;
        System.out.println("the result is :"+result);
        sc.close();
    }
}
class calc extends Thread{
    public void run(){
        System.out.println(" new operation");
        try {
            for(int i = 1;i<10;i++){
                System.out.println("*");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("something worng");
        }
        System.out.println("task ended");
    }
}
public class Threading {
    public static void main(String[] args){
       System.out.println("main thread is started");

       Live l = new Live();
       calc c = new calc();
       l.start();
       c.start();
    }
}
