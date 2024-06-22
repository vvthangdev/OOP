package Bai3.Bai303;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //NhanVien nv = new NhanVien("Vu Van Thang", 1000, 3);
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong tin NV: ");
        String tenNhanVien = sc.nextLine();
        double luongCoBan = sc.nextDouble();
        double heSoLuong = sc.nextDouble();

        NhanVien nv = new NhanVien(tenNhanVien, luongCoBan, heSoLuong);
        nv.inTTin();
        while (true){
            System.out.println("Tang he so luong them x =  ");
            double heSo = sc.nextDouble();
            if (heSo == 0) break;
            if (nv.tangLuong(heSo)){
                System.out.println("Tang luong thanh cong");
            }
            else {
                System.out.println("Tang luong that bai");
            }
            nv.inTTin();
        }
        sc.close();

    }
}
