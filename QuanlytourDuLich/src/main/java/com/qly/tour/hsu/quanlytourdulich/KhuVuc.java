/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qly.tour.hsu.quanlytourdulich;

/**
 *
 * @author Admin
 */
public class KhuVuc {
    private String tenKhuvuc;
    private int maKhuvuc;
    private String thongTinKhuvuc;

    public KhuVuc() {
        
    }

    public KhuVuc(String tenKhuvuc, int maKhuvuc, String thongTinKhuvuc) {
        this.tenKhuvuc = tenKhuvuc;
        this.maKhuvuc = maKhuvuc;
        this.thongTinKhuvuc = thongTinKhuvuc;
    }

    public String getTenkhuvuc() {
        return tenKhuvuc;
    }

    public void setTenkhuvuc(String tenKhuvuc) {
        this.tenKhuvuc = tenKhuvuc;
    }

    public int getMaKhuvuc() {
        return maKhuvuc;
    }

    public void setMaKhuvuc(int maKhuvuc) {
        this.maKhuvuc = maKhuvuc;
    }

    public String getThongTinKhuvuc() {
        return thongTinKhuvuc;
    }

    public void setThongTinKhuvuc(String thongTinKhuvuc) {
        this.thongTinKhuvuc = thongTinKhuvuc;
    }
    @Override
    public String toString () {
        String S = String.format("%-20d%-20s%-20s\n",maKhuvuc,tenKhuvuc,thongTinKhuvuc);
        return S;
    }
}
