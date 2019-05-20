package lesson2_If_For;

public class Main1 {

    public static void main(String[] args) {

        int money = 2003;
        int pizzaCost = 230;
        int gumCost = 26;
        double candyCost =2.5;

        int restAfterByPizza = money  % pizzaCost;
        System.out.println(restAfterByPizza);

        pizzaCost++;
        ++pizzaCost;
        System.out.println(pizzaCost);
        System.out.println(pizzaCost++);
        System.out.println(pizzaCost);

        pizzaCost += 5;
        System.out.println(pizzaCost);
    }
}
