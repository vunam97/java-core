import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department departmentA = new Department();
        departmentA.id =1;
        departmentA.name = "Giám đốc";

        System.out.println("Định danh phòng ban: " + departmentA.id);
        System.out.println("Tên phòng ban: " + departmentA.name);

        Position positionA = new Position();
        positionA.id = 1;
        positionA.name = PositionName.DEV;

        System.out.println("Định danh chức vụ: " + positionA.id);
        System.out.println("Tên chức vụ: " + positionA.name);

        Account accountA = new Account();
        accountA.id = 1;
        accountA.email = "nam.vt@gmail.com";
        accountA.username = "namvt";
        accountA.fullName = "Vũ Thế Nam";
        accountA.department = departmentA;
        accountA.position = positionA;
        accountA.createDate = LocalDate.now();

        System.out.println("Định dannh nhân viên: " + accountA.id);
        System.out.println("email nhân viên: " + accountA.email);
        System.out.println("username nhân viên: " + accountA.username);
        System.out.println("Tên nhân viên: " + accountA.fullName);
        System.out.println("Tên phòng ban: " + accountA.department.name);
        System.out.println("Tên chức vụ: " + accountA.position.name);
        System.out.println("Ngày tạo nhân viên: " +accountA.createDate);

    }
}
