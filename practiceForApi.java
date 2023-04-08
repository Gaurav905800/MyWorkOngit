import java.util.Scanner;
public class practiceForApi {
      
    public static void main (String[] args){

       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number you will Store");
       int n = sc.nextInt();

       int array[] = new int[10];
       System.out.println("Enter the element");
       for(int i = 0;i<n;i++){
        array[i] = sc.nextInt();
       }
       System.out.println("array eleme");

       for(int i = 0;i<n;i++){
        System.out.println(array[i]);
       }
    }
}
