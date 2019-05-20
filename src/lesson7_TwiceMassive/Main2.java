package lesson7_TwiceMassive;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(" Какую операцию необходимо сделать?");
        String operation = Calculator.getOperation();


        System.out.println("Введите первое число");
        int num1 = Calculator.getNumber();

        System.out.println("Введите первое число");
        int num2 = Calculator.getNumber();

        Calculator.printresul(operation, num1, num2);

    }
}
