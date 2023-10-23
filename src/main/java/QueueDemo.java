import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue: Hàng đợi
        // Last In Last Out
        Queue<String> students = new LinkedList<>();
        // Thêm vào hàng đợi
        students.offer("Huy");
        students.offer("Cường");
        students.offer("Duy");
        // Lấy phần tử ở đầu hàng đợi
        System.out.println("Học sinh đầu hàng: " + students.poll());
        // Lặp các phần tử trong hàng đợi
        while (!students.isEmpty()){
            String student = students.poll();
            System.out.println("- student = " + student);
        }
    }
}
