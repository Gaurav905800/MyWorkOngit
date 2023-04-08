import java.util.Scanner;
public class loops{
    public static void main(String[] ags){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int numberOfDigit = 0;
        int orignal_number = number ;
        while(number > 0){        
        number = number/10;
        }
        System.out.println("number of digit"+orignal_number +" = "+numberOfDigit);
    }
}