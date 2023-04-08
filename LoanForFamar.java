import java.util.Scanner;

class Farmar{
    int loanPrincipal ;
    float timeDuration ;
    static float rateOfIntrest ;
    float simpleIntrest ;
    static{
        rateOfIntrest = 8.5f;
    } 
   
    void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the loan ");
        loanPrincipal = sc.nextInt();
        System.out.println("Enter the time duration");
        timeDuration = sc.nextFloat();
       
    }
    void compute(){
         simpleIntrest = (loanPrincipal*rateOfIntrest*timeDuration)/100f;
    }
    void display(){
        System.out.println("The simpleIntrest is : "+simpleIntrest);
    }
}
public class LoanForFamar{
    public static void main(String[] args) {
 
    Farmar loan = new Farmar();
    loan.Input();
    loan.compute();
    loan.display();
    }
}