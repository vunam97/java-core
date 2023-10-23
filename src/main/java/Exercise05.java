import java.time.LocalDate;
import java.util.Scanner;

public class Exercise05 {
    Scanner scanner = new Scanner(System.in);

    void question01() {
        System.out.println("Nhập vào số nguyên thứ nhất");
        int int_1 = scanner.nextInt();
        System.out.println("Nhập vào số nguyên thứ hai");
        int int_2 = scanner.nextInt();
        System.out.println("Nhập vào số nguyên thứ ba");
        int int_3 = scanner.nextInt();
        System.out.println("3 sô nguyên vừa nhập là: " + int_1 + ", " + int_2 + ", " + int_3);
    }

    void question02(){
        System.out.println("Nhập số thực thứ nhất");
        float float_1 = scanner.nextFloat();
        System.out.println("Nhập số thực thứ hai");
        float float_2 = scanner.nextFloat();
        System.out.println("2 sô thực vừa nhập là: " + float_1 + ", " + float_2);
    }

    void question03(){
        System.out.println("Nhập họ và tên: ");
        String fullname = scanner.nextLine();
        System.out.println("Họ và tên là: " + fullname);
    }

    void question04(){
        System.out.println("Nhập ngày sinh (yyyy-mm-dd): ");
        LocalDate birthdate = LocalDate.parse(scanner.next());
        System.out.println("birthdate = " + birthdate);
    }

    void question05() {
        System.out.println("Mời bạn nhập vào thông tin account");
        Account account = new Account();

        System.out.println("Nhập vào id:");
        account.id = scanner.nextInt();

        System.out.println("Nhập vào email:");
        account.email = scanner.next();

        System.out.println("Nhập vào username:");
        account.username = scanner.next();

        scanner.nextLine(); // Ăn bỏ Enter
        System.out.println("Nhập vào fullname:");
        account.fullName = scanner.nextLine();

        Position position = new Position();
        System.out.println("Nhập vào position name:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Scrum Master");
        System.out.println("4. Project Manager");
        int index = scanner.nextInt();
        if (index == 1) {
            position.name = PositionName.DEV;
        } else if(index == 2){
            position.name = PositionName.TEST;
        } else if(index == 3){
            position.name = PositionName.SCRUM_MASTER;
        } else if(index == 4){
            position.name = PositionName.PM;
        }
        account.position = position;

        System.out.println("Thông tin account bạn vừa nhập là:");
        System.out.println("- id = " + account.id);
        System.out.println("- email = " + account.email);
        System.out.println("- username = " + account.username);
        System.out.println("- fullname = " + account.fullName);
        System.out.println("- position = " + account.position.name);
    }

    void question06() {
        Department department = new Department();

        System.out.println("Nhập id: ");
        department.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập tên phòng ban");
        department.name = scanner.nextLine();

        System.out.println("Thông tin phòng ban bạn vừa nhập là: ");
        System.out.println("id: " + department.id);
        System.out.println("Tên phòng ban: " + department.name);
    }

    void question07() {
        System.out.println("Nhập số chẵn: ");
        int so_chan = scanner.nextInt();

        while (true){
            if (so_chan % 2 == 0) {
                System.out.println(so_chan + " là số chẵn");
                break;
            } else {
                System.out.println("nhập lại: ");
                so_chan = scanner.nextInt();
            }
        }
    }

    void question08(){
        Account account = new Account();
        Department department = new Department();

        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("Mời bạn nhập chức năng muốn sử dụng");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập id của account: ");
                    account.id = scanner.nextInt();
                    System.out.println("Nhập email của account: ");
                    account.email = scanner.next();
                    System.out.println("Nhập username của account: ");
                    account.username = scanner.next();
                    scanner.nextLine();
                    System.out.println("Nhập fullname của account: ");
                    account.fullName = scanner.nextLine();

                    System.out.println("Thông tin account bạn vừa nhập là:");
                    System.out.println("- id = " + account.id);
                    System.out.println("- email = " + account.email);
                    System.out.println("- username = " + account.username);
                    System.out.println("- fullname = " + account.fullName);
                    break;
                case 2:
                    System.out.println("Nhập id của department");
                    department.id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhập tên department");
                    department.name = scanner.nextLine();

                    System.out.println("Thông tin department bạn vừa nhập là:");
                    System.out.println("- id = " + department.id);
                    System.out.println("- email = " + department.name);
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    System.out.println("-----------------------");
                    break;
            }
        }
    }
}
