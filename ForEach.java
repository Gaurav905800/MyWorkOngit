import java.util.*;
import java.util.function.Consumer;
public class ForEach {
    public static void main(String[] args){
       
        List<Integer> al = new ArrayList<Integer>();

        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);
        al.add(10);
        System.out.println(al);

        List<Integer> l2 = Arrays.asList(2,4,6,8,10);
       System.out.println(l2);

    //    for(Integer i : l2){
    //     System.out.println(i);
    //    }

        // Consumer<Integer> con = i-> System.out.println(i);
        l2.forEach(i-> System.out.println(i));

    }
}
