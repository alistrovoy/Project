package Homework.lesson9;

public class Circle {
    private final double Pi = 3.14; //
    private double radius;

    public Circle() {

    }

    public Circle(double newRadius) {
        radius = newRadius;
    }


    public double getPi() {
        return Pi;
    }

    public void setRadius(double newRadius) {
        radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

}
