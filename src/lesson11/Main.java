package lesson11;

public class Main {
    public static void main(String[] args) {
        Zoo  zoo = new Zoo(1000000);

        Tiger tiger  = new Tiger(20000);

        Parrot Ara = new Parrot(50000);
        Parrot Cacadu = new Parrot(60000);

        Monkey gorila = new Monkey(30000);




        zoo.buyAnimal((tiger));
        zoo.buyAnimal(Ara);
        zoo.buyAnimal((Cacadu));
        zoo.buyAnimal(gorila);

        zoo.printAnimal();
        zoo.voice();
        zoo.mostExpensiveAnimal();
        zoo.summaStoimostiAll();
        zoo.mostCheapestAnimal();
        zoo.financeZoo();





    }
}
