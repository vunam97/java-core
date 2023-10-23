package utils;

import java.io.File;
import java.io.IOException;

public class FileManager {
    public static final String FILE_EXISTS = "Error! File Exist.";
    public static final String FILE_NOT_EXIST = "Error! File Not Exist.";
    public static final String PATH_IS_NOT_FOLDER = "Error! Path is not folder.";
    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }

    public static boolean createNewFile(String path) throws IOException {
        if(exists(path)){
            throw new IllegalStateException(FILE_EXISTS);
        }
        File file = new File(path);
        return file.createNewFile();
    }

    public static boolean delete(String path){
        if (!exists(path)){
            throw new IllegalStateException(FILE_NOT_EXIST);
        }
        File file = new File(path);
        return file.delete();
    }

    public static boolean isFolder(String path){
        File file = new File(path);
        return file.isDirectory();
    }

    public static String[] getAllFileName(String path){
        if(isFolder(path)){
            File file = new File(path);
            return file.list();
        }
        throw new IllegalStateException(PATH_IS_NOT_FOLDER);
    }
}
