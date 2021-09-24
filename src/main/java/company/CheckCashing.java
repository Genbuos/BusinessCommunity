package company;

public class CheckCashing {
    public static void main(String[] args) {
        //Create an array to hold 4 emplyees
       Employee theEmps[] = new Employee[4];


        //Create a Hiredate

        Hiredate hiredate = new Hiredate("August", "18","2021");

        //Create 4 employee objects

        HourlyEmployee jor = new HourlyEmployee("Jordan", hiredate, 50.0, 40);

        //add the new objects to your array
        theEmps[0] = jor;

        SalariedEmployee princeZumunda = new SalariedEmployee("Mikaila A.", hiredate );
        theEmps[1] = princeZumunda;

        SalariedEmployee mom = new SalariedEmployee("Sonja Henderson", hiredate);
        theEmps[2] = mom;

        HourlyEmployee jai = new HourlyEmployee("Jaida Mitchell", hiredate, 13.0, 20);
        theEmps[3] = jai;


        Hr.issueBadge(theEmps);

        jor.pay();
        princeZumunda.pay();
        mom.pay();




        IPay[] breadWinners = {jor,princeZumunda,mom,jai};
        Hr.payPerson(breadWinners);




    }
}
