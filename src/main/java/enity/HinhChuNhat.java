package enity;

public class HinhChuNhat extends HinhHoc{
    private double canhA;
    private double canhB;

    public HinhChuNhat(int canhA, int canhB) {
        super();
        this.canhA = canhA;
        this.canhB = canhB;
    }

    @Override
    public double tinhChuVi() {
        return (canhA + canhB) * 2;
    }

    @Override
    public double tinhDienTich() {
        return canhA * canhB;
    }
}
