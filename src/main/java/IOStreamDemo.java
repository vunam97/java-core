import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "abc.txt";
//        writeFile(path, "Chào bạn", false);
//        readFile(path);

        Car car = new Car("BWV","Red");
        writeObject(path, car);
        readObject(path);
    }

    public static void readObject(String path) throws IOException, ClassNotFoundException {
        try (
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ) {
            Car car = (Car) ois.readObject();
            System.out.println("car = " + car);
        }
    }

    public static void writeObject(String path, Car car) throws IOException {
        try (
                FileOutputStream fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
                ){
            oos.writeObject(car);
        }
    }

    public static void readFile(String path) throws IOException {
        try(FileInputStream fis = new FileInputStream(path)) {
            byte[] buffer = new byte[1024];
            int length = fis.read(buffer);
            String result = new String(buffer, 0 , length);
            System.out.println("result = " + result);
        }
    }

    public static void writeFile(String path, String content, boolean append) throws IOException {
        try(FileOutputStream fos = new FileOutputStream(path, append)) {
            fos.write(content.getBytes(StandardCharsets.UTF_8));
        }
    }
}
