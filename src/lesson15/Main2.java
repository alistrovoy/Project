package lesson15;

import java.util.Iterator;
import java.util.LinkedList;

public class Main2 {

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(5);
        numbers.add(455);
        numbers.add(324);

        //первый способ for each

        for(Integer n:numbers){
            System.out.println(n);
        }

        System.out.println("____________");


        //второй способ - for

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("_____________");




        //   c помощью итератора

         for (Iterator<Integer> iter = numbers.iterator();iter.hasNext();){
             System.out.println(iter.next());

         }
    }
}
