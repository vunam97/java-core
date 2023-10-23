package entity;

import java.util.Scanner;

public class Student extends Person {
    private int id;
    private double score;
    private String email;

    @Override
    public void inputInfo() {
        Scanner scanner = new Scanner(System.in);
        super.inputInfo();

        System.out.println("Mời nhập id: ");
        this.id = scanner.nextInt();

        System.out.println("Mời nập điểm trung bình: ");
        this.score = scanner.nextFloat();

        System.out.println("Mời nhập email: ");
        this.email = scanner.next();
    }

    public void showInfo(){
        super.showInfo();
    }

    public boolean scholarship(){
        return score >= 8.0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", score=" + score +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday=" + birthday +
                ", address='" + address + '\'' +
                '}';
    }
}
