package lesson1_Datatype;

public class Main4 {
    public static void main(String[] args) {

        int sum=1000;
        int pizza =230;
        int gum = 26;
        double candy = 2.5;
        int maxpizza;
        int maxgum;
        double maxcandy;
        int maxpizzarest;
        int maxgumrest;
        double maxcandyrest;
        long Ipart;
        double Fpart;




        maxpizza= sum/pizza;             //4
        maxpizzarest = sum%pizza;      //80
        maxgum = maxpizzarest/gum;       //3
        maxgumrest = maxpizzarest%gum;   //2
        maxcandy = maxgumrest / candy;   //0.8
        Ipart = (long) maxcandy;
        Fpart = maxcandy - Ipart;        //0
        maxcandyrest = maxgumrest%candy; //2




        System.out.println("На эти деньги мы можем купить:\n "+"максимум пиццы "+ maxpizza +"\n " + "максимум жвачки " + maxgum + "\n "+"максимум конфет " + maxcandy+ "\n "+ "Сдача магазина: "+ maxcandyrest);

    }
}
