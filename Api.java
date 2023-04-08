// import java.time.*;
import java.util.*;
import java.util.Arrays;
import java.util.stream.*;
class Api{
    public static void main(String[] args){
    
        // LocalDate date = LocalDate.now();
        // System.out.println( date);
        // int a = date.getDayOfMonth();
        // int b = date.getMonthValue();
        // int c = date.getYear();
        // System.out.println(a+":"+b+":"+c);

        // LocalTime time = LocalTime.now();
       
        // int hour = time.getHour();
        // int min = time.getMinute();
        // int sec = time.getSecond();
        // int nano =time.getNano();
        //  System.out.println(hour+" "+min+" "+sec+" "+nano);
    
        List<Integer> l1 = Arrays.asList(5,4,8,1,3,10);

        Stream<Integer> stream =  l1.stream();
        
        // long l = stream.count();
        // System.out.println(l);
       Stream<Integer>finalStream = stream.filter(a->a%2==0)
       .sorted()
       .map(n->n*2);

    //    Stream<Integer> newStream = filterStream.sorted();
    //    Stream<Integer> mapStream =  newStream.map(n-> n*2);


        finalStream.forEach(n-> System.out.println(n));

        
    }
}