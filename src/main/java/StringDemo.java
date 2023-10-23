public class StringDemo {
    public static void main(String[] args) {
        // Khai báo kiểu nguyên thủy
        String s1 = "Java";
        String s2 = "Java";
        // Khai báo kiểu đối tương
        String s3 = new String("Java");
        String s4 = new String("Java");

        boolean result12 = (s1 == s2);
        boolean result34 = (s3 == s4);
        boolean result13 = (s1.equals(s3));
        System.out.println("result12 = " + result12);
        System.out.println("result34 = " + result34);
        System.out.println("result13 = " + result13);

        // So sánh == và equals
        // ==: So sánh địa chỉ
        // equals: So sánh nội dung
    }
}
