public class ContinueDemo {
    public static void main(String[] args) {
        for (int i =0; i < 10; i = i +1) {
            System.out.println("Gặp số ... " + i);
            if(i != 5) {
                System.out.println("Số tiếp theo");
                continue;
            }
            System.out.println("Đã tìm thấy số 5");
            break;
        }
    }
}
