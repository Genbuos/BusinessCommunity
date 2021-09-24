package company;

public class HourlyEmployee  extends  Employee implements IPay{

    private double hourlyWage, hoursWorked;

    public HourlyEmployee(String name, Hiredate hiredate, double hourlyWage, double hoursWorked){
        super(name, hiredate);
    }


    @Override
    public double calcPay(){


        return hourlyWage * hoursWorked;
    }


    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void pay() {
        System.out.println(calcPay());


    }
}
