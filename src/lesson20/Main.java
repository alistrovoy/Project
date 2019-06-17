package lesson20;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File startdir = new File("Resources2");


        if (!startdir.exists()){
            startdir.mkdir();
        }
        File [] allFiles = startdir.listFiles();
        for (File file:allFiles) {
            System.out.println(file.getName());
        }
    }
}
