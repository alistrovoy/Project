package lesson11;

public class Tiger  extends ZooAnimal{

    public Tiger(){
        super();
    }

    public Tiger(int cost){
        super(cost);
    }

    public Tiger (int cost, int weight) {
        super(cost, weight);

    }
    @Override
    public void voice() {
        System.out.println("RRRRRRRRRRRrrrr");
    }

    @Override
    public void jump() {
        System.out.println("Тигр прыгает");
    }

    @Override
    public void printInfo() {
        System.out.println("Тигр со стоимостью  = " + this.getCost() +"вес = " + this.getWeight());
    }

}
