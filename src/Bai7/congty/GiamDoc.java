package Bai7.congty;

import Bai7.quanly.QuanLy;

public class GiamDoc extends NhanVien implements QuanLy {
    private double phuCap;
    public double loiNhuanCongTy;

    public GiamDoc(String tenNhanVien, double luongCoBan, double heSoLuong, double phuCap, double loiNhuanCongTy) {
        super(tenNhanVien,luongCoBan, heSoLuong);
        this.phuCap = phuCap;
        this.loiNhuanCongTy = loiNhuanCongTy;
    }

    @Override
    public double tinhHoaHong(){
        return 0.05 * this.loiNhuanCongTy;
    }

    @Override
    public double tinhLuong(){
        return tinhHoaHong() + phuCap + getHeSoLuong() * getLuongCoBan();
    }

    @Override
    public void inTTin() {
        super.inTTin();
        System.out.println("Phụ cấp: " + phuCap);
        System.out.println("Lợi nhuận công ty: " + loiNhuanCongTy);
        System.out.println("Hoa hồng: " + tinhHoaHong());
        System.out.println("Lương giám đốc: " + tinhLuong());
    }

}
