/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qly.tour.hsu.quanlytourdulich;

/**
 *
 * @author Admin
 */
public class QuocGia {
    private String quocGia;
    private int maQuocgia;
    private String thongTinQuocgia;

    public QuocGia() {
        
    }

    public QuocGia(String quocGia, int maQuocgia, String thongTinQuocgia) {
        this.quocGia = quocGia;
        this.maQuocgia = maQuocgia;
        this.thongTinQuocgia = thongTinQuocgia;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public int getMaQuocgia() {
        return maQuocgia;
    }

    public void setMaQuocgia(int maQuocgia) {
        this.maQuocgia = maQuocgia;
    }

    public String getThongTinQuocgia() {
        return thongTinQuocgia;
    }

    public void setThongTinQuocgia(String thongTinQuocgia) {
        this.thongTinQuocgia = thongTinQuocgia;
    }
    @Override 
    public String toString () {
        String S = String.format("%-20d%-20s%-20s\n",maQuocgia,quocGia,thongTinQuocgia);
        return S;
    }

}
