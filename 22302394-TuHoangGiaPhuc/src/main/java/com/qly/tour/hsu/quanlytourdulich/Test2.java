package com.qly.tour.hsu.quanlytourdulich;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanlyKhuVuc q2 = new QuanlyKhuVuc();
        do {

            System.out.format("1. Them khu vuc\n");
            System.out.format("2. Cap nhat khu vuc\n");
            System.out.format("3. Xoa khu vuc\n");
            System.out.format("4. Hien thi khu vuc\n");
            System.out.format("5. Tim kiem khu vuc\n");
            System.out.format("6. Sap xep khu vuc theo ten\n");
            System.out.format("7. Thoat\n");
            System.out.format("Chon chuc nang: ");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1 -> q2.themKhuVuc();
                case 2 -> q2.capNhatKhuVuc();
                case 3 -> q2.xoaKhuvuc();
                case 4 -> q2.inKhuvuc();
                case 5 -> q2.timKiemKhuVuc();
                case 6 -> q2.sapXepKhuVucTheoTen();
                case 7 -> System.out.format("Thoat chuong trinh");
                default -> System.out.format("Sai cu phap");
            }
        } while (chucNang != 8);
    }
}
