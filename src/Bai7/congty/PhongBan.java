package Bai7.congty;

import java.util.Stack;

public class PhongBan {
    private  String tenPhongBan;
    private byte soNhanVien;
    public static final byte SO_NV_MAX = 100;
    private Stack<NhanVien> danhSachNhanVien;

    public PhongBan(String tenPhongBan, byte soNhanVien){
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = 0;
        this.danhSachNhanVien = new Stack<>();
    }

    public String getTenPhongBan() {
        return tenPhongBan;
    }

    public void setTenPhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    public boolean themNV(NhanVien nv){
        if (this.soNhanVien < SO_NV_MAX) {
            this.danhSachNhanVien.push(nv);
            this.soNhanVien++;
            return true;
        }
        return false;
    }

    public NhanVien xoaNV(){
        if (!this.danhSachNhanVien.empty()){
            this.soNhanVien--;
            return this.danhSachNhanVien.pop();
        }
        return null;
    }

    public double tongLuong(){
        double tongLuong = 0;
        for (NhanVien nv : this.danhSachNhanVien){
            tongLuong += nv.tinhLuong();
        }
        return tongLuong;
    }

    public void inTTin() {
        System.out.println("Ten phong ban: " + this.tenPhongBan);
        System.out.println("So nhan vien: " + this.soNhanVien);
        System.out.println("Danh sach nhan vien: ");
        for (NhanVien nv : danhSachNhanVien){
            nv.inTTin();
            System.out.println("------------------------");
        }
        System.out.println("Tong luong: " + tongLuong());
    }
}
