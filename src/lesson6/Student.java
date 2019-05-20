package lesson6;

public class Student {


    //формула создания метода

    // 1- модификатор доступа(public, private, protected,pakage(пустое место))
    //public - доступ по всему проекту
    //пустое место - доступ внутри текущей папки
    //protected - доступ внутри текущего класса и его наследникам
    //private - доступ внутри текущего класса

    // 2 - статичность. слово static есть или нет

    // 3 - указывается возвращаемый тип (int, String, char[], .....) или если нет возвращаемого типаn ,то пишем void

    // 4 - название метода (придумываем в произвольной форме)

    // 5 - входящие параметры в круглых скобках через запятую (тип и название переменной)

    //6 - тело метода. Т.е. то что будет выполняться, когда метод будет вызван


    public static int summaTrexChisel(int a, int b, int c) {

        int summa = a + b + c;

        return summa;
    }

    public static int perimetrPryamougolnika(int a, int b) {

        int perimetr = (a + b) + (a + b);

        return perimetr;
    }

    public static void Privet(int a) {

        for (int i = 0; i < a; i++) {

            System.out.println("Privet");
        }
    }

    public static void Chislo(int a) {

        if(a % 2 ==0){

            System.out.println("chetnoe");
        }
        else{
            System.out.println("Nechetnoe");
        }

    }
}

