package Tien;

import java.util.Scanner;

public abstract class KhachHang {
	private String tenChuHo;
	private int soNha;
	private String maCongTo;
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		super();
		this.tenChuHo = tenChuHo;
		this.soNha = soNha;
		this.maCongTo = maCongTo;
	}
	public String getTenChuHo() {
		return tenChuHo;
	}
	public void setTenChuHo(String tenChuHo) {
		this.tenChuHo = tenChuHo;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	public String getMaCongTo() {
		return maCongTo;
	}
	public void setMaCongTo(String maCongTo) {
		this.maCongTo = maCongTo;
	}
	Scanner sc= new Scanner(System.in);
	public void nhap() {
		System.out.print ("Nhap ten chu ho:");
		tenChuHo=sc.next();
		System.out.print ("Nhap so nha:");
		soNha=sc.nextInt();
		System.out.print ("Nhap ma cong to:");
		maCongTo=sc.next();
		System.out.println("-------------------");
	}
	public void xuat() {
		System.out.print ("Chu ho:"+this.tenChuHo+", nha so:"+this.soNha+", ma cong to:"+this.maCongTo);
	}
	public  abstract double  soTienPhaiTra();
}
