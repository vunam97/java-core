public class StaticDemo {
    public static void main(String[] args) {
        // Lớp (class): Bản vẽ, bản thiết kế cho kiểu dữ liệu đó
        // Đối tượng (object): là 1 thực thể được tạo ra từ class (new)

        // Từ khóa static: Đánh dấu thuộc tính, phương thức thuộc về class
        // Sử dụng cho: property, method
        // 1. Truy cập thông qua tên class
        // 2. Tồn tại đến khi chương trình kết thúc
        // 3. Static chỉ gọi được static

        Student studentA = new Student("Duy");
        Student studentB = new Student("Hùng");
        Student studentC = new Student("Nhi");

        System.out.println("studentA = " + studentA);
        System.out.println("studentB = " + studentB);
        System.out.println("studentC = " + studentC);

    }
}
