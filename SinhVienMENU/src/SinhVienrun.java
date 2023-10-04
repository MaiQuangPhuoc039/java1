
import java.util.Scanner;

public class SinhVienrun {
	static void menu() {
		System.out.println("Menu");
		System.out.println("1. Nhap");
		System.out.println("2. Xuat");
		System.out.println("3. Sap Xep");
		System.out.println("4. Sinh Vien Gioi");
		System.out.println("0. Thoat");
	}
	
	public static void main(String [] args) {
		SinhVien[] list = new SinhVien[50];
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			menu();
			System.out.print("Chon menu so: ");
			int chon = sc.nextInt();
			System.out.println("------------  --");
			if (chon == 0)break;
			switch (chon) {
				case 1:
					System.out.print("So sv muon nhap: ");
					n = sc.nextInt();
					for (int i = 0; i < n; i++) {
						SinhVien x = new SinhVien();
						x.nhap();
						list[i] = x;
					}
					break;
				case 2:
					for (int i = 0; i < n; i++) {
						list[i].xuat();
					}
					break;
//				case 3:			
//					try {
//						for (int i = 0; i < n - 1; i++) {
//							for (int j = i + 1; j < n; i++) {
//								if (list[i].tinhTB() < list[j].tinhTB()) {
//									SinhVien x = list[i];
//									list[i] = list[j];
//									list[j] = x;
//								}
//							}
//						}
//					} catch (Exception e) {
//						
//					}
//					break;
				case 4:
					System.out.println("Sinh vien co hoc luc gioi la: ");
					for (int i = 0; i < n; i++) {
						if (list[i].hocLuc() == "gioi") {
							System.out.println(list[i].ten);
						}
					}
					break;
				default:
					System.out.println("Khong hop le");
			}
		}
	}
}
