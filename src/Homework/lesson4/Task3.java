package Homework.lesson4;

public class Task3 {
    public static void main(String[] args) {

        String[] massive = {"a", "b", "c", "d"};               // объявляем массив

        String [] massiveReverse = new String[massive.length]; // объявляем новый массив ссылаясь на длину старого
//
//        massiveReverse[0] = massive[3];      //это код,
//        massiveReverse[1] = massive[2];      //если бы мы делали без цикла for
//        massiveReverse[2] = massive[1];
//        massiveReverse[3] = massive[0];

        int j=massiveReverse.length - 1;       // создание новой переменной, которая ссылается на длину нового массива минус единица.

        for(int i =0; i<massive.length; i++){   // цикл for необходим для проверки индексов от 0 до 3
            massiveReverse[i] = massive[j];     // тут происходит замена значений с массива massive на значения массива massiveReverse
            j--;                                // эта операция означает, что будет браться следующая переменная с маименьшим по модулю
        }                                       // значением

        for (int i =0; i<massiveReverse.length;i++){  // затем необходим новый цикл с выводом новых значений в новом массиве
            System.out.println(massiveReverse[i]);    // печать на консоль нового массива с измененными значениями
        }




        }
    }

