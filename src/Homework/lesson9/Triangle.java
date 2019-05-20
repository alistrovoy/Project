package Homework.lesson9;

public class Triangle {
    private double storonaA;
    private double storonaB;
    private double storonaC;
    private double poluperimetr; // полупериметр не нужен, т.к. является продуктом вычисления.


    public Triangle() {

    }

    public Triangle(double newStoronaA, double newStoronaB, double newStoronaC, double newPoluperimetr) {
        storonaA = newStoronaA;
        storonaB = newStoronaB;
        storonaC = newStoronaC;
        poluperimetr = newPoluperimetr;
    }


    public void setStoronaA(double newStroronaA) {
        storonaA = newStroronaA;
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

    public void setStoronaC(double newStoronaC) {
        storonaC = newStoronaC;
    }

    public double getStoronaC() {
        return storonaC;
    }

    public void setPoluperimetr(double newPoluperimetr) {
        poluperimetr = newPoluperimetr;
    }

    public double getPoluperimetr() {
        return poluperimetr;
    }

}
