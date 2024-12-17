package com.qly.tour.hsu.quanlytourdulich;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanlyQuocGia {

    private ArrayList<QuocGia> dsQuocGia = new ArrayList<QuocGia>();

    public void themQuocgia() {
        QuocGia qg = new QuocGia();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Nhap ten quoc gia: ");
        qg.setQuocGia(sc0.nextLine());
        System.out.format("Nhap ma quoc gia: ");
        qg.setMaQuocgia(sc.nextInt());
        System.out.format("Nhap thong tin quoc gia:");
        qg.setThongTinQuocgia(sc0.nextLine());
        dsQuocGia.add(qg);
        System.out.format("Da them thanh cong\n");
        inQuocgia();
    }

    public void capNhatQuocgia() {
        boolean c = false;
        QuocGia qg = new QuocGia();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        qg.setMaQuocgia(sc.nextInt());
        for (QuocGia quocgia : dsQuocGia) {
            if (quocgia.getMaQuocgia() == qg.getMaQuocgia()) {
                qg = quocgia;
                c = true;
                break;
            }
        }
        if (c == true) {
            System.out.format("Nhap ten can sua: ");
            String ten = sc.next();
            qg.setQuocGia(ten);
            System.out.format("Nhap thong tin can sua: ");
            String thongtin = sc.next();
            qg.setThongTinQuocgia(thongtin);
            System.out.format("Cap nhat thanh cong\n");
            inQuocgia();
        } else {
            System.out.format("Quoc gia khong ton tai");
        }
    }

    public void xoaQuocgia() {
        boolean c = false;
        QuocGia qg = new QuocGia();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        qg.setMaQuocgia(sc.nextInt());
        for (QuocGia quocgia : dsQuocGia) {
            if (quocgia.getMaQuocgia() == qg.getMaQuocgia()) {
                qg = quocgia;
                c = true;
                break;
            }
        }
        if (c == true) {
            dsQuocGia.remove(qg);
            System.out.format("Da xoa thanh cong\n");
            inQuocgia();
        } else {
            System.out.format("Quoc gia khong ton tai");
        }
        
    }

    public void timKiemQuocGia() {
        boolean c = false;
        QuocGia qg = new QuocGia();
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma can tim: ");
        qg.setMaQuocgia(sc.nextInt());
        for (QuocGia quocgia : dsQuocGia) {
            if (quocgia.getMaQuocgia() == qg.getMaQuocgia()) {
                qg = quocgia;
                c = true;
                break;
            }
        }
        if (c == true) {
            System.out.format(qg.toString());
        } else {
            System.out.format("Khong tim thay");
        }
    }

    public void sapXepQuocGiaTheoTen() {
        Comparator<QuocGia> sortNames = new Comparator<QuocGia>() {
            @Override
            public int compare(QuocGia q1, QuocGia q2) {
                if (q1.getQuocGia().compareTo(q2.getQuocGia()) > 0) {
                    return 1;
                } else if (q1.getQuocGia().compareTo(q2.getQuocGia()) == 0) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsQuocGia, sortNames);
        inQuocgia();
    }

    public void inQuocgia() {
        System.out.format("%-20s%-20s%-20s\n", "Quoc gia", "Ma quoc gia", "Thong Tin");
        for (QuocGia qg : dsQuocGia) {
            System.out.format(qg.toString());
        }
    }
}
