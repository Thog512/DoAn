package khodienthoai;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scan=new Scanner(System.in);
    
    ArrayList<MobilePhone> MobilePhone;
    ArrayList<SmartPhone> SmartPhone;
    ArrayList<NhapKho> NhapKho;
    ArrayList<XuatKho> XuatKho;
    public Menu() {
        MobilePhone= new ArrayList<>();
        SmartPhone=new ArrayList<>();
        NhapKho=new ArrayList<>();
        XuatKho=new ArrayList<>();
    }
    
    public void themMobilePhone(MobilePhone m){
        System.out.println("Nhap so luong them:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Lan nhap thu "+(i+1)+":");
                m.Nhap();
        }
        MobilePhone.add(m);
    }
    
    public void themSmartPhone(SmartPhone s){
        System.out.println("Nhap so luong them:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Lan nhap thu"+(i+1)+":");
                s.Nhap();
        }
        SmartPhone.add(s);
    }
    
    public void themNhapKho(NhapKho nk){
        System.out.println("Nhap so luong them:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Lan nhap thu"+(i+1)+":");
                nk.Nhap();
        }
        NhapKho.add(nk);
    }
    
    public void themXuatKho(XuatKho xk){
        System.out.println("Nhap so luong them:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Lan nhap thu"+(i+1)+":");
                xk.Nhap();
        }
        XuatKho.add(xk);
    }
    
    public void xuatMobilePhone(){
        System.out.println("---------------------------");
        for(MobilePhone x:MobilePhone){
            if(x instanceof MobilePhone){
                x.Xuat();
            }
        }
        System.out.println("\n---------------------------");
    }
    
    public void xuatSmartPhone(){
        System.out.println("---------------------------");
        for(SmartPhone x:SmartPhone){
            if(x instanceof SmartPhone){
                x.Xuat();
            }
        }
        System.out.println("\n---------------------------");
    }
     public void xuatXuatKho(){
        System.out.println("---------------------------");
        for(XuatKho x:XuatKho){
            if(x instanceof XuatKho){
                x.Xuat();
            }
        }
        System.out.println("\n---------------------------");
    }
      public void xuatNhapKho(){
        System.out.println("---------------------------");
        for(NhapKho x:NhapKho){
            if(x instanceof NhapKho){
                x.Xuat();
            }
        }
        System.out.println("\n---------------------------");
    }
      
      
    public void MainMenu(){
        System.out.println("---------------------------");
        System.out.println("0.Thoat chuong trinh");
        System.out.println("1.Xem thong tin SmartPhone");
        System.out.println("2.Xem thong tin MobilePhone");
        System.out.println("3.Xem thong tin nhap kho");
        System.out.println("4.Xem thong tin xuat kho");
        System.out.println("5.Chinh sua");
        System.out.println("----------------------------");
    }
      
    public void menuCapNhat(){
        System.out.println("---------------------------");
        System.out.println("0.Menu chinh");
        System.out.println("1.Them SmartPhone");
        System.out.println("2.Them MobilePhone");
        System.out.println("3.Them don nhap kho");
        System.out.println("4.Them don xuat kho");
        System.out.println("----------------------------");
    }
    
    public void capNhat(){
        int n;
        do {
            menuCapNhat();
            System.out.println("Chọn chuc nang:");
            n=scan.nextInt();
            switch(n){
                case 0:MainMenu();break;
                case 1:
                    SmartPhone sm=new SmartPhone();
                    themSmartPhone(sm);
                    break;
                case 2:{
                    MobilePhone mb=new MobilePhone();
                    themMobilePhone(mb);break;
                }     
                case 3:
                    NhapKho nk=new NhapKho();
                    themNhapKho(nk);break;
                case 4:{
                    XuatKho xk=new XuatKho();
                    themXuatKho(xk);break;
                }
                
                default:
                    System.out.println("So khong hop le! Vui long nhap lai");
            }
        }while(n<0||n>8);
    }
}
