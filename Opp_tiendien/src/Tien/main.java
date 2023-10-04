package Tien;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void menu() {
		System.out.println("=====MENU=====");
		System.out.println("0. thoat ");
		System.out.println("1. nhap");
		System.out.println("2. xuat");
		System.out.println("3. so tien phai tra");
		System.out.println("-----------------------");
	}
	public static void main(String[] args) {
		ArrayList<KhachHang> list= new ArrayList<KhachHang>();
		Scanner sc= new Scanner(System.in);
		int soHo=0;
		int chon=0;
		
		while(true) {
			menu();
			System.out.print ("chon menu so:");
			chon=sc.nextInt();
			System.out.println("--------------------");
			if(chon==0) break;
			switch (chon) {
			case 1: 
				System.out.print ("Nhap so ho muon nhap:");
				soHo=sc.nextInt();
				System.out.println("------------------");
				for(int i=0;i<soHo;i++) {
					BienLai x=new BienLai(null, chon, null, i, i, i);
					x.nhapBL();
					list.add(x);
				}
				break;
				
			case 2:
				for(int i=0;i<soHo;i++) {
					KhachHang x= list.get(i);
					if(x instanceof BienLai) {
						((BienLai)x).xuatBl();
					}
				}
				break;
				
			case 3:
				for(int i=0;i<soHo;i++) {
					System.out.print ("Chu ho:"+list.get(i).getTenChuHo()+",nha so:"+list.get(i).getSoNha()+"Phai tra so tien:"+list.get(i).soTienPhaiTra()+"\n ");
				}
				
			default:
				 System.out.println("sai du lieu , moi chon lai:");
			}
		}
	}

}
