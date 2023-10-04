package tienDien;

import java.util.Scanner;

public abstract class khachHang {
     private String tenChuHo;
     private int soNha;
     private String maCongTo;
	public khachHang(String tenChuHo, int soNha, String maCongTo) {
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
	Scanner sc = new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap ten chu ho:" );
		this.tenChuHo= sc.next();
		System.out.println("Nhap so nha:" );
		this.soNha= sc.nextInt();
		System.out.println("Nhap ma cong to :" );
		this.maCongTo= sc.next();
	}
	public void xuat() {
		System.out.println("Ten chu ho :"+this.tenChuHo);
		System.out.println("So nha :"+this.soNha);
		System.out.println("ma cong to :"+this.maCongTo);

	}
	public abstract double soTienPhaiTra();
}
      
     

