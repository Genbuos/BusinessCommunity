package company;

public class SalariedEmployee extends Employee implements IPay {

    private Double salary;


    public SalariedEmployee(String name, Hiredate hireDate){
        super(name, hireDate);

    }



    public  Double getSalary(Double salary){
        return salary;
    }

    public void setSalary(Double salary){
        this.salary = salary;


    }



    @Override
    public void pay() {
        System.out.println(salary);

    }

    @Override
    public double calcPay() {
        return salary;
    }
}
