package tienDien;

import java.util.Scanner;

public class bienLai  extends khachHang{
	private int chiSoMoi;
	private int chiSoCu;
	private double soTienPhaiTra;
	public bienLai(String tenChuHo, int soNha, String maCongTo, int chiSoMoi, int chiSoCu, double soTienPhaiTra) {
		super(tenChuHo, soNha, maCongTo);
		this.chiSoMoi = chiSoMoi;
		this.chiSoCu = chiSoCu;
		this.soTienPhaiTra = soTienPhaiTra;
	}
	public int getChiSoMoi() {
		return chiSoMoi;
	}
	public void setChiSoMoi(int chiSoMoi) {
		this.chiSoMoi = chiSoMoi;
	}
	public int getChiSoCu() {
		return chiSoCu;
	}
	public void setChiSoCu(int chiSoCu) {
		this.chiSoCu = chiSoCu;
	}
	public double getSoTienPhaiTra() {
		return soTienPhaiTra;
	}
	public void setSoTienPhaiTra(double soTienPhaiTra) {
		this.soTienPhaiTra = soTienPhaiTra;
	}
	Scanner sc  = new Scanner(System.in);
	public void nhap() {
		super.nhap();
		System.out.println("Nhap chi so moi: " );
		this.chiSoMoi= sc.nextInt();
		System.out.println("Nhap chi so cu: " );
		this.chiSoCu= sc.nextInt();
		System.out.println("--------------------------");
	}
	public void xuat() {
		super.xuat();
		System.out.println("chi so moi :"+this.chiSoMoi +"Chi so cu: "+this.chiSoCu);
		System.out.println("So tien phai tra :"+this.soTienPhaiTra());
		System.out.println("---------------------------");
	}







	@Override
	public double soTienPhaiTra() {
		// TODO Auto-generated method stub
		
		return (chiSoMoi-chiSoCu)*100;
	}

}
