package Bai7.congty;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 20000000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    //Getter va Setter
    public String getTenNhanVien() {
        return this.tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return this.luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return this.heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return this.luongCoBan * this.heSoLuong;
    }

    public void inTTin() {
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }

    public boolean tangHeSoLuong(double heSo) {
        double luongMoi = luongCoBan * (heSoLuong + heSo);
        if (luongMoi > LUONG_MAX) {
            System.out.println("Khong the tang!");
            return false;
        } else {
            heSoLuong = heSoLuong + heSo;
            System.out.println("Duoc phep tang luong");
            return true;
        }
    }
}
