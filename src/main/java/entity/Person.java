package entity;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    protected String name;
    protected String gender;
    protected LocalDate birthday;
    protected String address;

    public Person() {
    }

    public Person(String name, String gender, LocalDate birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời nhập tên: ");
        this.name = scanner.next();

        System.out.println("Mời nhập giới tính: ");
        this.gender = scanner.next();

        System.out.println("Mời nhập ngày sinh: ");
        this.birthday = LocalDate.parse(scanner.next());

        scanner.nextLine();
        System.out.println("Mời nhập địa chỉ: ");
        this.address = scanner.nextLine();
    }

//    public void showInfo(){
//        System.out.println("Tên là: " + this.name);
//        System.out.println("Giới tính là: " + this.gender);
//        System.out.println("Ngày sính là: " + this.birthday);
//        System.out.println("Địa chỉ là: " + this.address);
//    }

    public void showInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
