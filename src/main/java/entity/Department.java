package entity;

import util.ScannerUltil;

public class Department {
    private int id;
    private String name;

    public Department() {
        System.out.println("Mời bạn nhập vào thông tin department: ");
        System.out.println("Nhập vào id: ");
        this.id = ScannerUltil.inputId("Mời nhập lại: ");
        System.out.println("Nhập vào tên department: ");
        this.name = ScannerUltil.inputString("Mời nập lại: ");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
