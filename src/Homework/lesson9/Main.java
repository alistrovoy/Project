package Homework.lesson9;

public class Main {
    public static void main(String[] args) {

        Human Vasya = new Human();
        Human Pasha = new Human();
        Car pickup = new Car();
        Car hacheback = new Car();



        Vasya.setAge(31);
        Pasha.setAge(32);
        Pasha.setSername("Makarov");
        Vasya.setSername("Ivanov");
        pickup.setFuelConsumptionOn100Km(30.12);
        hacheback.setFuelConsumptionOn100Km(40.23);

        System.out.println("Возраст Васи: " + Vasya.getAge());
        System.out.println("Возраст Паши: " + Pasha.getAge());
        System.out.println(Vasya.getSernameame());
        System.out.println(pickup.getFuelConsumptionOn100Km());
        System.out.println(hacheback.getFuelConsumptionOn100Km());
    }
}
