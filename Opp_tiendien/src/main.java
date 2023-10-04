import java.util.ArrayList;
import java.util.Scanner;

public class main {
	public static void menu() {
		System.out.println("=====MENU=====");
		System.out.println("0. thoat");
		System.out.println("1. nhap");
		System.out.println("2. xuat");
		System.out.println("3. xuat tien dien phai tra");
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<KhachHang> list=new ArrayList<KhachHang>();
		int chon=0;
		int soHo=0;
		
		while(true) {
			menu();
			System.out.println("chon menu so");
			chon=sc.nextInt();
			System.out.println("----------------");
			if(chon==0) break;
			switch (chon) {
			case 1: 
				System.out.println("nhap so ho muon nhap:");
				soHo = sc.nextInt();
				System.out.println("------------------");
				for(int i=0;i<soHo;i++) {
					BienLai Bl=new BienLai(null, soHo, null, i, i, i);
					Bl.nhapBL();
					list.add(Bl);
				}
				break;
				
			case 2:
				for(int i=0;i<soHo;i++) {
					KhachHang x= list.get(i);
					if(x instanceof BienLai) {
						((BienLai)x).xuatBL();
					}
				}
				break;
				
			case 3:
				double max=0;
				int viTri=0;
				double tienDien=0;
				
				for(int i=0;i<soHo;i++) {
					KhachHang x=list.get(i);
					if(tienDien>max) {
						tienDien=max;
						viTri=i;
					}
					
					System.out.println("chu ho:"+list.get(i).getHoTenChuHo()+",so nha:"+list.get(i).getSoNha()+",phai tra so tien la:"+list.get(i).soTienPhaiTra());
				
					System.out.println("chu ho"+list.get(i).getHoTenChuHo()+"so nha" +list.get(i).getSoNha()+"phai tra so tien lon nhat la"+list.get(i).soTienPhaiTra());
				}
				 
			default:
				 System.out.println("sai du lieu");
			}
		}
	}
	 
}
