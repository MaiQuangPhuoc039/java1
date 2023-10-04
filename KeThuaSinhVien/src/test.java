import java.util.ArrayList;
import java.util.Scanner;

public class test {
	public static void menu() {
		System.out.println("======MENU======");
		System.out.println("0.  thoát ");
		System.out.println("1.  nhập");
		System.out.println("2.  xuất");
		System.out.println("3.  xuất thông tin lớp");
		System.out.println("4.  sinh viên giỏi");
		System.out.println("5.  sinh viên điểm cao nhất");
	}
	public static void menulop() {
		System.out.println("1.  lopIT");
		System.out.println("2.  lopBA");
	}
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 ArrayList<SinhVienVKU> list = new ArrayList<SinhVienVKU>();
		 int chonLop=0;
		 int soSV=0;
		 
		 while(true) {
				menu();
				System.out.print("chon menu so:");
				int chonMenu=sc.nextInt();
				System.out.println("------------------");
				if(chonMenu==0) break;
				
				switch(chonMenu) {
				case 1:
					menulop();
					System.out.print("chon menu lop:");
					chonLop=sc.nextInt();
					System.out.println("nhap so sv muon nhap");
					soSV=sc.nextInt();
					System.out.println("------------------");
					if(chonLop==1) {
						for(int i=0;i<soSV;i++) {
							SinhVienIT it=new SinhVienIT();
							it.nhapIT();
							list.add(it);
						}
					}else  if(chonLop==2){
						for(int i=0;i<soSV;i++) {
							SinhVienBA ba=new SinhVienBA();
							ba.nhapBA();
							list.add(ba);
						}
					}else {
						System.out.println("sai du lieu , mời chon lại");
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
					menulop();
					System.out.println("chon menu lop:");
					chonLop=sc.nextInt();
					System.out.println("------------------");
					for(int i=0;i<soSV;i++) {
						SinhVienVKU x= list.get(i);
						if(chonLop==1) {
							if(x instanceof SinhVienIT) {
								((SinhVienIT) x).xuatIT();
							} 
						}else if(chonLop==2) {
							if(x instanceof SinhVienIT) {
								((SinhVienIT)x).xuatIT();
							}
						}
					}
					break;
					
				case 4:
					System.out.println("sinh vien gioi la:");
					for(int i=0;i<soSV;i++) {
						SinhVienVKU x= list.get(i);
						if(x instanceof SinhVienIT) {
							if(((SinhVienIT) x).hocLuc(((SinhVienIT) x).TB())=="gioi") {
								System.out.println(x.getTen());
							}
						 }else if(x instanceof SinhVienBA){
							if(((SinhVienBA) x).hocLuc(((SinhVienBA) x).TB())=="gioi") {
								System.out.println(x.getTen());
							}
						  }
					    }
					break;
					
				case 5:
					double max=0;
					int viTri=0;
					for(int i=0;i<soSV;i++) {
						SinhVienVKU x= list.get(i);
						double diem=0;
						if(diem>max) {
							max=diem;
							viTri=i;
						}
					}
					SinhVienVKU x=list.get(viTri);
					if (x instanceof SinhVienIT) {
						System.out.println("SV: " + ((SinhVienIT) x).getTen() + " lop IT co diem TB cao nhat: " + ((SinhVienIT) x).TB());
					} else if (x instanceof SinhVienBA) {
						System.out.println("SV: " + ((SinhVienBA) x).getTen() + " lop BA co diem TB cao nhat: " + ((SinhVienBA) x).TB());
					}
		        	break;
		        	default:
		        		System.out.println("sai du lieu");
			  }
	     }
     }  
}
