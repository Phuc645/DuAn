package com.qly.tour.hsu.quanlytourdulich;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int chucNang;
        Scanner sc = new Scanner(System.in);
        QuanlyQuocGia q1 = new QuanlyQuocGia();
        do {
            System.out.format("1. Them quoc gia\n");
            System.out.format("2. Cap nhat quoc gia\n");
            System.out.format("3. Xoa quoc gia\n");
            System.out.format("4. Hien thi quoc gia\n");
            System.out.format("5. Tim kiem quoc gia\n");
            System.out.format("6. Sap xep quoc gia theo ten\n");
            System.out.format("7. Thoat\n");
            System.out.format("Chon chuc nang: ");
            chucNang = sc.nextInt();
            switch (chucNang) {
                case 1 -> q1.themQuocgia();
                case 2 -> q1.capNhatQuocgia();
                case 3 -> q1.xoaQuocgia();
                case 4 -> q1.inQuocgia();
                case 5 -> q1.timKiemQuocGia();
                case 6 -> q1.sapXepQuocGiaTheoTen();
                case 7 -> System.out.format("Thoat chuong trinh");
                default -> System.out.format("Sai cu phap");
            }
        } while (chucNang != 7);
    }
}
