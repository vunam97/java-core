import java.io.File;
import java.io.IOException;
import java.text.FieldPosition;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        String path = "abc.txt";

        boolean isFileCreated = createFile(path);
        System.out.println("isFileCreateed = " + isFileCreated);

        deleteFile(path);
    }

    public static void deleteFile(String path) {
        File file = new File(path);
        boolean result =  file.delete();
        System.out.println("result = " + result);
    }

    public static boolean createFile(String path) throws IOException {
        File file = new File(path);
        return file.createNewFile();
    }
}
