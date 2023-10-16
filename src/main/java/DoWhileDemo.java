public class DoWhileDemo {
    // Do while luôn thực thi khối lẹnh ít nhất 1 lần
    public static void main(String[] args) {
        String[] fruits = {"Cam", "Lê", "Táo", "Đào", "Dưa hấu"};

        int i = 0;
        do {
            System.out.println("fruits["+ i + "]: " +fruits[i]);
            i = i + 2;
        } while (i < fruits.length);
    }
}
