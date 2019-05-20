package Homework.lesson3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {


        Scanner str = new Scanner(System.in);
        System.out.println("Здесь Вы сможете вычислить площадь и периметр прямоугольника. \n Нажмите 'Enter', чтобы продолжить.");
        String x = str.nextLine();
        System.out.println("    Введите 'P',если необходимо вычислить периметр.\n    Введите 'S', чтобы вычислить площадь.");

            String move = str.next();

            if (move.equals("P")){

            System.out.println("Введите значение стороны А: ");
            int storonaA = str.nextInt();

            System.out.println("Введите значение стороны B: ");
            int storonaB = str.nextInt();

            System.out.println("Периметр прямоугольника =  " + 2 *(storonaA + storonaB));
        }

        else
             if(move.equals("S")){

                System.out.println("Введите значенеи стороны A: ");
                int storonaA = str.nextInt();

                System.out.println("Введите значение стороны B: ");
                int storonaB = str.nextInt();

                System.out.println("Площадь прямоугольника = " + (storonaA * storonaB)) ;
            }

        }




    }
