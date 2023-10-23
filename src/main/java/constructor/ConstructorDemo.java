package constructor;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: Hàm khởi tạo
        // Mặc định: Không tham số
        // 1. Không có kiểu dữ liệu trả về
        // 2. Tên giống với tên class
        // Từ khóa this: Tham chiếu đến chính class đó

        Animal dog = new Animal();
        System.out.println("dog = " + dog);
    }
}
