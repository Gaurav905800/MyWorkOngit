import java.util.*;
// class Call<T>{
//     public T Call(Object n){
//         return ;
//     }
// }

public class Generics1 {
    public static void main(String[] args) {
    
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(30);
        al.add(15);
        al.add(20);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        List<String> al1 = new ArrayList<String>();
        al1.add("ankit");
        al1.add("hello");
        al1.add("all of you");
        al1.add("my name is gaurav");
        System.out.println(al1);

        Collection<String> al2 = new ArrayList<String>();
        
    }
}
