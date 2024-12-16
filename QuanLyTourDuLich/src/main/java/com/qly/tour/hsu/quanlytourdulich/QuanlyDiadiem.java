package com.qly.tour.hsu.quanlytourdulich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanlyDiadiem {
    private ArrayList<DiaDiem> dsDiaDiem = new ArrayList<DiaDiem>();

    public void themDiadiem() {
        DiaDiem dd = new DiaDiem();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Nhap ma dia diem: ");
        dd.setMaDiadiem(sc0.nextInt());
        System.out.format("Nhap ten dia diem: ");
        dd.setTenDiadiem(sc.nextLine());
        System.out.format("Nhap thoi gian mo cua: ");
        dd.setMoCua(sc.nextLine());
        System.out.format("Nhap thoi gian dong cua: ");
        dd.setDongCua(sc.nextLine());
        System.out.format("Nhap gia ve: ");
        dd.setGiaVe(sc0.nextInt());
        System.out.format("Nhap thong tin dia diem: ");
        dd.setThongTinDiaDiem(sc.nextLine());
        dsDiaDiem.add(dd);
        System.out.format("Them dia diem thanh cong");
        inDiadiem();
    }

    public void xoaDiadiem() {
        boolean c = false;
        DiaDiem dd = new DiaDiem();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma so can tim: ");
        dd.setMaDiadiem(sc.nextInt());
        for (DiaDiem diadiem : dsDiaDiem) {
            if (diadiem.getMaDiadiem() == dd.getMaDiadiem()) {
                dd = diadiem;
                c = true;
                break;
            }
        }
        if (c == true) {
            dsDiaDiem.remove(dd);
            System.out.format("Xoa thanh cong");
            inDiadiem();
        } else {
            System.out.format("Khu vuc khong ton tai");
        }
    }

    public void capNhatDiadiem() {
        boolean c = false;
        DiaDiem dd = new DiaDiem();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        dd.setMaDiadiem(sc0.nextInt());
        for (DiaDiem diadiem : dsDiaDiem) {
            if (diadiem.getMaDiadiem() == dd.getMaDiadiem()) {
                dd = diadiem;
                c = true;
                break;
            }
        }
        if (c == true) {
            System.out.format("Nhap ten can sua: ");
            String ten = sc.next();
            dd.setTenDiadiem(ten);
            System.out.format("Nhap thong tin can sua: ");
            String thongtin = sc.next();
            dd.setThongTinDiaDiem(thongtin);
            System.out.format("Nhap thoi gian mo cua: ");
            String mocua = sc.next();
            dd.setMoCua(mocua);
            System.out.format("Nhap thoi gian dong cua: ");
            String dongcua = sc.next();
            dd.setDongCua(dongcua);
            System.out.format("Nhap gia ve: ");
            int giave = sc0.nextInt();
            dd.setGiaVe(giave);
            System.out.format("Cap nhat thanh cong");
            inDiadiem();
        } else {
            System.out.format("Dia diem khong ton tai");
        }
    }
    
    public void timKiemDiaDiem() {
        boolean c = false;
        DiaDiem dd = new DiaDiem();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        dd.setMaDiadiem(sc.nextInt());
        for (DiaDiem diadiem : dsDiaDiem) {
            if (diadiem.getMaDiadiem() == dd.getMaDiadiem()) {
                dd = diadiem;
                c = true;
                break;
            }
        }
        if (c == true) {
            System.out.format(dd.toString());
        } else {
            System.out.format("Dia diem khong ton tai");
        }
    }

    public void sapXepDiaDiemTheoTen() {
        Comparator<DiaDiem> sortNames = new Comparator<DiaDiem>() {
            @Override
            public int compare(DiaDiem d1, DiaDiem d2) {
                if (d1.getTenDiadiem().compareTo(d2.getTenDiadiem()) > 0) {
                    return 1;
                } else if ( d1.getTenDiadiem().compareTo(d2.getTenDiadiem()) == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsDiaDiem, sortNames);
        inDiadiem();
    }


    public void inDiadiem() {

        System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s\n", "Ma dia diem", "Dia diem", "Mo Cua", "Dong Cua", "Gia Ve",
                "Thong Tin");
        for (DiaDiem dd : dsDiaDiem) {
            System.out.format(dd.toString());
        }

    }

}
