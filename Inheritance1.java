class Demo{
    int a,b;
    public Demo(){
        System.out.println("parent class constructor ");
    }
    public Demo(int x,int y){
System.out.println("parameter parent valla constructor");
   a=x;
   b=y;
    }}
    class Demo2 extends Demo{
        int m,n;
        public Demo2(){
            super();
            System.out.println("class child constructor ");
        }
        public Demo2(int x ,int y){
        System.out.println("parameter valla child constructor");
        m=x;
        n=y;
        }
    }


public class Inheritance1 {
    public static void main(String[] args) {
       Demo2 d = new Demo2();
        
    }
}
