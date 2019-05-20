package Homework.lesson9;

public class Figures {
    public static void main(String[] args) {


        Triangle Triangular1 = new Triangle(12.5, 23.5, 32.1, 23.5);
        Rectangle Rectangle1 = new Rectangle(23.4, 34.5);
        Square Square1 = new Square(12.4);
        Circle Circle1 = new Circle(13.5);

        System.out.println("полупериметр треугольника " + Triangular1.getPoluperimetr());
        System.out.println("первая сторона треугольника " + Triangular1.getStoronaA());
        System.out.println("вторая сторона треугольника " + Triangular1.getStoronaB());
        System.out.println("третья сторона треугольника " + Triangular1.getStoronaC());
        System.out.println();
        System.out.println("первая сторона квадрата " + Rectangle1.getStoronaA());
        System.out.println("вторая сторона квадрата " + Rectangle1.getStoronaB());
        System.out.println();
        System.out.println("сторона квадрата " + Square1.getStorona());
        System.out.println();
        System.out.println("радиус крута " + Circle1.getRadius());
        System.out.println("постоянное число Пи " + Circle1.getPi());


    }


}
