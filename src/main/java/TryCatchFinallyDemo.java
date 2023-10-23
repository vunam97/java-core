public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            System.out.println("Trước khi chia");
            int c = 1 / 0;
            System.out.println("Sau khi chia");
            System.out.println("c = " + c);

            // NullPointerException
            String s = null;
            System.out.println("s.length() = " + s.length());

        } catch (ArithmeticException e) {
            System.out.println("Không thể chia cho 0");
        } catch (NullPointerException e) {
            System.out.println("Xử lý NullPointerException");
        } finally {
            // Luôn luôn được chạy
            System.out.println("Giải phóng tài nguyên");
        }
    }
}
