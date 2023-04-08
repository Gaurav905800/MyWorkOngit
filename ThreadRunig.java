import java.util.*;
class Calc1 implements Runnable{
    public void run(){
        System.out.println("Calculation Task Started");

        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=sc.nextInt();

        System.out.println("Please enter 2nd number");
        int num2=sc.nextInt();

        int res=num1+num2;

        System.out.println(res);
        System.out.println("Calculation Task Ended");

        System.out.println("****************************************************");
    }
}
class message implements Runnable{
    public void run(){
        System.out.println("Displaying important message task");
        try{
            for(int i=0;i<3;i++)
            {
                System.out.println("Focus is important to master skills");
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Some problem");
        }
        System.out.println("Displaying import message task ended");
    }
}

public class ThreadRunig {
    public void main(String[] args){
        Calc1 ca = new Calc1();
        message me = new message();

        Thread t1 = new Thread(ca);
        Thread t2 = new Thread(me);

        t1.start();
        t2.start();
    }
}
