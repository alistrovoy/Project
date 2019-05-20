package Homework.lesson2;

public class MyHomework11042019_c {
    public static void main(String[] args) {

                                                    // в) вывести на консоль сумму чисел в диапазоне от 50 до 1000,
        int a = 7;
        int b = 19;                                 // которые делятся без остатка на 7 и на 19
        int sum = 0;



        for (int i = 50; i < 1000; i++) {


            if (i % a == 0 && i % b == 0) {
                sum=sum+i;

                }
            }
        System.out.println(sum);

        }

    }

