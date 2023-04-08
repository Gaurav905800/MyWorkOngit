class Demo{
   private int age ;
   private String name; 
public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public void show(){
//    System.out.println(name+" "+" "+ age);
}
}
public class encapsulation1 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        Demo obj2 = new Demo();
        obj.setAge(18);
        obj2.setAge(25);
        obj.setName("gaurav");
        obj2.setName("ankit");
      int stud1Age = obj.getAge();
      String stud1name = obj.getName();
      int stud2Age = obj2.getAge();
      String stud2name = obj2.getName();
     
      System.out.println(stud1Age+" "+stud1name);
      System.out.println(stud2Age+" "+stud2name);

   
    }
}
