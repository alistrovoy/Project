package Homework.lesson3;
import java.util.Scanner;
public class square {
    public static void main(String[] args) {

        Scanner str = new Scanner(System.in);
        System.out.println("Здесь Вы сможете вычислить площадь и периметр квадрата. \n Нажмите 'Enter', чтобы продолжить.");
        String x = str.nextLine();
        System.out.println("    Введите 'P',если необходимо вычислить периметр.\n    Введите 'S', чтобы вычислить площадь.");

        String move = str.next();

        if (move.equals("P")){

            System.out.println("Введите значение стороны А: ");
            int storonaA = str.nextInt();


            System.out.println("Периметр квадрата =  " + (storonaA) * 4);
        }

        else
        if(move.equals("S")){

            System.out.println("Введите значение стороны А: ");
            int storonaA = str.nextInt();

            System.out.println("Площадь квадрата =  " + (storonaA)*(storonaA));


        }

    }


}

