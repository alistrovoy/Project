package lesson9;

public class Main {
    public static void main(String[] args) {
        Phone meizu = new Phone();  //основная формула типа данных
        Phone saomi = new Phone();

        meizu.setPrice(10000);
        saomi.setPrice(8000);

        meizu.setDiagonal(2.5);
        saomi.setDiagonal(5.6);

        System.out.println(meizu.getPrice());
        System.out.println(meizu.getDiagonal());

    }

}
