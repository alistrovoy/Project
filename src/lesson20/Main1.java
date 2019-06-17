package lesson20;

import java.io.File;
import java.io.FileFilter;

public class Main1 {

    public static void main(String[] args) {
        File src = new File ("src");
       File[] allFiles = src.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()) {
                    return false;
                }
                if (pathname.getName().contains("h")) {
                    return true;
                }
                return false;
            }
        });

       for(File f: allFiles){
           System.out.println(f.getName());

       }
    }
}
