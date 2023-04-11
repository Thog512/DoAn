package khodienthoai;

public class SmartPhone extends DienThoai{    
    String CamUng;

    public SmartPhone(){   
    }
    
    public SmartPhone(String loaiDT, String HeDieuHanh, String maDT, String tenDT, double DonGia, int SoLuong, String CamUng) {
        super(HeDieuHanh, maDT, tenDT, DonGia, SoLuong);
        this.CamUng = CamUng;
    }

    public String getCamUng() {
        return CamUng;
    }

    public void setCamUng(String CamUng) {
        this.CamUng = CamUng;
    }
    
    @Override
    public void Nhap(){
        System.out.printf("Nhap he dieu hanh: ");
        HeDieuHanh = scan.nextLine();
        System.out.printf("\nNhap ma dien thoai: ");
        maDT = scan.nextLine();
        System.out.printf("\nNhap ten dien thoai: ");
        tenDT = scan.nextLine();
        System.out.printf("\nNhap don gia: ");
        DonGia = scan.nextDouble();
        System.out.printf("\nNhap so luong: ");
        SoLuong = scan.nextInt();
        
    }
    
    @Override
    public void Xuat(){
        System.out.print("\nHe dieu hanh la: " +getHeDieuHanh());
        System.out.print("\nMa dien thoai la: " +getmaDT());
        System.out.print("\nTen dien thoai la: " +gettenDT());
        System.out.print("\nDon gia la: " +getDonGia());
        System.out.print("\nSo luong la: " +getSoLuong());
        System.out.print("\nLoai dien thoai: Cam ung");
    }
}
