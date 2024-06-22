package Bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sinh vien: ");
        int N = sc.nextInt();
        sc.nextLine();
        Student cls[] = new Student[N];

        for (int i = 0; i < N; i++){
            System.out.println("Nhap hoc sinh thu " + (i+1) + ": ");
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Year: ");
            int year = sc.nextInt();
            sc.nextLine();
            cls[i] = new Student(name, year);
        }
        sc.close();

        int sum = 0;
        for (int i = 0; i < N; i++){
            System.out.println(cls[i].getName());
            sum += 2024 - cls[i].getYear();
        }
        System.out.println("Tong so tuoi: " + sum);
    }
}
