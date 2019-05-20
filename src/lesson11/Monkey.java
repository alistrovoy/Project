package lesson11;

public class Monkey extends  ZooAnimal {

    public Monkey() {
    }

    public Monkey(int cost) {
        super(cost);
    }

    public Monkey (int cost, int weight) {
        super(cost, weight);

    }

    @Override
    public void voice() {
        System.out.println("Yyyyyyyyaaaaa");
    }

    @Override
    public void jump() {
        System.out.println("Обезьяна прыгает");

    }

    @Override
    public void printInfo() {
        System.out.println("Обезьяна со стоимостью = " + this.getCost());
    }
}
