package exercise01;

import java.time.LocalDate;

public class Exercise01 {
    public void question01(){
        Department department = new Department();
        Department department1 = new Department("Giám đốc");
        System.out.println("department = " + department);
        System.out.println("department1 = " + department1);
    }

    public void question02(){
        Account account = new Account();
        Account account1 = new Account(1, "namvt@gmail.com", "namvt", "vũ", "nam");
        Account account2 = new Account(2,"namvt1@gmail.com", "namvt1", "vũ", "nam1", new Position());
        Account account3 = new Account(2,"namvt2@gmail.com", "namvt2", "vũ", "nam2", new Position(), LocalDate.now());
        System.out.println("account = " + account);
        System.out.println("account1 = " + account1);
        System.out.println("account2 = " + account2);
        System.out.println("account3 = " + account3);
    }

    public static void question03() {
       Group group = new Group();
       Group group1 = new Group("Developement", new Account(), LocalDate.now(), new Account[3]);
       Group group2 = new Group("Developement", new Account(), LocalDate.now(), new String[]{"namvt"});
        System.out.println("group = " + group);
        System.out.println("group1 = " + group1);
        System.out.println("group2 = " + group2);
    }
}
