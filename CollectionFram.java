import java.util.*;
import java.util.Map.Entry;
public class CollectionFram{
    public static void main(String[] args){
        Map hm = new HashMap();
        hm.put(1, 10);
        hm.put(2, 20);
        hm.put(3, 30);
        hm.put(4, 40);

       System.out.println(hm);

       Set keySet = hm.keySet();

       Iterator itr = keySet.iterator();
       while(itr.hasNext()){
        System.out.println(itr.next());
       }
       System.out.println("-----------------------------------------------");
       Collection values = hm.values();
       Iterator itr1 = values.iterator();
       while(itr1.hasNext()){
        System.out.println(itr1.next());
       }
       System.out.println("---------------------------------------------------");
       int key1 = (int) hm.get(1);
       int key2 = (int) hm.get(2);
       int key3 = (int) hm.get(3);
       int key4 = (int) hm.get(4);

       System.out.println(key1+" "+key2+" "+key3+" "+key4+" ");
       
       System.out.println("----------------------------------------------------");
       Set entrySet = hm.entrySet();
       Iterator itr2 = entrySet.iterator();

       while(itr2.hasNext()){
        // System.out.println(itr2.next());
        Map.Entry data = (Entry) itr2.next();
        System.out.println(data.getKey()+":"+data.getValue());
       }
    }
}
