package LUONG;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void menu() {
		System.out.println("------MENU--------");
		System.out.println("1. nhap");
		System.out.println("2. xuat");
		System.out.println("3. tong luong");
		System.out.println("4. sap xep");
	}
	public static void menuN() {
		System.out.println("1. Giang Vien");
		System.out.println("2. Nhan Vien");
	}
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<CanBo>list= new ArrayList<CanBo>();
		int soCB=0;
		int chon=0;
		int chonN=0;
		
		while(true) {
			menu();
			System.out.println(" chon menu so:");
			chon=sc.nextInt();
			System.out.println("-----------------");
			if(chon==0) break;
			switch (chon) {
			case 1: 
				menuN();
				System.out.println("chon 1 or 2:");
				chonN=sc.nextInt();
				System.out.println(" nhap so nguoi muon nhap:");
				soCB=sc.nextInt();
				System.out.println("------------------------");
				if(chonN==1) {
					for(int i=0;i<soCB;i++) {
						GiangVien GV= new GiangVien(null, chon, chonN, null, null, i);
						GV.nhap();
						list.add(GV);
					}
				}else if(chonN==2) {
					for(int i=0; i<soCB;i++) {
						NhanVien NV=new NhanVien(null, chon, chonN, null, null, i);
						NV.nhap();
						list.add(NV);
					}
				}else {
					System.out.println("sai du lieu!");
				}
				break;
				
			case 2:
				menuN();
				System.out.println("chon nghe:");
				chonN=sc.nextInt();
				System.out.println("-------------------");
				String khoa;
				if(chonN==1) {
					System.out.println(" chon khoa:");
					khoa=sc.next();
					System.out.println("---------------------");
					for(int i=0;i<soCB;i++) {
						CanBo x= list.get(i);
						if(x instanceof GiangVien) {
							if(((GiangVien)x).khoa.equals(khoa)) {
								((GiangVien)x).xuat();
							}
						}
					}
				}else if(chonN==2) {
					System.out.println("chon phong ban:");
					String phongBan=sc.next(); 
					System.out.println("-------------------");
					for(int i=0;i<soCB;i++) {
						CanBo x= list.get(i);
						if(x instanceof NhanVien) {
							if(((NhanVien)x).phongBan.equals(phongBan)) {
								((NhanVien)x).xuat();
							}
						}
					}
				}else {
					System.out.println("sai du lieu");
				}
				break;
				
			
			default:
				System.out.println(" sai du lieu chon lai:");
			}
		}
	}

}
