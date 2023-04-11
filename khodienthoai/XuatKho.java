
package khodienthoai;


public class XuatKho extends DienThoai {
    public String NgayXuat;
    public String maXuat;

    public XuatKho() {
    }
    
    public XuatKho(String loaiDT, String HeDieuHanh, String maDT, String tenDT, double DonGia, int SoLuong, String NgayXuat, String maXuat){
        super(HeDieuHanh, maDT, tenDT, DonGia, SoLuong);
        this.NgayXuat = NgayXuat;
        this.maXuat = maXuat;
    } 

    public String getNgayXuat() {
        return NgayXuat;
    }

    public void setNgayXuat(String NgayXuat) {
        this.NgayXuat = NgayXuat;
    }


    public String getMaXuat() {
        return maXuat;
    }

    public void setMaXuat(String maXuat) {
        this.maXuat = maXuat;
    }
    
    @Override
    public void Nhap(){
        System.out.printf("Nhap he dieu hanh:  ");
        HeDieuHanh = scan.nextLine();
        System.out.printf("\nNhap ma dien thoai: ");
        maDT = scan.nextLine();
        System.out.printf("\nNhap ten dien thoai: ");
        tenDT = scan.nextLine();
        System.out.printf("\nNhap don gia: ");
        DonGia = scan.nextDouble();
        System.out.printf("\nNhap so luong: ");
        SoLuong = scan.nextInt();
        System.out.printf("\nNhap ngay xuat: ");
        NgayXuat = scan.nextLine();
        System.out.printf("\nNhap ma xuat: ");
        maXuat = scan.nextLine();       
    }
    
    @Override
    public void Xuat(){
        System.out.print("\nHe dieu hanh la: " +getHeDieuHanh());
        System.out.print("\nMa dien thoai la: " +getmaDT());
        System.out.print("\nTen dien thoai la: " +gettenDT());
        System.out.print("\nDon gia la:  " +getDonGia());
        System.out.print("\nSo luong la: " +getSoLuong());
        System.out.print("\nNgay xuat: " +getNgayXuat());
        System.out.print("\nMa xuat: " +getMaXuat());
    }
}
