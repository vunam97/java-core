package backend;

import entity.HinhVuong;
import entity.Student;

public class Exercise02 {
    public void question02(){
        Student student = new Student();
        student.inputInfo();
        student.showInfo();
    }

    public void question03(){
        HinhVuong hinhVuong = new HinhVuong(10);
        System.out.println("Chu vi: " + hinhVuong.TinhChuVi());
        System.out.println("Diện tích: " + hinhVuong.TinhDienTich());
    }
}
