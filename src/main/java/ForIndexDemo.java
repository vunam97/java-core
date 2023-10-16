public class ForIndexDemo {
    public static void main(String[] args) {
        String[] fruits = {"Cam", "Lê", "Táo", "Đào", "Dưa hấu"};

        for (int i = 0; i < fruits.length; i = i +1) {
            System.out.println("fruits["+ i + "]: " +fruits[i]);
        }
    }
}
