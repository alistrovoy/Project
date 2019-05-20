package Homework.lesson3;

import java.util.Scanner;


public class circle {
    public static void main(String[] args) {

        double Pi =3.1415;

        Scanner str = new Scanner(System.in);
        System.out.println("Здесь Вы сможете вычислить площадь и периметр окружности. \n Нажмите 'Enter', чтобы продолжить.");
        String x = str.nextLine();
        System.out.println("    Введите 'P',если необходимо вычислить периметр.\n    Введите 'S', чтобы вычислить площадь.");

        String move = str.next();

        if (move.equals("P")){

            System.out.println("Введите значение радиуса: ");
            int radius = str.nextInt();


            System.out.println("Периметр окружности =  " + (radius * Pi)*2);
        }

        else
        if(move.equals("S")){

            System.out.println("Введите значение радиуса: ");
            int radius = str.nextInt();

            System.out.println("Площадь окружности =  " + (radius * radius)*Pi);


        }

    }




}

