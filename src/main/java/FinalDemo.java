public class FinalDemo {
    public static void main(String[] args) {
        // Sử dụng: class, method, property, parameter
        // final class: Đánh dấu class đó không thể bị kế thừa
        // final method: Đánh dấu method đó không thể bị override
        // final property, final parameter: Không thể thay đổi giá trị
        final double PI = 3.1415;

        int sum = sum(100, 1000);
        System.out.println("sum = " + sum);
    }

    public static int sum(final int a, final int b){
        return a + b;
    }
}
