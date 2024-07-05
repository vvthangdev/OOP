package Bai6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Nhap exit de thoat");
            System.out.println("Nhap thong tin NV: ");
            String tenNhanVien = sc.nextLine();
            if(tenNhanVien.equalsIgnoreCase("exit")) {
                break;
            }
            System.out.println("Nhap luong co ban: ");
            double luongCoBan = sc.nextDouble();
            System.out.println("Nhap he so luong: ");
            double heSoLuong = sc.nextDouble();
            sc.nextLine();
            NhanVien nv = new NhanVien(tenNhanVien, luongCoBan, heSoLuong);
            nv.inTTin();

            while (true) {
                System.out.println("Tang he so luong them x =  ");
                double heSo = sc.nextDouble();
                sc.nextLine();
                if (heSo == 0) break;
                if (nv.tangLuong(heSo)) {
                    System.out.println("Tang luong thanh cong");
                } else {
                    System.out.println("Tang luong that bai");
                }
                nv.inTTin();
            }
            System.out.println("So luong nhan vien da duoc tao: " + NhanVien.getSoLuongNhanVien());
        }
        sc.close();
        // In ra số lượng nhân viên đã được tạo
        System.out.println("Tong so nhan vien da duoc tao: " + NhanVien.getSoLuongNhanVien());
        System.out.println("Tong so tien luong cua nhan vien la: " + NhanVien.getTongLuong());
    }
}
