package lesson15;

import java.util.ArrayList;

public class Main {
    //коллекция - безразмерный динамический  массив
    //1 - array list
    //чтобы создать объект коллекции указываем тип данных в <>, название для обращения
    public static void main(String[] args) {
        ArrayList<String> texts = new ArrayList<>();
        texts.add("qwerty");
        texts.add("ertyu");
        texts.add("wefcesdfv");
        texts.add("wwwwwwwww");
        texts.add("ddddddddd");


        texts.add(0,"!!!");
        texts.set(0,"???");
        texts.remove("???");
        String firstElement = texts.get(0);

        System.out.println(firstElement);


        System.out.println("------------");

        System.out.println(texts.size());

        for(String t:texts){
            System.out.println(t);
        }


    }
}
