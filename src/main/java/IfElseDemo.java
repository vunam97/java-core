public class IfElseDemo {
    public static void main(String[] args) {
        int month = 10;

        if (month == 1) {
            System.out.println("Tháng 1 có 31 ngày");
        } else if (month == 2) {
            System.out.println("Tháng 2 có 28 hoặc 29 ngày");
        } else if (month == 3) {
            System.out.println("Tháng 3 có 31 ngày");
        } else {
            System.out.println("Không biết");
        }
    }
}
