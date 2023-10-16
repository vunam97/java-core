import java.util.Scanner;

public class SacnnerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nập vào tuổi của bạn: ");
        int age = scanner.nextInt();
        System.out.println("Tuổi cảu bạn là: " + age);

        System.out.print("Nhập vào email của bạn: ");
        String email = scanner.next();
        System.out.println("Email của bạn là: " + email);

        scanner.nextLine();
        System.out.print("Nhập vào họ và tên: ");
        String fullname = scanner.nextLine();
        System.out.println("Họ và tên: " + fullname);
    }
}
