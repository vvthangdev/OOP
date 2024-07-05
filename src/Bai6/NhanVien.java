package Bai6;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 3000;
    private static int cnt = 0;
    private static double tongLuong = 0;

    //getter:

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        cnt++;// Tang so luong nhan vien them 1
        tongLuong += tinhLuong();
    }

    public static int getSoLuongNhanVien(){
        return cnt;
    }
    //Getter va Setter

    public String getTenNhanVien(){
        return tenNhanVien;
    }
    public void setTenNhanVien(String tenNhanVien){
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong){
        tongLuong -= tinhLuong();
        this.heSoLuong = heSoLuong;
        tongLuong += tinhLuong();
    }

    //===================
    //Cac phuong thuc:
    public double tinhLuong(){
        return this.luongCoBan * this.heSoLuong;
    }

    public void inTTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("Luong co ban: " + luongCoBan);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }

    public boolean tangLuong(double heSo){
        double luongMoi = luongCoBan * (heSoLuong + heSo);
        if (luongMoi > LUONG_MAX) {
            System.out.println("Khong the tang!");
            return false;
        }
        else {
            tongLuong -= tinhLuong();
            heSoLuong = heSoLuong + heSo;
            tongLuong += tinhLuong();
            System.out.println("Duoc phep tang luong");
            return true;
        }
    }

    public static double getTongLuong(){
        return tongLuong;
    }
}
