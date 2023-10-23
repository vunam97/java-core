package entity;

public class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double TinhChuVi() {
        System.out.println("Tính chu vi hình chữ nhật");
        return (chieuDai + chieuRong) * 2;
    }

    public double TinhDienTich() {
        System.out.println("Tính diện tích hình chữ nhật");
        return chieuDai * chieuRong;
    }
}
