package lesson10;

public class Circle extends Figure{
    private int r;

    public Circle(){

    }
    public Circle(int r) {
        this.r = r;
    }

    public void setR(int r){
        this.r = r;
    }
    public int getR(){
        return r;
    }

    @Override
    public void printPloschad() {
        System.out.println("значение площади = " + (P*r)*(P*r));
    }

    @Override
    public void printPerimetr() {
        System.out.println("значение периметра = " + (2*P*r));
    }
}
