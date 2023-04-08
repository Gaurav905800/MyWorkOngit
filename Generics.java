import java.util.*;

public class Generics {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();

        arr.add("gaurav");
        arr.add("ankit");
        arr.add("beta");

        System.out.println(arr);

        Iterator its = arr.iterator();
        while(its.hasNext()){
            Object value = its.next();
            System.out.println(value);
        }
System.out.println("*******************************************");
        LinkedList<Integer> ll = new LinkedList<Integer>();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);
        System.out.println(ll);
        Iterator its1 = ll.iterator();
        while(its1.hasNext()){
            Object value1 = its1.next();
            System.out.println(value1);
        }

    }
}
