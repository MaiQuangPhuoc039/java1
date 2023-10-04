package Tien;

import java.util.Scanner;

public class BienLai  extends KhachHang{
	private int chiSoMoi;
	private int chiSoCu;
	private double soTienPhaiTra;
	public BienLai(String tenChuHo, int soNha, String maCongTo, int chiSoMoi, int chiSoCu, double soTienPhaiTra) {
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
	Scanner sc = new Scanner(System.in);
	/**
	 * 
	 */
	/**
	 * 
	 */
	/**
	 * 
	 */
	public void nhapBL() {
		super.nhap();
		System.out.print ("Nhap chi so moi:");
		chiSoMoi=sc.nextInt();
		System.out.print ("Nhap chi so cu:");
		chiSoCu=sc.nextInt();
		
	}
	public void xuatBl() {
		super.xuat();
		System.out.print ("Chi so moi:"+this.chiSoMoi+", Chi so cu:"+this.chiSoCu);
		System.out.print ("Phai tra so tien la:"+this.soTienPhaiTra());
		System.out.println("------------------");
	}
	@Override
	public double soTienPhaiTra() {
		// TODO Auto-generated method stub
		return (this.chiSoMoi-this.chiSoCu)*750;
	}
	 
}
