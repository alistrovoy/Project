package lesson15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetMain {
    public static void main(String[] args) {


        LinkedHashSet<String> texts = new LinkedHashSet<>();
        texts.add("qwaaa");
        texts.add("s");
        texts.add("d");
        texts.add("a");
        texts.add("qwaaa");

        System.out.println("_____________");


        for (String t : texts) {
            System.out.println(t);
        }

    }

}
