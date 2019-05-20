package lesson11;

public class Parrot extends ZooAnimal {

    public Parrot(){

    }

    public Parrot(int cost){
        super(cost);

    }


    public Parrot(int cost, int weight) {
        super(cost, weight);

    }
    @Override
    public void voice() {
        System.out.println("IIIIIIiiiaaa");
    }

    @Override
    public void jump() {
        System.out.println("Попугай прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Попугай со стоимостью = " + this.getCost());
    }
}
