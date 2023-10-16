public class WhileDemo {
    public static void main(String[] args) {
        String[] fruits = {"Cam", "Lê", "Táo", "Đào", "Dưa hấu"};

        int i = 0;
        while (i < fruits.length) {
            System.out.println("fruits["+ i + "]: " +fruits[i]);
            i = i + 2;
        }
    }
}
