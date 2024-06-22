package Bai2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class rand01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua say so: ");
        int n = scanner.nextInt();

        int arr[];
        System.out.println("Ban muon nhap day so tu ban phim (1) hay tao ngau nhien(2) ?");
        int choice = scanner.nextInt();

        if(choice == 1){
            arr = new int[n];
            System.out.println("Nhap day so: ");
            for(int i = 0; i < n; i++){
                System.out.println("Nhap phan tu thu " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
        }
        else if(choice == 2) {
            arr = randomArr(n);
            System.out.println("Day so ngau nhien duoc tao la: " + Arrays.toString(arr));
        }
        else {
            System.out.println("Lua chon khong hop le");
            return;
        }

        Arrays.sort(arr);

        System.out.println("Day so sau khi sap xep: " + Arrays.toString(arr));
    }
    private static int[] randomArr(int n){
        int arr[] = new int[n];
        Random random = new Random();
        for(int i = 0; i < n; i++){
            arr[i] = random.nextInt(n);
        }
        return arr;
    }
}
