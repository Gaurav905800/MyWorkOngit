 class helloWorld{
 private String name = "gaurav";
 private int age  = 20;
 private String password = "pavms22";
 
 public String getName(){
    return name;
 }
 public int getAge(){
    return age;
 }
 public String getPassword(){
    return password;
 }
 public void setAge(int a){
 age = a;
 }

}
public class student{
    public static void main(String[] args) {
        helloWorld send = new helloWorld();
        send.setAge(32);
      System.out.println(send.getAge());
      System.out.println(send.getName());
      System.out.println(send.getPassword());

     
    }  
    
}