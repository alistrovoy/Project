package lesson16;

import java.util.HashSet;
import java.util.TreeSet;

public class Magazin {

    private HashSet<Tovar> tovars = new HashSet<>();

    public Magazin() {
    }

    public void addTovar(Tovar tovar){
        tovars.add(tovar);
    }





    public void printTovarsByPriceLowToHigh(){
        TreeSet<Tovar>tovarsLowToHigh = new TreeSet<>(new CompareLowToHigh());
        tovarsLowToHigh.addAll(tovars);


        for(Tovar tovar: tovarsLowToHigh) {
            System.out.println(tovar);
        }



    }


    public void pribtTovarsByRate(){
        TreeSet<Tovar>tovarsByRate = new TreeSet<>(new CompareByRate());
        tovarsByRate.addAll(tovars);

        for(Tovar tovar: tovarsByRate){
            System.out.println(tovar);
        }
    }
}

