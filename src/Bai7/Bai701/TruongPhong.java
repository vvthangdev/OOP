package Bai7.Bai701;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double heSoLuong, double phuCap, double soNamDuongChuc){
        super(tenNhanVien, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong(){
        return heSoLuong * LUONG_CO_BAN + phuCap;
    }

    @Override
    public void inTTin(){
        System.out.println("Ten truong phong: " + tenNhanVien);
        System.out.println("Phu cap: "+ phuCap);
        System.out.println("So nam duong chuc: " + soNamDuongChuc);
    }
}
