package keThuaVaDaHinh;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
	static void menu() {
		System.out.println("===MENU===");
		System.out.println("1. nhap:");
		System.out.println("2. xuat");
		System.out.println("3. tong luong");
		System.out.println("4. sap xep theo luong(ten)");
		System.out.println("------------------");
	}
	  static void menuNghanh() {
		  System.out.println("1. giang vien");
		  System.out.println("2. nhan vien");
	  }
	  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<CanBo> list = new ArrayList<CanBo>();
		int chonNganh=0;
		int soCB  =0;
		 
		
		while (true) {
			menu();
			System.out.print("chon menu so:");
			int chon=sc.nextInt();
			System.out.println("------------------");
			switch (chon) {
			case 1:
				menuNghanh();
				System.out.print("chon menu nganh so:");
				chonNganh =sc.nextInt();
				System.out.print("so nguoi muon nhap la:");
			    soCB=sc.nextInt();
			      
				System.out.println("------------------");
				if(chonNganh==1) {
					for(int i=0;i<soCB;i++) {
						GiangVien gv= new GiangVien(null, soCB, chon, null, null, i);
 						gv.nhap();
						list.add(gv);
					}
				}else if(chonNganh==2){
					for(int i=0;i<soCB;i++) {
						NhanVien  nv= new NhanVien(null, soCB, chon, null, null, i);
 						nv.nhap();
						list.add(nv);
					}
				}else {
					System.out.println("sai du lieu!");
				}
				break;
				
			case 2:
				menuNghanh();
				System.out.print("chon menu  :");
				int chonXuat=sc.nextInt();
				sc.nextLine();
				System.out.println("------------------");
				if(chonXuat==1) {
					System.out.print ("chon khoa:");
						String khoa=sc.nextLine();
						System.out.println("------------------");
					for(int i=0;i<soCB;i++) {
					  CanBo x= list.get(i);
					  if(x instanceof GiangVien) {
						  if(((GiangVien)x).getKhoa().equals(khoa)) {
						  ((GiangVien) x).xuatGV();
					  }
					}
				} 
			}else if (chonXuat ==2){
				   System.out.print("chon phong ban:");
				   String phongBan=sc.nextLine();
				   System.out.println("------------------");
				for(int i=0;i<soCB;i++) {
					CanBo x= list.get(i);
					if(x instanceof NhanVien) {
						if(((NhanVien) x).getPhongBan().equals(phongBan)) {
							 ((NhanVien)x).xuat ();
						}
					}
				}
			}else  { 
				System.out.println("sai du lieu!");
			}
				break;
				
			case 3:
				 int sum=0;
				 for(int i=0;i<soCB;i++) {
					 CanBo x= list.get(i);
					 if(x instanceof GiangVien) {
						 sum+=((GiangVien)x).tinhLuong();
					 }else if(x instanceof NhanVien) {
						 sum+=((NhanVien)x).tinhLuong();
					 }
				 }
				 System.out.println("tong luong phai tra cho CB:"+sum +".000 VND");
				 
				 break;
				 
			case 4:
				double max=0;
				int viTri=0;
				for(int i=0;i<soCB;i++) {
					CanBo x= list.get(i);
					double luong=0;
					if(luong>max) {
						max=luong;
						viTri=i;
					}
				}
				CanBo x=list.get(viTri);
				if (x instanceof GiangVien) {
					System.out.println("SV: " + ((GiangVien) x).getTen() + " co luong cao nhat la: " + ((GiangVien) x).tinhLuong());
				} else if (x instanceof NhanVien) {
					System.out.println("SV: " + ((NhanVien) x).getTen() + "   co luong cao nhat la: " + ((NhanVien) x).tinhLuong());
				}
	        	break;
				
			default:
				System.out.println("sai du lieu!");
 			}
			
		}
	}
	

}
