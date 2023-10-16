public class BreakDemo {
    public static void main(String[] args) {
        for (int i =0; i < 10; i = i +1) {
            System.out.println("Đang tìm kiếm số 5 ...");
            if(i == 5) {
                System.out.println("Đã tìm thấy sô 5");
                break;
            }
        }
    }
}
