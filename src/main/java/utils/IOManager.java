package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOManager {
    public static final String FILE_NOT_EXIST = "Error! File Not Exist.";
    public static String readFile(String path) throws IOException {
        if(FileManager.exists(path)){
            try(FileInputStream fis = new FileInputStream(path)) {
                byte[] buffer = new byte[1024];
                int length = fis.read(buffer);
                return new String(buffer, 0, length);
            }
        }
        throw new IllegalStateException(FILE_NOT_EXIST);
    }

    public static void writeFile(String path, String content, boolean append) throws IOException {
        if(FileManager.exists(path)){
            try(FileOutputStream fos = new FileOutputStream(path, append)) {
                fos.write(content.getBytes(StandardCharsets.UTF_8));
            }
        }
        throw new IllegalStateException(FILE_NOT_EXIST);
    }
}
