package Bai7.congty;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVien nv1 = new NhanVien("Vu Van Thang1", 2000000, 3);
        NhanVien nv2 = new NhanVien("Cao Thi Le Quyen", 1000000, 2);

        GiamDoc gd = new GiamDoc("Vu Van Thang2", 5000000,2, 2000000, 100000000);

        gd.inTTin();
        nv1.inTTin();
        nv2.inTTin();
        sc.close();
    }
}