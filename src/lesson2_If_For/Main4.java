package lesson2_If_For;

public class Main4 {

    public static void main(String[] args) {
        int a = 4;
        int b = 8;
        int c = 4;

        if ((a == b) && (b == c) && (c == a) ){
            System.out.println("это равносторонний треугольник");
        } else{
            System.out.println("это НЕ равносторонний треугольник");
        }

        if((a != b) && (b != c) && (c != a)  ){

            System.out.println("это разносторонний треугольник");

        }

        if (((a == b) && (b != c)) || (b==c && c!= a) || (a == c && c!=b) );
        System.out.println("Это равнобедренный треугольник");
    }
}
