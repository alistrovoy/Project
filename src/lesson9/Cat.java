package lesson9;

public class Cat {
    private String poroda;
    private int age;
    private double dlinnaHvosta;

    public Cat(){

    }
    public Cat(int newAge, String por, double dh){
        age = newAge;
        poroda = por;
        dlinnaHvosta =dh;
    }


    public void setPoroda (String newPoroda){
        poroda = newPoroda;
    }
    public String getPoroda(){
        return poroda;
    }
    public void setAge (int newAge){
        age = newAge;
    }
    public int getAge(){
        return age;
    }
    public void setDlinnaHvosta(double newDlinnaHvosta){
        dlinnaHvosta = newDlinnaHvosta;
    }
    public double getDlinnaHvosta(){
        return dlinnaHvosta;
    }
}
