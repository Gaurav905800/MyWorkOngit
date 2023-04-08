import java.util.Scanner;
public class loop2 {
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int number = sc.nextInt();
     int sumOfNumber = 0;
     int orignalNumber = number ;
     while(number>0){
        sumOfNumber += number%10;
        number = number/ 10;
     }
     System.out.println("sum of digit is "+orignalNumber+"="+sumOfNumber);
     }
    
}
