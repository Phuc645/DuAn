package com.qly.tour.hsu.quanlytourdulich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanlyKhuVuc {

    private ArrayList<KhuVuc> dsKhuVuc = new ArrayList<KhuVuc>();

    public void themKhuVuc() {
        KhuVuc kv = new KhuVuc();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Nhap ma khu vuc: ");
        kv.setMaKhuvuc(sc.nextInt());
        System.out.format("Nhap ten khu vuc: ");
        kv.setTenkhuvuc(sc0.nextLine());
        System.out.format("Nhap thong tin khu vuc: ");
        kv.setThongTinKhuvuc(sc0.nextLine());
        dsKhuVuc.add(kv);
        System.out.format("Them khu vuc thanh cong");
        inKhuvuc();
    }

    public void capNhatKhuVuc() {
        boolean c = false;
        KhuVuc kv = new KhuVuc();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        kv.setMaKhuvuc(sc.nextInt());
        for (KhuVuc khuvuc : dsKhuVuc) {
            if (khuvuc.getMaKhuvuc() == kv.getMaKhuvuc()) {
                kv = khuvuc;
                c = true;
                break;
            }
        }
        if (c == true) {
            System.out.format("Nhap ten can sua: ");
            String ten = sc.next();
            kv.setTenkhuvuc(ten);
            System.out.format("Nhap thong tin can sua: ");
            String thongtin = sc.next();
            kv.setThongTinKhuvuc(thongtin);
            System.out.format("Cap nhat thanh cong");
            inKhuvuc();
        } else {
            System.out.format("Khu vuc khong ton tai");
        }

    }

    public void xoaKhuvuc() {
        boolean c = false;
        KhuVuc kv = new KhuVuc();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma so can tim: ");
        kv.setMaKhuvuc(sc.nextInt());
        for (KhuVuc khuvuc : dsKhuVuc) {
            if (khuvuc.getMaKhuvuc() == kv.getMaKhuvuc()) {
                kv = khuvuc;
                c = true;
                break;
            }
        }
        if (c == true) {
            dsKhuVuc.remove(kv);
            System.out.format("Xoa thanh cong");
            inKhuvuc();
        } else {
            System.out.format("Khu vuc khong ton tai");
        }
        
    }
    
    public void timKiemKhuVuc() {
        boolean c = false;
        KhuVuc kv = new KhuVuc();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        kv.setMaKhuvuc(sc.nextInt());
        for (KhuVuc khuvuc : dsKhuVuc) {
            if (khuvuc.getMaKhuvuc() == kv.getMaKhuvuc()) {
                kv = khuvuc;
                c = true;
                break;
            }
        }
        if (c == true) {
            System.out.format(kv.toString());
        } else {
            System.out.format("Khu vuc khong ton tai");
        }
    }

    public void sapXepKhuVucTheoTen() {
        Comparator<KhuVuc> sortNames = new Comparator<KhuVuc>() {
            @Override
            public int compare(KhuVuc k1, KhuVuc k2) {
                if (k1.getTenkhuvuc().compareTo(k2.getTenkhuvuc()) > 0) {
                    return 1;
                } else if ((k1.getTenkhuvuc().compareTo(k2.getTenkhuvuc()) == 0)) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsKhuVuc, sortNames);
        inKhuvuc();
    }


    public void inKhuvuc() {
        System.out.format("%-20s%-20s%-20s\n", "Khu Vuc", "Ma Khu Vuc", "Thong Tin");
        for (KhuVuc kv : dsKhuVuc) {
            System.out.format(kv.toString());
        }

    }

}
