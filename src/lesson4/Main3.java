package lesson4;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String login = "qwerty";
        String password = "12345";

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите логин: ");
        String inputLogin = scan.nextLine();

        System.out.println("Введите пароль: ");
        String inputPass = scan.nextLine();


        if(login.equalsIgnoreCase(inputLogin) && password.equalsIgnoreCase(inputPass)){

            System.out.println("Вход выполнен: ");

        }
        else{
            System.out.println("Неверно. ");
        }

    }
}
