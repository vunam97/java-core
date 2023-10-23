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
            System.out.println("1. Đăng nhập");
            System.out.println("2. Thoát");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findByEmailAndPassword();
            } else if (menu == 2) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void showInfo() throws SQLException, IOException {
        while (true) {
            System.out.println("1. Tìm kiếm thông tin user của project");
            System.out.println("2. Tìm kiếm thông tin employee của project");
            System.out.println("3. Xem thông tin manager");
            System.out.println("4. Tạo user");
            System.out.println("5. Đăng xuất");
            int menu = ScannerUtil.inputInt();
            if (menu == 1) {
                findAllByProjectId();
            } else if (menu == 2){
                findEmployeeByProjectId();
            } else if (menu == 3) {
                findAllManager();
            } else if (menu == 4) {
                create();
            } else if (menu == 5) {
                return;
            } else {
                System.out.println("Vui lòng chọn đúng chức năng.");
            }
        }
    }

    public void findAllByProjectId() throws SQLException, IOException {
        System.out.println("Nhập vào project id:");
        int project_id = ScannerUtil.inputPositiveInt();
        List<User> users = controller.findAllByProjectId(project_id);

        System.out.println("+------+-----------------+-------------------+----------+");
        System.out.println("|  ID  |     FULL NAME   |        EMAIL      |   ROLE   |");
        System.out.println("+------+-----------------+-------------------+----------+");

        if (users.isEmpty()){
            System.out.printf("| %-4s | %-15s | %-17s | %-8s |%n", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+------+-----------------+-------------------+----------+");
        } else {
            for (User user : users) {
                System.out.printf("| %-4s | %-15s | %-17s | %-8s |%n", user.getId(), user.getFullName(), user.getEmail(), user.getRole());
                System.out.println("+------+-----------------+-------------------+----------+");
            }
        }
    }

    public void findEmployeeByProjectId() throws SQLException, IOException {
        System.out.println("Nhập vào project id:");
        int project_id = ScannerUtil.inputPositiveInt();
        List<User> users = controller.findEmployeeByProjectId(project_id);


        System.out.println("+------+-----------------+-------------------+----------+");
        System.out.println("|  ID  |     FULL NAME   |        EMAIL      |   ROLE   |");
        System.out.println("+------+-----------------+-------------------+----------+");

        if (users.isEmpty()){
            System.out.printf("| %-4s | %-15s | %-17s | %-8s |%n", "NULL", "NULL", "NULL", "NULL");
            System.out.println("+------+-----------------+-------------------+----------+");
        } else {
            for (User user : users) {
                System.out.printf("| %-4s | %-15s | %-17s | %-8s |%n", user.getId(), user.getFullName(), user.getEmail(), user.getRole());
                System.out.println("+------+-----------------+-------------------+----------+");
            }
        }

    }

    public void findAllManager() throws SQLException, IOException {
        System.out.println("Danh sách manager: ");
        List<User> users = controller.findAllManager();

        System.out.println("+------+-----------------+-------------------+----------+-------+");
        System.out.println("|  ID  |     FULL NAME   |        EMAIL      |   ROLE   | PJ_ID |");
        System.out.println("+------+-----------------+-------------------+----------+-------+");

        for (User user : users) {
            System.out.printf("| %-4s | %-15s | %-17s | %-8s | %-5s |%n", user.getId(), user.getFullName(), user.getEmail(), user.getRole(), user.getProject_id());
            System.out.println("+------+-----------------+-------------------+----------+-------+");
        }
    }

    public void findByEmailAndPassword() throws SQLException, IOException {

        System.out.println("Mời bạn nhập vào thông tin đăng nhập.");
        System.out.println("Nhập vào email:");
        String email = ScannerUtil.inputEmail();

        System.out.println("Nhập vào password:");
        String password = ScannerUtil.inputPassword();

        User user = controller.findByEmailAndPassword(email, password);

        if (user == null) {
            System.out.println("Đăng nhập thất bại");
        } else {
            User.Role role = user.getRole();
            System.out.printf("Đăng nhập thành công: %s - %s.%n", user.getFullName(),role);
            showInfo();
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

        int result = controller.create(user);
        System.out.printf("Đã tạo thành công %d user(s). %n", result);
    }
}
