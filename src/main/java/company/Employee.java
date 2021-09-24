package company;

public abstract class Employee extends Person{
    public Hiredate hiredate;

    public Employee(String name, Hiredate hiredate ){
        super(name);
        this.hiredate = hiredate;
    }


}
