package Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten phong ban: ");
        String tenPhongBan = sc.nextLine();
        System.out.println("Nhap so nhan vien: ");
        byte soNhanVien = sc.nextByte();
        sc.nextLine();
        PhongBan pb = new PhongBan(tenPhongBan, soNhanVien);
        NhanVien nv1 = new NhanVien("Vu Van Thang", 2);
        NhanVien nv2 = new NhanVien("Cao Thi Le Quyen", 2);
        pb.setTenPhongBan(tenPhongBan);
        pb.themNV(nv1);
        pb.themNV(nv2);
        pb.inTTin();
        pb.xoaNV();
        pb.inTTin();
        sc.close();
    }
}