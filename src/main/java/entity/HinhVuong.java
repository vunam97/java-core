package entity;

public class HinhVuong extends HinhChuNhat{

    public HinhVuong(float a) {
        super(a, a);
    }

    @Override
    public double TinhChuVi() {
        System.out.println("Tính chu vi hình vuông: ");
        return super.TinhChuVi();
    }

    public double TinhDienTich(){
        System.out.println("Tính diện tích hình vuông: ");
        return super.TinhDienTich();
    }
}
