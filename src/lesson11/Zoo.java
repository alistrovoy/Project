package lesson11;

public class Zoo {
    private int money;
    private ZooAnimal[] animals = new ZooAnimal[10];

    public Zoo() {

    }

    public Zoo(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void buyAnimal(ZooAnimal payanimal) {
        if (money < payanimal.getCost()) {
            System.out.println("Недостаточно денег для покупки");

            return;

        }

        money = money - payanimal.getCost();
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] == null) {
                money = money - payanimal.getCost();
                animals[i] = payanimal;
                return;

            }
        }
        System.out.println("нет свободных клеток");
        money = money + payanimal.getCost();
    }

    public void printAnimal() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].printInfo();
            }
        }
    }

    public void voice() {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                animals[i].voice();
            }
        }
    }

    public void mostExpensiveAnimal() {
        ZooAnimal maxCostAnimal = animals[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) {
                if (maxCostAnimal.getCost() < animals[i].getCost()) {
                    maxCostAnimal = animals[i];
                }

            }
        }
        System.out.println("Самое дорогое животное ");
        maxCostAnimal.printInfo();
    }

    public void summaStoimostiAll(){
        int summa =0;
        for(int i = 0; i<animals.length; i++){
            if(animals[i] != null){
                summa = summa + animals[i].getCost();
            }
        }
        System.out.println("сумма стоимости всех животных =  "+ summa);
    }

    public void mostCheapestAnimal(){
        ZooAnimal minCostAnimal = animals[0];
        for(int i = 0; i<animals.length; i++){
            if(animals[i] != null){
                if(minCostAnimal.getCost() > animals[i].getCost()){
                    minCostAnimal = animals[i];
                }
            }
        }
        System.out.println("Самое дешевое животное ");
        minCostAnimal.printInfo();

    }
    public void financeZoo(){
        int summa = 0;
        for(int i =0; i<animals.length; i++){
            if(animals[i] != null) {
                summa = summa + animals[i].getCost();

            }
        }
        money= money -summa;
        System.out.println(money);
    }

}

