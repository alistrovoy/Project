package Homework.lesson2;

public class MyHomework11042019_b {
    public static void main(String[] args) {        //б) вывести на числа в диапазоне от 500 до 1000,
                                                    // которые делятся без остатка на 7 и на 19.
        int a = 7;
        int b = 19;


        for (int i = 500; i < 1000; i++) {


            if (i % a == 0 && i % b == 0) {

                System.out.println(i);

            }
        }
    }
}





