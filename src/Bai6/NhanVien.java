package Bai6;

public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    public static final double LUONG_MAX = 20000000;
    public static final double LUONG_CO_BAN = 750000;

    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    //Getter va Setter
    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    //Cac phuong thuc:
    public double tinhLuong(){
        return this.LUONG_CO_BAN * this.heSoLuong;
    }

    public void inTTin(){
        System.out.println("Ten nhan vien: " + tenNhanVien);
        System.out.println("He so luong: " + heSoLuong);
        System.out.println("Luong: " + tinhLuong());
    }

    public boolean tangLuong(double heSo){
        double luongMoi = LUONG_CO_BAN * (heSoLuong + heSo);
        if (luongMoi > LUONG_MAX) {
            System.out.println("Khong the tang!");
            return false;
        }
        else {
            heSoLuong = heSoLuong + heSo;
            System.out.println("Duoc phep tang luong");
            return true;
        }
    }
}
