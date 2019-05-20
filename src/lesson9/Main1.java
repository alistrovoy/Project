package lesson9;

public class Main1 {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setAge(12);
        cat.setDlinnaHvosta(13);
        cat.setPoroda("Siam");

        Cat cat1 = new Cat(12,"qwerty", 15);
        Cat cat2 = new Cat(15,"asdfgh", 20);
        cat2.setDlinnaHvosta(157);

        System.out.println(cat2.getDlinnaHvosta());
    }
}
