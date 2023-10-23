package enity;

public class HinhTron extends HinhHoc{
    private double r;

    public HinhTron(double r) {
        super();
        this.r = r;
    }

    @Override
    public double tinhChuVi() {
        return Math.PI * 2 * r;
    }

    @Override
    public double tinhDienTich() {
        return r * r * Math.PI;
    }

}
