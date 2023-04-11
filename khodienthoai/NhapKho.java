
package khodienthoai;

public class NhapKho extends DienThoai{
    public String ngayNhap;
    public String maNhap;

    public NhapKho() {
    }
    
    public NhapKho(String loaiDT, String HeDieuHanh, String maDT, String tenDT, double DonGia, int SoLuong, String ngayNhap, String maNhap){
        super(HeDieuHanh, maDT, tenDT, DonGia, SoLuong);
        this.ngayNhap = ngayNhap;
        this.maNhap = maNhap;
    } 

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getMaNhap() {
        return maNhap;
    }

    public void setMaNhap(String maNhap) {
        this.maNhap = maNhap;
    }
    
    @Override
    public void Nhap(){
        System.out.printf("Nhap he dieu hanh:  ");
        HeDieuHanh = scan.nextLine();
        System.out.printf("\nNhap ma dien thoai:");
        maDT = scan.nextLine();
        System.out.printf("\nNhap ten dien thoai: ");
        tenDT = scan.nextLine();
        System.out.printf("\nNhap don gia: ");
        DonGia = scan.nextDouble();
        System.out.printf("\nNhap so luong: ");
        SoLuong = scan.nextInt();
        System.out.printf("\nNhap ngay nhap: ");
        ngayNhap = scan.nextLine();
        System.out.printf("\nNhap ma nhap: ");
        maNhap = scan.nextLine();       
    }
    
    @Override
    public void Xuat(){
        System.out.print("\nHe dieu hanh la: " +getHeDieuHanh());
        System.out.print("\nMa dien thoai la: " +getmaDT());
        System.out.print("\nTen dien thoai la:" +gettenDT());
        System.out.print("\nDon gia la:  " +getDonGia());
        System.out.print("\nSo luong la: " +getSoLuong());
        System.out.print("\nNgay nhap: " +getNgayNhap());
        System.out.print("\nMa nhap: " +getMaNhap());
    }
}    

