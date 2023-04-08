import java.util.Scanner;

class Patient{
    String name ,sex;
    int age;
     void apPatient(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:-");
        name = sc.nextLine();
        System.out.println("sex:-");
        sex = sc.nextLine();
        System.out.println("age:-");
        age = sc.nextInt();
     }
     void patient_info(){
        System.out.println(name+" "+age+" "+sex);
     }
}
public class Project1 {
    public static void main(String[] args) {
       Patient p1 = new Patient();
       p1.apPatient();
       p1.patient_info();

    }
}
