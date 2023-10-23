package frontend;

import backend.controller.UserController;
import entity.User;
import utils.ScannerUtil;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserFunction {
    private UserController controller = new UserController();

    public void showMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Hiện thị danh sách user.");
            System.out.println("2. Tìm kiếm user theo id.");
            System.out.println("3. Đăng nhập.");
            System.out.println("4. Thoát chương trình.");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                findByEmailAndPassword();
            } else if (menu == 4) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void showAdminMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Hiện thị danh sách user.");
            System.out.println("2. Tìm kiếm user theo id.");
            System.out.println("3. Thêm user.");
            System.out.println("4. Xóa user theo id.");
            System.out.println("5. Đăng xuất.");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                deleteById();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void showEmployeeMenu() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Hiện thị danh sách user.");
            System.out.println("2. Tìm kiếm user theo id.");
            System.out.println("3. Đăng xuất.");
            System.out.println("Mời bạn chọn chức năng");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void findAll() throws SQLException, IOException {
        System.out.println("Danh sách user:");
        List<User> users = controller.findAll();
        System.out.println("+----+-----------------+-------------------+----------+");
        System.out.println("| ID |     FULL NAME   |        EMAIL      | PASSWORD |");
        System.out.println("+----+-----------------+-------------------+----------+");
        for (User user : users) {
            System.out.printf("| %-2d | %-15s | %-17s | %-8s |%n", user.getId(), user.getFullName(), user.getEmail(), user.getPassword());
            System.out.println("+----+-----------------+-------------------+----------+");
        }
    }

    public void findById() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào user cần tìm kiếm.");
        System.out.println("Nhập vào id:");
        int id = ScannerUtil.inputPositiveInt();
        User user = controller.findById(id);

        System.out.println("+------+-----------------+-------------------+");
        System.out.println("|  ID  |     FULL NAME   |        EMAIL      |");
        System.out.println("+------+-----------------+-------------------+");

        if (user == null) {
            System.out.printf("| %-4s | %-15s | %-17s |%n", "NULL", "NULL", "NULL");
        } else {
            System.out.printf("| %-4s | %-15s | %-17s |%n", user.getId(), user.getFullName(), user.getEmail());
        }
        System.out.println("+------+-----------------+-------------------+");
    }

    public void findByEmailAndPassword() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin đăng nhập.");
        System.out.println("Nhập vào  email:");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhập vào password:");
        String password = ScannerUtil.inputPassword();
        User user = controller.findByEmailAndPassword(email, password);
        if (user == null) {
            System.out.println("Đăng nhập thất bại");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFullName(),role);
            if (role == User.Role.ADMIN) {
                showAdminMenu();
            } else {
                showEmployeeMenu();
            }
        }
    }

    public void create() throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin user:");
        User user = new User();

        System.out.println("Nhập vào full name: ");
        user.setFullName(ScannerUtil.inputFullNam());

        System.out.println("Nhập vào email: ");
        user.setEmail(ScannerUtil.inputEmail());

        System.out.println("Nhập vào password: ");
        user.setPassword(ScannerUtil.inputPassword());

        System.out.println("Nhập vào role: ");
        user.setRole(ScannerUtil.inputString());

        int result = controller.create(user);
        System.out.printf("Đã tạo thành công %d user(s). %n", result);
    }

    public void deleteById () throws SQLException, IOException {
        System.out.println("Mời bạn nhập vào thông tin user cần xóa.");
        System.out.println("Nhập vào id:");
        int id = ScannerUtil.inputPositiveInt();
        int result = controller.deleteById(id);
        System.out.printf("Đã xóa thành công %d user(s). %n", result);
    }
}
