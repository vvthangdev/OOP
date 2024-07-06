package Bai7.Bai701;

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
        System.out.println("Nhap phu cap: ");
        double phuCap = sc.nextDouble();
        System.out.println("Nhap so nham duong chuc: ");
        double soNamDuongChuc = sc.nextDouble();
        System.out.println("Nhap he so luong: ");
        double heSoLuong = sc.nextDouble();
        sc.nextLine();
        TruongPhong tp = new TruongPhong("Vu Van Thang", heSoLuong, phuCap, soNamDuongChuc);
        tp.inTTin();
        System.out.println("He so luong truong phong: " + tp.getHeSoLuong());

        sc.close();
    }
}