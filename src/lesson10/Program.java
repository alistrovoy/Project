package lesson10;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("выберите фигуру");
        System.out.println("1 - Треугольник");
        System.out.println("2 - Прямоугольник");
        System.out.println("3 - Квадрат");
        System.out.println("4 - Круг");

        Scanner scanner = new Scanner(System.in);
        String inputFigure = scanner.nextLine();
        Figure figure = null;

        if(inputFigure.equals("1")){

            System.out.println("введите сторону A");
            String storonaA = scanner.nextLine();

            System.out.println("введите сторону B");
            String storonaB = scanner.nextLine();

            System.out.println("введите сторону C");
            String storonaC = scanner.nextLine();

            int fromStringA = Integer.parseInt(storonaA);
            int fromStringB = Integer.parseInt(storonaB);
            int fromStringC = Integer.parseInt(storonaC);
            figure = new Treugolnik(fromStringA, fromStringB, fromStringC);


        }

        if(inputFigure.equals("2")){


            System.out.println("введите сторону A");
            String storonaA = scanner.nextLine();

            System.out.println("введите сторону B");
            String storonaB = scanner.nextLine();

            int fromStringA = Integer.parseInt(storonaA);
            int fromStringB = Integer.parseInt(storonaB);

            figure = new Pramougolnik(fromStringA, fromStringB);


        }
        if(inputFigure.equals(("3"))){
            System.out.println("введите значение стороны ");
            String storonaA = scanner.nextLine();
            int fromString = Integer.parseInt(storonaA);
            figure = new Square(fromString);
        }
        if(inputFigure.equals("4")){
            System.out.println("Введите значение радиуса");
            String radius = scanner.nextLine();
            int fromString = Integer.parseInt(radius);
            figure = new Circle(fromString);
        }
        System.out.println("периметр или площадь?");

          String inputAction = scanner.nextLine();
          if  (inputAction.equals("периметр")){
              figure.printPerimetr();
          }else{
              figure.printPloschad();

          }




    }
}
