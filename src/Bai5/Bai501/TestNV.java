package Bai5.Bai501;

import java.util.Scanner;

public class TestNV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new NhanVien("Vu Van Thang", 1000, 1.1);
        NhanVien nv2 = new NhanVien("Cao Le Quyen", 500, 1.1);
        nv1.inTTin();
        nv2.inTTin();
        System.out.println("Luong nv1: " + nv1.tinhLuong());
        System.out.println("Luong nv2: " + nv2.tinhLuong());

        System.out.println("Tang he so luong nv1: ");
        double heSo = sc.nextDouble();
        if(nv1.tangLuong(heSo)){
            System.out.println("Tang luong thanh cong!");
        }
        else{
            System.out.println("Tang luong that bai!");
        }
        System.out.println("Tang he so luong nv2: ");
        heSo = sc.nextDouble();
        if(nv2.tangLuong(heSo)){
            System.out.println("Tang luong thanh cong!");
        }
        else{
            System.out.println("Tang luong that bai!");
        }
        nv1.inTTin();
        nv2.inTTin();
    }
}
