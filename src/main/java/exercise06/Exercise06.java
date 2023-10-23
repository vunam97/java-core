package exercise06;

import java.util.Scanner;

public class Exercise06 {
    Scanner scanner = new Scanner(System.in);
    public void question01(){
        VietnamesePhone vietnamesePhone = new VietnamesePhone();
        while (true) {
            System.out.println("Mời bạn chọn chức năng muốn sử dụng");
            System.out.println("1. Thêm mới contact");
            System.out.println("2. Xóa contact");
            System.out.println("3. Sửa thông tin phoneNumer của contact");
            System.out.println("4. Tìm kiếm contact theo tên");
            System.out.println("5. In ra tất cả các thông tin của contact");
            System.out.println("0. Dừng chương trình");

            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Mời bạn nhập vào tên:");
                    String name = scanner.next();
                    System.out.println("Mời bạn nhập vào number:");
                    String number = scanner.next();

                    vietnamesePhone.insertContact(name, number);

                    break;
                case 2:
                    System.out.println("Mời bạn nhập tên:");
                    String removeName = scanner.next();

                    vietnamesePhone.removeContact(removeName);

                    break;
                case 3:
                    System.out.println("Mời bạn nhập vào tên cần update:");
                    String updateName = scanner.next();
                    System.out.println("Mời bạn nhập vào number cần update:");
                    String updateNumber = scanner.next();

                    vietnamesePhone.updateContact(updateName, updateNumber);

                    System.out.println("Kết quả");
                    vietnamesePhone.searchContact(updateName);
                    break;
                case 4:
                    System.out.println("Mời bạn nhập vào tên cần tìm:");
                    String searchName = scanner.next();

                    vietnamesePhone.searchContact(searchName);

                    break;

                case 5:
                    vietnamesePhone.getAllContact();
                    break;

                case 0:
                    return;

                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
        }
    }
}
