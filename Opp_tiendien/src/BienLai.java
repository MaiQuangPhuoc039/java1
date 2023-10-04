import java.util.Scanner;

public class BienLai extends KhachHang {
	// Với mỗi biên lai, có các thông tin sau:
			//thông tin về hộ sử dụng điện, chỉ số cũ, chỉ số mới, số tiền phải
	private int chiSoCu;
	private int chiSoMoi;
	private double soTienPhaiTra;
	public BienLai(String hoTenChuHo, int soNha, String maSoCongTo, int chiSoCu, int chiSoMoi, double soTienPhaiTra) {
		super(hoTenChuHo, soNha, maSoCongTo);
		this.chiSoCu = chiSoCu;
		this.chiSoMoi = chiSoMoi;
		this.soTienPhaiTra = soTienPhaiTra;
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public double getSoTienPhaiTra() {
		return soTienPhaiTra;
	}
	public void setSoTienPhaiTra(double soTienPhaiTra) {
		this.soTienPhaiTra = soTienPhaiTra;
	}
	
	Scanner sc=new Scanner(System.in);
	public void nhapBL() {
		super.nhap();
		System.out.print ("Nhap chi so moi:");
		chiSoMoi=sc.nextInt();
		System.out.print ("Nhap chi so cu:");
		chiSoCu=sc.nextInt();
		System.out.println("-----------------------");
	}
	public void xuatBL() {
		super.xuat();
		System.out.println("Co chi so cu:"+this.chiSoCu);
		System.out.println( "Co chi sio moi:"+this.chiSoMoi);
	 	System.out.println("So tien phai tra la:"+ this.soTienPhaiTra());
	 	System.out.println("-----------------------");
	}
	
//	số tiền phải trả=(Số mới - số cũ) * 750. 
	@Override
	public double soTienPhaiTra() {
		return (this.chiSoMoi-this.chiSoCu)*750;
	}
	 
	 

}
