import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	public static void menu() {
		System.out.println("MENU");
		System.out.println("0. thoat menu");
		System.out.println("1. nhap");
		System.out.println("2. xuat");
		System.out.println("3. tong luong");
		System.out.println("4. xap sep");
		System.out.println("----------------");
	}
	public static void menuNghe() {
		System.out.println("1. Giang vien");
		System.out.println("2. Nhan vien");
	}
	 /**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 ArrayList<CanBo> list = new ArrayList<CanBo>();
		 int soCB=0;
		 int chonS;
		 int chonN=0;
		 while(true) {
			 menu();
			 System.out.println("chon menu so:");
			 chonS= sc.nextInt();
			 System.out.println("---------------");
			 if(chonS==0) break;
			 
			 switch (chonS) {
			case 1: 
				menuNghe();
				System.out.println("chon nganh:");
				chonN= sc.nextInt();
				System.out.println("nhap so nguoi muon nhap:");
				soCB=sc.nextInt();
				System.out.println("-----------------");
				if( chonN==1) {
					for(int i=0;i<soCB;i++) {
						GiangVien GV=new GiangVien(null, chonS, chonN, null, null, i);
						GV.nhap();
						list.add(GV);
					}
				}else if(chonN==2) {
					for(int i=0;i<soCB;i++) {
						 NhanVien NV=new NhanVien(null, chonS, chonN, null, null, i);
						NV.nhap();
						list.add(NV);
					}
				}else {
					System.out.println("sai du lieu!");
				}
				break;
			case 2:
				menuNghe();
				System.out.println("chon nghe so:");
				chonN=sc.nextInt();
				System.out.println("-----------------------");
				String khoa;
				String phongBan;
				if(chonN==1) {
					System.out.println("nhap khoa:");
					khoa = sc.next();
					for(int i=0;i<soCB;i++) {
						 CanBo x= list.get(i);
						 if(x instanceof GiangVien) {
							 if(((GiangVien)x).getKhoa().equals(khoa)){
								 ((GiangVien)x).xuat();
							 }
						 }
					}
				}else if(chonN==2) {
					System.out.println("nhap phong ban");
					 phongBan=sc.next();
					for(int i=0;i<soCB;i++) {
						CanBo x= list.get(i);
						if(x instanceof NhanVien) {
							if(((NhanVien)x).getPhongBan().equals(phongBan)) {
								((NhanVien)x).xuat();
							}
						}
						
					}
				}else {
					System.out.println("sai du lieu!");
				}
				break;
				
			case 3: 
				double sum1=0;
				double sum2=0;
				double sum ;
				for(int i=0;i<soCB;i++) {
					CanBo x= list.get(i);
					if(x instanceof GiangVien) {
						sum1+=((GiangVien)x).tingLuong();
											 System.out.println("GV:"+list.get(i).getTen()+", co muc luong la:"+list.get(i).tingLuong());

					}else if(x instanceof NhanVien) {
						sum2+=((NhanVien)x).tingLuong();
				 	System.out.println("NV:"+list.get(i).getTen()+", co muc luong la:"+list.get(i).tingLuong());
				}else {
					System.out.println("sai");
				}
				}
				sum=sum1+sum2;
				System.out.println("tong luong :"+sum);
				break;
				
				
			case 4:
				double max=0;
				int viTri=0;
				for(int i=0;i<soCB;i++) {
					CanBo x= list.get(i);
					double luong=0;
					if(luong>max) {
						luong=max;
						viTri=i;
					}
				}
				CanBo x= list.get(viTri);
				if(x instanceof GiangVien) {
					System.out.println("GV ten:"+((GiangVien)x).getTen() +"co luong cao nhat la:"+((GiangVien)x).tingLuong());
				}else if(x instanceof NhanVien) {
					System.out.println("NV:"+((NhanVien)x).getTen()+"co muc luong cao nhat la:"+((NhanVien)x).tingLuong());
				}
				break;
				
				
			default:
				System.out.println("sai du lieu!");
			}
	}
		
	}

}
