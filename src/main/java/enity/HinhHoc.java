package enity;

public abstract class HinhHoc {
    public static int count;

    public HinhHoc() {
        if (count > Configs.SO_LUONG_HINH_TOI_DA){
            throw new HinhHocException("Số lượng hình tối đa là: " + Configs.SO_LUONG_HINH_TOI_DA);
        }
        count++;
    }

    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
}
