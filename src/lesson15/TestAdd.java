package lesson15;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestAdd {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add("dsadsad" + i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList:" + (endTime - startTime));


        LinkedList<String> linkedList = new LinkedList<>();

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add("dsadsad" + i);
        }

        long endTime1 = System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList:" + (endTime1 - startTime1));



        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.get(i);
        }

        long endTime2 = System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList:" + (endTime2 - startTime2));


        LinkedList<String> linkedList2 = new LinkedList<>();

        long startTime3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.get(i);
        }

        long endTime3 = System.currentTimeMillis();
        System.out.println("Время выполнения ArrayList:" + (endTime3 - startTime3));




    }
}
