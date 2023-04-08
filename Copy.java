    
import java.util.Scanner;


class doctor

{
    String did, dname, appoint;
    
    void new_doctor()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        did = input.nextLine();

        System.out.print("name:-");
        dname = input.nextLine();

        System.out.print("work time:-");
        appoint = input.nextLine();

     
    }

    void doctor_info()

    {
        System.out.println(did + "\t" + dname );

    }
}

class patient

{
    String pid, pname, sex;
    int age;
    void newpatient()

    {
        Scanner input = new Scanner(System.in);

        System.out.print("id:-");
        pid = input.nextLine();

        System.out.print("name:-");
        pname = input.nextLine();

        System.out.print("sex:-");
        sex = input.nextLine();

   
        System.out.print("age:-");
        age = input.nextInt();

    }

    void patient_info()
    {
        System.out.println(pid + "\t" + pname + " \t" + sex +"\t" + age);
    }
}



public class Copy

{
    
    public static void main(String args[])
    {
       
        //System.out.println("--------------------------------------------------------------------------------");
        int count1 = 4, count2 = 4;

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Welcome to Hospital Management System Project in Java ***");
        System.out.println("--------------------------------------------------------------------------------");

        doctor[] d = new doctor[25];

        patient[] p = new patient[100];
 
        int i;

        for (i = 0; i < 25; i++)

            d[i] = new doctor();

        for (i = 0; i < 100; i++)

            p[i] = new patient();    


        d[0].did = "21";
        d[0].dname = "Dr.Ghanendra";
        d[0].appoint = "5-11AM";
       
        d[1].did = "32";
        d[1].dname = "Dr.Vikram";
        d[1].appoint = "10-3AM";
      
        d[2].did = "17";
        d[2].dname = "Dr.Rekha";
        d[2].appoint = "8-2AM";
       
        d[3].did = "33";
        d[3].dname = "Dr.Pramod";
        d[3].appoint = "10-4PM";
       

        p[0].pid = "12";
        p[0].pname = "Pankaj";
        p[0].sex = "Male";
        p[0].age = 30;

        p[1].pid = "13";
        p[1].pname = "Sumit";
        p[1].sex = "Male";
        p[1].age = 23;

        p[2].pid = "14";
        p[2].pname = "Alok";
        p[2].sex = "Male";
        p[2].age = 45;

        p[3].pid = "15";
        p[3].pname = "Ravi";
        p[3].sex = "Male";
        p[3].age = 25;



        Scanner input = new Scanner(System.in);

        int choice, j, c1, status, s1 = 0,s2 = 0;
        status = input.nextInt();

        while (status == 1);

        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("1.Doctos  2. Patients ");
            System.out.println("-----------------------------------------------------------------------------------");

            choice = input.nextInt();
            switch (choice)

            {

                case 1 -> {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");


                        while (s1 == 1)
                        {
                            System.out.println("1.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)

                            {
                                case 1 ->                                     {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name\t Timing.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].doctor_info();
                                        }
                                    }
                            }
                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s1 = input.nextInt();
                        }
                    }

                case 2 ->                     {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");


                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1 ->                                     {
                                        p[count2].newpatient();count2++;
                                    }

                                case 2 ->                                     {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("id \t Name \t Disease \t Gender \t Admit Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].patient_info();
                                        }
                                    }
                            }

                            System.out.println("\nReturn to Back Press 1 and for Main Menu Press 0");
                            s2 = input.nextInt();
                        }
                    }

                
                        }
                    }
            System.out.println("\nReturn to MAIN MENU Press 1");

            doctor d1 = new doctor();
            d1.new_doctor();
            d1.doctor_info();
            patient p1 = new patient();
            p1.newpatient();
            p1.patient_info();
            }
}

