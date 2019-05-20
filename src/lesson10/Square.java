package lesson10;

public class Square  extends  Figure{
    private int a;

    public Square() {

    }

    public Square(int a) {
        this.a = a;
    }

    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }

    @Override
    public void printPloschad() {
        System.out.println("Площадь квадрата = " + (a * a));
    }

    @Override
    public void printPerimetr() {
        System.out.println("периметр квадрата = " + (4*a));
    }
}

