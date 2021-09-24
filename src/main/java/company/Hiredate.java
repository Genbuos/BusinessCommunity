package company;

public class Hiredate {
    public String month, day, year;


    public Hiredate(String month, String day, String year){
        this.month = month;
        this.day = day;
        this.year = year;

    }

    @Override
    public String toString() {
        return "Hire Date:" +
                "" + month + '\'' +
                "/" + day + '\'' +
                "/" + year + '\'' +
                '.';
    }
}
