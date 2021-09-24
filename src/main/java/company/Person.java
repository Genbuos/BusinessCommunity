package company;

public abstract class Person implements IPay {
private String name;

public Person(String name){
    this.name = name;
}
//Declared that this MUST be implemented


public String getName(){

return name;
}

public void setName(String name){
    this.name = name;


}
public abstract double calcPay();




}
