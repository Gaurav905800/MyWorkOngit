import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        int num = 0;
        
        try(Scanner sc = new Scanner(System.in)){
            num = sc.nextInt();
        }
        //  try{
        //     Scanner sc = new Scanner(System.in)
        //  }
         catch(Exception e){
            System.out.println("please type a integer value");
         }
        //  finally{
        //     sc.close();
        //  }

         System.out.println(num);
    }
}
