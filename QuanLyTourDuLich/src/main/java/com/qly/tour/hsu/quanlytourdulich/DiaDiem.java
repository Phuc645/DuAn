/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qly.tour.hsu.quanlytourdulich;

/**
 *
 * @author Admin
 */
public class DiaDiem {
    private String tenDiadiem;
    private String moCua;
    private String dongCua;
    private int giaVe;
    private int maDiadiem;
    private String thongTinDiaDiem;

    public DiaDiem() {

    }

    public DiaDiem(String tenDiadiem, String moCua, String dongCua, int giaVe, int maDiadiem,
            String thongTinDiaDiem) {
        this.tenDiadiem = tenDiadiem;
        this.moCua = moCua;
        this.dongCua = dongCua;
        this.giaVe = giaVe;
        this.maDiadiem = maDiadiem;
        this.thongTinDiaDiem = thongTinDiaDiem;
    }

    public String getTenDiadiem() {
        return tenDiadiem;
    }

    public void setTenDiadiem(String tenDiadiem) {
        this.tenDiadiem = tenDiadiem;
    }

    public String getMoCua() {
        return moCua;
    }

    public void setMoCua(String moCua) {
        this.moCua = moCua;
    }

    public String getDongCua() {
        return dongCua;
    }

    public void setDongCua(String dongCua) {
        this.dongCua = dongCua;
    }

    public int getGiaVe() {
        return giaVe;
    }

    public void setGiaVe(int giaVe) {
        this.giaVe = giaVe;
    }

    public String getThongTinDiaDiem() {
        return thongTinDiaDiem;
    }

    public void setThongTinDiaDiem(String thongTinDiaDiem) {
        this.thongTinDiaDiem = thongTinDiaDiem;
    }

    public int getMaDiadiem() {
        return maDiadiem;
    }

    public void setMaDiadiem(int maDiadiem) {
        this.maDiadiem = maDiadiem;
    }
    @Override
    public String toString() {
        String S = String.format("%-20d%-20s%-20s%-20s%-20d%-20s\n",maDiadiem,tenDiadiem,moCua,dongCua,giaVe,thongTinDiaDiem);
        return S;
    }

}
