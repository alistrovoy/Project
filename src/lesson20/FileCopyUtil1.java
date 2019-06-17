package lesson20;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.FileAlreadyExistsException;

public class FileCopyUtil1 implements nedis.study.interfaces.t6.io.FileCopyUtils {


    @Override
    public void copyFile(String source, String destination) throws lesson20.FileCopyFailedException, FileAlreadyExistsException {

        Path pathSource = Paths.get(source);
        Path pathDestination = Paths.get(destination);
        try {
            Files.copy(pathSource, pathDestination, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
    e.printStackTrace();
            }

    }
}
