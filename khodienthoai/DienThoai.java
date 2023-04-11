
package khodienthoai;

import java.util.Scanner;

public class DienThoai {
    Scanner scan = new Scanner(System.in);
    String HeDieuHanh;
    String maDT;
    String tenDT;
    double DonGia;
    int SoLuong;

    public DienThoai() {
    }
    
    
    public DienThoai(String HeDieuHanh, String maDT, String tenDT, double DonGia, int SoLuong){
        this.HeDieuHanh = HeDieuHanh;
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.DonGia = DonGia;
        this.SoLuong = SoLuong;
    }

    public String getHeDieuHanh() {
        return HeDieuHanh;
    }

    public void setHeDieuHanh(String HeDieuHanh) {
        this.HeDieuHanh = HeDieuHanh;
    }

    public String getmaDT() {
        return maDT;
    }

    public void setmaDT(String maDT) {
        this.maDT = maDT;
    }

    public String gettenDT() {
        return tenDT;
    }

    public void settenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }
    
    
    public void Nhap(){
        
    }

    public void Xuat(){
        
    }

    }
