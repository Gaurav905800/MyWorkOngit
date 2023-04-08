public class number {
    public static void main (String[] args){

    int first = 0,second = 1,i,third,last =10;

   System.out.println(first+" "+second);

   for(i=2;i<last;i++){
    third = first+second;
    System.out.println(" " + third);
    first = second;
    second = third;
   }         
    }
}
