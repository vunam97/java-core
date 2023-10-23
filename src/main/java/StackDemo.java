import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Last In - First out: Vào sau ra trước
        Stack<String> fruits = new Stack<>();
        // Thêm phần tử
        fruits.push("Táo");
        fruits.push("Cam");
        fruits.push("Lê");
        fruits.push("Đào");
        fruits.push("Mận");
        // Xem phần tử ở đỉnh stack
        System.out.println("Phần tử ở đỉnh: " + fruits.peek());
        // Lấy ra phần tủ ở đỉnh stack
        fruits.pop();
        // Lấy ra tất cả phần tử
        while (!fruits.empty()){
            String fruit = fruits.pop();
            System.out.println("fruit = " + fruit);
        }
    }
}
