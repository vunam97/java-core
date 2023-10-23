public class OverloadDemo {
    public static void main(String[] args) {
        // Chữ ký phương thức: Tên phương thức + danh sách tham số truyền vào
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static float sum(float a, float b){
        return a + b;
    }
}
