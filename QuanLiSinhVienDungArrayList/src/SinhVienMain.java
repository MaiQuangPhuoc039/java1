

import java.util.ArrayList;
import java.util.Scanner;

public class SinhVienMain {
	static void menu() {
		System.out.println("_____MENU_____");
		System.out.println("0. thoat");
		System.out.println("1. nhap SV");
		System.out.println("2. hien thi SV");
		System.out.println("3. hien thi lop cu the");
		System.out.println("4. SV co hoc luc gioi");
		System.out.println("5. SV co diem cao nhat");
	}
	static void menuLop() {
		System.out.println("1. lop IT");
		System.out.println("2. lop BA");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<SinhVienVKU> list = new ArrayList<SinhVienVKU>();
		int soSV = 0, n = 0;
		int chonLop;
	
		while(true) {
			menu();
			System.out.print("Chon menu so: ");
			int chon = sc.nextInt();
			System.out.println("-----------");
			if (chon == 0) break;
			
			switch(chon) {
				case 1:
					menuLop();
					System.out.print("Chon menuLop so: ");
					chonLop = sc.nextInt();
					System.out.println("-----------");
					System.out.print("Chon so SV muon nhap: ");
					n = sc.nextInt();
					soSV += n;
					if (chonLop == 1) {
						for (int i = 0; i < soSV; i++) {
							SinhVienIT it = new SinhVienIT();
							it.nhapIT();
							list.add(it);
						}
					} else if (chonLop == 2) {
						for (int i = 0; i < soSV; i++) {
							SinhVienBA ba = new SinhVienBA();
							ba.nhapBA();
							list.add(ba);
						}
					} else {
						System.out.println("Khong hop le!");
					}
					break;
					
				case 2:
					for (int i = 0; i < soSV; i++) {
						SinhVienVKU x = list.get(i);
						if (x instanceof SinhVienIT) {
							((SinhVienIT) x).xuatIT();
						} else if (x instanceof SinhVienBA) {
							((SinhVienBA) x).xuatBA();
						}
					}
					break;
					
				case 3:
					menuLop();
					System.out.print("Chon MENU lớp: ");
					chonLop = sc.nextInt();
					System.out.println("---------");
					for (int i = 0; i < soSV; i++) {
						SinhVienVKU x = list.get(i);
						if (chonLop == 1) {
							if (x instanceof SinhVienIT) {
								((SinhVienIT) x).xuatIT();
							}
						} else if (chonLop == 2) {
							if (x instanceof SinhVienBA) {
								((SinhVienBA) x).xuatBA();
							}
						}
					}
					break;
					
				case 4:
					System.out.println("SV co hoc luc gioi:");
					for (int i = 0; i < soSV; i++) {
						SinhVienVKU x = list.get(i);
						if (x instanceof SinhVienIT) {
							if (((SinhVienIT) x).hocLuc(((SinhVienIT) x).TB()) == "gioi") {
								System.out.println(x.getName());
							}
						}
						else if (x instanceof SinhVienBA) {
							if (((SinhVienBA) x).hocLuc(((SinhVienBA) x).TB()) == "gioi") {
								System.out.println(x.getName());
							}
						}
					}
					break;
					
				case 5:
					double max = 0;
					int viTri = 0;
					for (int i = 0; i < soSV; i++) {
						SinhVienVKU x = list.get(i);
						double diem = 0;
						if (x instanceof SinhVienIT) {
							diem =((SinhVienIT) x).TB();
						} else if (x instanceof SinhVienBA) {
							diem =((SinhVienBA) x).TB();
						}
						if (diem >= max) {
							max = diem;
							viTri = i;
						}
					}
					SinhVienVKU x = list.get(viTri);
					if (x instanceof SinhVienIT) {
						System.out.println("SV: " + ((SinhVienIT) x).getName() + " lop IT co diem TB cao nhat: " + ((SinhVienIT) x).TB());
					} else if (x instanceof SinhVienBA) {
						System.out.println("SV: " + ((SinhVienBA) x).getName() + " lop BA co diem TB cao nhat: " + ((SinhVienBA) x).TB());
					}
					break;
				default:
					System.out.println("Khong hop le!");
			}		
		}	
	}
}
 
  
