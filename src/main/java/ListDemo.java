import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // List: Danh sách
        List<String> friuts = new ArrayList<>();
        // Thêm dữ liệu vào cuối
        friuts.add("Táo");
        // Thêm dữ liệu vào vị trí bấy kỳ
        friuts.add(0, "Dưa hấu");
        // Kiểm tra danh sách có trống hay không
        System.out.println("friuts.isEmpty() = " + friuts.isEmpty());
        // Lấy ra độ dài dánh sách
        System.out.println("friuts.size() = " + friuts.size());
        // Lấy ra phần tử thứ i
        System.out.println("friuts.get(0) = " + friuts.get(0));
        // Lặp danh sách
        for (String friut : friuts) {
            System.out.println("friut = " + friut);
        }
    }
}
