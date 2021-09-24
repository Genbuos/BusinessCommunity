package company;

public class Entreprenuer extends Person implements IPay {

    public Double rate;

    public Entreprenuer(String name){
        super(name);
    }

    @Override
    public double calcPay() {
        return rate;
    }


    @Override
    public void pay(){
        System.out.println(rate);
    }


}
