public class UnBoxingDemo {
    public static void main(String[] args) {
        // Unboxing: Wrapper class -> Primitive
        Integer n = 1000;

        // Cách 1: Thủ công
        int a = n.intValue();
        // Cách 2: Auto unboxing, chỉ dùng được theo cặp
        int b = n;

        // Bài toán: Chuyển String sang primitive number (sô nguyên thủy)
        String s = "9";
        int c = Integer.parseInt(s);
    }
}
