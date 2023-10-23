public class BoxingDemo {
    public static void main(String[] args) {
        // Boxing: Primitive -> Wrapper class
        int n = 1000;

        // Cách 1: Không nên dùng
        Integer a = new Integer(n);
        // Cách 2: Nên dùng, n có thể à String
        Integer b = Integer.valueOf(n);
        // Cách 3: Auto boxing, chỉ dùng được theo cặp
        Integer c = n;

        // Bài toán chuyển String thành number (Wrapper class)
        String s = "9";
        Integer d = Integer.valueOf(s);
    }
}
