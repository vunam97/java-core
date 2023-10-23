public class DatatypeCastingDemo {
    public static void main(String[] args) {
        // Widening: Nới rộng
        // byte (1) -> short (2) -> int (4) -> long(8) -> float(4) -> double(8)
        int a = 100;
        long b = a;

        // Kiểu dữ liệu trả về của 1 phép tính là kiểu lớn nhất trong 2 số
        int c = 1;
        int d = 2;
        float e = (float) c / d;
        System.out.println("e = " + e);

        // Narrowing: Thu hẹp
        // double(8) -> float(4) -> long(8) -> int (4) -> short (2) -> byte (1)
        long n = 1000;
        byte m = (byte) n;
        System.out.println("m = " + m);

        // Phần nguyên
        float score = 8.1f;
        int x = (int) score;
        System.out.println("x = " + x);
    }
}
