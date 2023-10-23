package entity;

import util.ScannerUltil;

public class Position {
    public int id;
    public String name;

    public Position() {
        System.out.println("Mời bạn nhập vào thông tin position: ");
        System.out.println("Nhập vào id: ");
        this.id = ScannerUltil.inputId("Mời nhập lại: ");
        System.out.println("Nhập vào tên position: ");
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
        return "Position{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
