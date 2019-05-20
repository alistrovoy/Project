package Homework.lesson9;

public class Rectangle {
    private double storonaA;
    private double storonaB;

    public Rectangle() {

    }

    public Rectangle(double newStoronaA, double newStoronaB) {
        storonaA = newStoronaA;
        storonaB = newStoronaB;
    }


    public void setStoronaA(double newStoronaA) {
        storonaA = newStoronaA;
    }

    public double getStoronaA() {
        return storonaA;
    }

    public void setStoronaB(double newStoronaB) {
        storonaB = newStoronaB;
    }

    public double getStoronaB() {
        return storonaB;
    }
}
