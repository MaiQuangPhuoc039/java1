package tienDien;

import java.util.ArrayList;
import java.util.Scanner;

import Tien.BienLai;
import Tien.main;

public  class run {
	
	public static void menu() {
		System.out.println("-----MENU-----");
		System.out.println("1. Nhap ");
		System.out.println("2. xuat");
		System.out.println("3. so tien phai tra");
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
		ArrayList<khachHang> list = new ArrayList<khachHang>();
		int soHo=0;
		int chon=0;
		
		while(true) {
			menu();
			System.out.println("chon menu so:");
			chon = sc.nextInt();
			System.out.println("----------------------");
			if(chon==0)    break;
			else if(chon==1) {
				System.out.println("Nhap so ho:");
				soHo= sc.nextInt();
				for(int i=0; i<soHo; i++) {
				 bienLai bl = new bienLai(null, chon, null, i, i, i);
				 bl.nhap();
				 list.add(bl);
				}
			}else if(chon==2) {
				for(int i=0; i< soHo; i++) {
					khachHang kh= list.get(i);
					if(kh instanceof bienLai) {
						((bienLai)kh).xuat();
					}
				}
			}else if(chon==3) {
				for(int i=0; i<soHo; i++) {
					System.out.println("Chu so :"+list.get(i).getTenChuHo()+",  nha so: "+list.get(i).getSoNha()+"  , so tien phai tra :"+list.get(i).soTienPhaiTra());
				}
			}else {
				System.out.println("Sai du lieu nhap  lai");
			}
		}
	}

}
