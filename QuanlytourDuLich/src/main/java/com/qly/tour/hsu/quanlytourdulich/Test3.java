package com.qly.tour.hsu.quanlytourdulich;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanlyDiadiem q3 = new QuanlyDiadiem();
        do {
            System.out.format("1. Them dia diem\n");
            System.out.format("2. Cap nhat thong tin dia diem\n");
            System.out.format("3. Xoa dia diem\n");
            System.out.format("4. Hien thi danh sach dia diem\n");
            System.out.format("5. Tim kiem khu vuc\n");
            System.out.format("6. Sap xep khu vuc theo ten\n");
            System.out.format("7. Thoat\n");
            System.out.format("Chon chuc nang: ");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1 -> q3.themDiadiem();
                case 2 -> q3.capNhatDiadiem();
                case 3 -> q3.xoaDiadiem();
                case 4 -> q3.inDiadiem();
                case 5 -> q3.timKiemDiaDiem();
                case 6 -> q3.sapXepDiaDiemTheoTen();
                case 7 -> System.out.format("Thoat chuong trinh");
                default -> System.out.format("Sai cu phap");
            }
        } while (chucNang != 7);
    }
}
