import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
        // Escape characters
        // \": Dấu nháy kép
        // \': Dấu nháy đơn
        // \n: Xuống dòng
        // \\: Dấu \

        // In và xuống dòng
        // System.out.println();
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println();

        // In
        // System.out.print();
        System.out.print("Hello World!\t");
        System.out.print("Hello \"World\"!\n");

        // In và định dạng
        // System.out.printf();
        // %n: Xuống dòng
        // %s: Đại diện cho chuỗi (String)
        // %d: Đại diện cho số nguyên
        // %f: Đại diện cho số thực (float, double)
        // %c: Đại diện cho ký tự (Char)
        // %15s: Đại diện cho chuỗi có độ dài min = 15, căn lề phải
        // %-15s: Đại diện cho chuỗi có độ dài min = 15, căn lề trái
        // %.2f: Đại diện cho số thực làm tròn 2 chữ số
        // %,d: Đại diện cho số nguyên, 3 chữ số được gom thành 1 nhóm
        String name = "Huy";
        int age = 18;

        System.out.println("Tên tôi là: " + name + ", tuổi: " + age);
        System.out.printf("Tên tôi là: %S, tuổi: %d%n", name, age);
        System.out.printf("%15s%n", name);
        System.out.printf("%-15s%n", name);

        float score = 3.75f;
        System.out.printf("score = %.1f%n", score);

        int money = 100000000;
        System.out.printf("Tiền: %,d", money);
        System.out.println();
        System.out.printf(Locale.ITALY, "Tiền: %,d", money);

    }
}
