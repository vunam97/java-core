public class Exercise01 {
    // IF ELSE
    void question01() {
        Department department = new Department();
        department.name = "Giám đốc";

        Account account = new Account();
        account.department = department;

        if (account.department == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là " + account.department.name);
        }
    }

    void question02() {
        Account account = new Account();
        account.groups = new Group[] {new Group(), new Group()};
//        account.groups = new Group[3];

        if (account.groups == null || account.groups.length == 0) {
            System.out.println("Nhân viên này chưa có group");
        } else if (account.groups.length == 1 || account.groups.length == 2){
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account.groups.length == 3){
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        } else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }
    }

    void question03() {
        Department department = new Department();
        department.name = "Sale";

        Account account = new Account();
        account.department = department;

        String results = account.department == null
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là " + account.department.name;
        System.out.println(results);
    }

    void question04() {
        Position position = new Position();
        position.name = PositionName.DEV;

        Account account = new Account();
        account.position = position;

        String message = account.position.name == PositionName.DEV
                ? "Đây là Developer"
                : "Người này không phải là Developer";
        System.out.println(message);
    }

    // SWITCH CASE
    void question05() {
        Group group = new Group();
        group.accounts = new Account[] {new Account()};

        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }

    void question06() {
        Account account = new Account();
        account.groups = new Group[] {new Group(), new Group()};

        switch (account.groups.length){
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }

    void question07() {
        Position position = new Position();
        position.name = PositionName.PM;

        Account account = new Account();
        account.position = position;

        switch (account.position.name) {
            case DEV:
                System.out.println("Đây là Developer");
                break;
            default:
                System.out.println("Người này không phải là Developer");
                break;
        }
    }

    // FOR EACH
    void question08() {
        Department department = new Department();
        department.name = "Nhân sự";

        Account account = new Account();
        account.email = "nam.vt@gmail.com";
        account.fullName = "Vũ Thế Nam";
        account.department = department;

        Account[] accounts = {account};

        for (Account accountInfo : accounts) {
            System.out.println("- email: " + accountInfo.email);
            System.out.println("- fullName: " + accountInfo.fullName);
            System.out.println("- Tên phòng ban: " + accountInfo.department.name);
        }

    }

    void question09(){
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Giám đốc";
        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Bảo vệ";

        Department[] departments = {departmentA, departmentB};

        for (Department departmentInfo : departments) {
            System.out.println("- id: " + departmentInfo.id);
            System.out.println("- name: " + departmentInfo.name);
        }
    }

    // FOR
    void question10() {
        Department department1 = new Department();
        department1.name = "Sale";
        Department department2 = new Department();
        department2.name = "Marketing";

        Account account1 = new Account();
        account1.email = "NguyenVanA@gmail.com";
        account1.fullName = "Nguyễn Văn A";
        account1.department = department1;

        Account account2 = new Account();
        account2.email = "NguyenVanB@gmail.com";
        account2.fullName = "Nguyễn Văn B";
        account2.department = department2;

        Account[] accounts = {account1, account2};

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);
        }
    }

    void question11() {
        Department departmentA = new Department();
        departmentA.id = 1;
        departmentA.name = "Sale";
        Department departmentB = new Department();
        departmentB.id = 2;
        departmentB.name = "Marketing";

        Department[] departments = {departmentA, departmentB};

        for (int i = 0; i < departments.length; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
            System.out.println("- Id: " + departments[i].id);
            System.out.println("- Name: " + departments[i].name);
        }
    }

    void question12() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";
        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";

        Department[] departments = {department1, department2};

        for (int i = 0; i < 2; i++) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Tên phòng: " + departments[i].name);
        }
    }

    void question13() {
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "NguyenVanA@gmail.com";
        account1.fullName = "Nguyễn Văn A";

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "NguyenVanB@gmail.com";
        account2.fullName = "Nguyễn Văn B";

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "NguyenVanC@gmail.com";
        account3.fullName = "Nguyễn Văn C";

        Account account4 = new Account();
        account4.id = 4;
        account4.email = "NguyenVanD@gmail.com";
        account4.fullName = "Nguyễn Văn D";

        Account[] accounts = new Account[] {account1, account2, account3, account4};

        for (int i = 0; i < accounts.length; i++) {
            if(i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
                System.out.println("- Id: " + accounts[i].id);
                System.out.println("- Email: " + accounts[i].email);
                System.out.println("- Full name: " + accounts[i].fullName);
            }
        }
    }

    void question14() {
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "account1@gmail.com";
        account1.username = "account1";
        Account account2 = new Account();
        account2.id = 2;
        account2.email = "account2@gmail.com";
        account2.username = "account2";
        Account account3 = new Account();
        account3.id = 3;
        account3.email = "account3@gmail.com";
        account3.username = "account3";
        Account account4 = new Account();
        account4.id = 4;
        account4.email = "account4@gmail.com";
        account4.username = "account4";

        Account[] accounts = {account1, account2, account3, account4};

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("- Id: " + accounts[i].id);
                System.out.println("- Email: " + accounts[i].email);
                System.out.println("- Username: " + accounts[i].username);
            }
        }
    }

    void question15() {
        System.out.println("Những số chẵn <= 20 gồm: ");
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(i);
        }
    }

    // WHILE
    void question16_10() {
        //question10
        Department department1 = new Department();
        department1.name = "Sale";
        Department department2 = new Department();
        department2.name = "Marketing";

        Account account1 = new Account();
        account1.email = "NguyenVanA@gmail.com";
        account1.fullName = "Nguyễn Văn A";
        account1.department = department1;

        Account account2 = new Account();
        account2.email = "NguyenVanB@gmail.com";
        account2.fullName = "Nguyễn Văn B";
        account2.department = department2;

        Account[] accounts = new Account[] {account1, account2};

        int i = 0;
        while (i < accounts.length) {

            System.out.println("Thông tin account thứ " + (i + 1) + " là:");
            System.out.println("Email: " + accounts[i].email);
            System.out.println("Full name: " + accounts[i].fullName);
            System.out.println("Phòng ban: " + accounts[i].department.name);

            i++;
        }

    }

    void question16_11() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";
        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";

        Department[] departments = new Department[]{department1, department2};

        int i = 0;
        while (i < departments.length) {
            System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
            System.out.println("- Id: " + departments[i].id);
            System.out.println("- Name: " + departments[i].name);
            i++;
        }
    }

    void question16_12() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";
        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Marketing";

        Department[] departments = {department1, department2};

        int i =0;
        while (i<2){
            System.out.println("Thông tin department thứ " + (i + 1) + " là: ");
            System.out.println("Id: " + departments[i].id);
            System.out.println("Tên phòng: " + departments[i].name);

            i++;
        }
    }

    void question16_13() {
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "NguyenVanA@gmail.com";
        account1.fullName = "Nguyễn Văn A";

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "NguyenVanB@gmail.com";
        account2.fullName = "Nguyễn Văn B";

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "NguyenVanC@gmail.com";
        account3.fullName = "Nguyễn Văn C";

        Account account4 = new Account();
        account4.id = 4;
        account4.email = "NguyenVanD@gmail.com";
        account4.fullName = "Nguyễn Văn D";

        Account[] accounts = {account1, account2, account3, account4};

        int i = 0;
        while (i < accounts.length) {
            if (i != 1){
                System.out.println("Thông tin account thứ " + (i + 1) + " là: ");
                System.out.println("- Id: " + accounts[i].id);
                System.out.println("- Email: " + accounts[i].email);
                System.out.println("- Full name: " + accounts[i].fullName);
            }

            i++;
        }
    }

    void question16_14() {
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "account1@gmail.com";
        account1.username = "account1";
        Account account2 = new Account();
        account2.id = 2;
        account2.email = "account2@gmail.com";
        account2.username = "account2";
        Account account3 = new Account();
        account3.id = 3;
        account3.email = "account3@gmail.com";
        account3.username = "account3";
        Account account4 = new Account();
        account4.id = 4;
        account4.email = "account4@gmail.com";
        account4.username = "account4";

        Account[] accounts = {account1, account2, account3, account4};

        int i = 0;
        while (i < accounts.length){
            if (accounts[i].id < 4) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("- Id: " + accounts[i].id);
                System.out.println("- Email: " + accounts[i].email);
                System.out.println("- Username: " + accounts[i].username);
            }
            i++;
        }
    }
    void question16_15() {
        //question15
        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i+=2;
        }
    }

    // DO-WHILE
    void question17_15() {
        int i = 0;
        do {
            System.out.println(i);
            i+=2;
        }while (i <= 20);
    }
}
