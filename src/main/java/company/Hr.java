package company;

public class Hr {

    public static void payPerson(IPay[] breadWinners){
        for (IPay x: breadWinners) {
            x.pay();
             }

        }

        //issueBadge
    public static void issueBadge(Employee[] employees){
        for (Employee e : employees){
            System.out.println(e.getName());
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.hiredate);
        }
    }

public static void printPaymentInfo(IPay[] paidPeople){
        for (IPay p: paidPeople ){
            System.out.println();


        }

}



    }



