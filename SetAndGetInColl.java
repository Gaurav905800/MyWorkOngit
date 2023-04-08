import java.util.*;
// import java.util.Map.*;
 class power{
    private String name;
    private int age;
    private String city;

    public power(String name,int age,String city){
        this.name= name;
        this.age = age;
        this.city = city;
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }
    public String toString(){
        return name+" "+age+" "+city;
    }
}

public class SetAndGetInColl {
   public static void main(String[] args) {
    
   power st1 = new  power("gaurav",21,"modinagar");
   power st2 = new  power("Saurabh",25,"delhi");
   power st3 = new  power("harsh",18,"garh");

    Map ankit = new HashMap();
    ankit.put(1, st1);
    ankit.put(2, st2);
    ankit.put(3, st3);

    System.out.println(ankit);
    // Set set = map.entrySet();
    // Iterator its = set.iterator();
    // while(its.hasNext()){
    //    Object name = (Object)its.next();
    //    System.out.println(name);
    // }
   }
}
