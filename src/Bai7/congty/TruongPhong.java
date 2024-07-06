package Bai7.congty;

public class TruongPhong extends NhanVien {
    private double phuCap;
    private double soNamDuongChuc;

    public TruongPhong(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double soNamDuongChuc){
        super(tenNhanVien, luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.soNamDuongChuc = soNamDuongChuc;
    }

    @Override
    public double tinhLuong(){
        return getHeSoLuong() * getLuongCoBan()+ phuCap;
    }

    @Override
    public void inTTin(){
        System.out.println("Ten truong phong: " + getTenNhanVien());
        System.out.println("Phu cap: "+ phuCap);
        System.out.println("So nam duong chuc: " + soNamDuongChuc);
    }
}
