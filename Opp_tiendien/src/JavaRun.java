import java.util.ArrayList;
import java.util.Scanner;

public class JavaRun {
	public static void menu() {
		System.out.println("======MENU=====");
		System.out.println("0. thoat");
		System.out.println("1. nhap");
		System.out.println("2. xuat");
		System.out.println("3. tien dien phai tra");
	}
	public static void main(String[] args) {
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		Scanner sc=new Scanner(System.in);
		int soHO=0;
		int chon;
		while(true) {
			menu();
			System.out.print ("chon menu so:");
			chon=sc.nextInt();
			System.out.println("---------------");
			if(chon==0) break;
			switch (chon) {
			case 1:  
				System.out.print ("nhap so ho muon nhap:");
				soHO=sc.nextInt();
				System.out.println("--------------");
				if(chon==1) {
					for(int i=0;i<soHO;i++) {
						BienLai x= new BienLai(null, chon, null, i, i, i);
						x.nhapBL();
						list.add(x);
						
					}
				}
				break;
			
			case 2:
				if(chon==2) {
					for(int i=0;i<soHO;i++) {
						KhachHang x= list.get(i);
						if(x instanceof BienLai) {
							((BienLai)x).xuatBL();
						}
					}
				}
				break;
				
			case 3:
				for(int i=0;i<soHO;i++) {
					System.out.println("Chu ho :"+list.get(i).getHoTenChuHo()+",Nha so:"+list.get(i).getSoNha()+",phai tra so tien la:"+list.get(i).soTienPhaiTra()+"\n");
				}
			default:
				 System.out.println("sai du lieu");
			}
		}
	}

}
