package lesson3_For_Massive_Scanner;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("В этой программе Вы можете вычислить периметр или площадь треугольника.\n Нажмите 'Enter', чтобы продолжить ");
        String x = scanner.next();

        System.out.println("    Введите 'P',если необходимо вычислить периметр.\n    Введите 'S', чтобы вычислить площадь.");

        String action = scanner.next();


        if (action.equals("P")) {


            System.out.println("Введите значение стороны A: ");
            int storonaA = scanner.nextInt();


            System.out.println("Введите значение стороны B: ");
            int storonaB = scanner.nextInt();

            System.out.println("Введите значение стороны C: ");
            int storonaC = scanner.nextInt();

            System.out.println("Perimetr treugolnika = " + (storonaA + storonaB + storonaC));


        } else if (action.equals("S")) {

            System.out.println(" Введите значение основания треугольника ");
            int storonaA = scanner.nextInt();

            System.out.println(" Введите значение высоты треугольника ");
            int height = scanner.nextInt();

            System.out.println("Ploschad' treugolnika = " + ((storonaA * 0.5) * height));

        }
    }


}

