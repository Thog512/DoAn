package khodienthoai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            Menu mn=new Menu();
        int n;
        
        do{
            mn.MainMenu();
            System.out.println("Chon chuc nang:");
            n=scan.nextInt();
            switch(n){
                case 0:System.out.println("Xin tam biet va hen gap lai");break;
                case 1:{
                    mn.xuatSmartPhone();break;
                }
                case 2:{
                    mn.xuatMobilePhone();break;
                }
                case 3:{
                    mn.xuatNhapKho();break;
                }
                case 4:{
                    mn.xuatXuatKho();break;
                }
                case 5:{
                    mn.capNhat();break;
                }
                default:System.out.println("So khong hop le! vui long nhap lai");break;
            }
        }while(n!=0);
        
    }
    
}
