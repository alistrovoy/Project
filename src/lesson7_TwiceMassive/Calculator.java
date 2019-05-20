package lesson7_TwiceMassive;

import Homework.lesson6.CalculatedData;

import java.util.Scanner;

public class Calculator {
    public static String getOperation() {
        Scanner scanner = new Scanner(System.in);
        String inputAction = scanner.nextLine();
        if (inputAction.equals("-") || inputAction.equals("+") || inputAction.equals("*") || inputAction.equals("/")) {
            return inputAction;
        } else {
            System.out.println("Неверное действие, повторите ввод!");
            return Calculator.getOperation();

        }
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = scanner.nextLine();
        char[] FromInputNumber = inputNumber.toCharArray();
        for (int i = 0; i < FromInputNumber.length; i++) {
            if (FromInputNumber[i] != '0' && FromInputNumber[i] != '1'
                    && FromInputNumber[i] != '2' && FromInputNumber[i] != '3'
                    && FromInputNumber[i] != '4' && FromInputNumber[i] != '5'
                    && FromInputNumber[i] != '6' && FromInputNumber[i] != '7'
                    && FromInputNumber[i] != '8' && FromInputNumber[i] != '9') {

                System.out.println("Неверное число, повторите ввод");
                return Calculator.getNumber();
            }
        }
        int num = Integer.parseInt(inputNumber);
        return num;
    }

    public static void printresul(String operation, int num1, int num2) {
        if (operation.equals(("+"))) {
            System.out.println("Результат сложения " + (num1+num2));
        }
        if (operation.equals(("-"))) {
            System.out.println("Результат  вычитания "+ (num1-num2));

        }
        if (operation.equals(("*"))) {
            System.out.println("Результат умножения "+ (num1*num2));
        }
        if (operation.equals(("/"))) {
            System.out.println("Результат деления "+ (num1/num2));
        }
    }
}


