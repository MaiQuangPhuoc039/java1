import java.util.ArrayList;
import java.util.Scanner;

public class Run {
	//4. Cài đặt chương trình thực hiện các công việc sau:
	//+ 4.1 Nhập vào các thông tin cho n hộ sử dụng điện  ( + 3 điểm )
	//+ 4.2 Hiển thị thông tin về các biên lai đã nhập  ( + 3 điểm )
	//+ 4.3 Tính số tiền điện phải trả cho mỗi hộ dân, 
//		nếu giả sử rằng tiền phải trả được tính theo công thức sau: ( + 4 điểm )
	//số tiền phải trả=(Số mới - số cũ) * 750. 
	// 
	public static void menu() {
		System.out.println("===========MENU==========");
		System.out.println("0. thoat khoi menu.");
		System.out.println("1. Nhap.");
		System.out.println("2. Xuat.");
		System.out.println("3. So tien phai tra.");
		System.out.println("-----------------");

	}
	  
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		ArrayList<KhachHang> list = new ArrayList<KhachHang>();
		int soHo=0;
		int chon;
		
		while(true) {
			menu();
			System.out.print ("chon menu so:");
			chon=sc.nextInt();
			System.out.println("-----------------");
			if(chon==0) break;
			
			switch (chon) {
			case 1:
				if(chon==1) {
					System.out.print ("Nhap so nguoi nhap:");
					soHo=sc.nextInt();
					 for(int i=1;i<=soHo;i++) {
					        System.out.println("-----------------");
					       BienLai BL=new BienLai(null, chon, null, i, i, i);
					       BL.nhapBL();
					        list.add(BL);
					 }
				}
				break;
			case 2:
				if(chon==2) {
					for(int i=0;i<soHo;i++) {
						KhachHang x= list.get(i);
						if(x instanceof BienLai) {
							((BienLai)x).xuatBL();
						}
					}
				}
				break;
			case 3:
				if(chon==3) {
					for(int i=0;i<soHo;i++) {
						System.out.print ("So tien ho: "+list.get(i).getHoTenChuHo()+", "
								+ " nha so:"+list.get(i).getSoNha()+" , phai tra so tien la:"
										+ ""+list.get(i).soTienPhaiTra()+"  VND \n");
					}
				}
				break;
			default:
				System.out.println("Sai du lieu.");
			}
		}
		
	}

}
