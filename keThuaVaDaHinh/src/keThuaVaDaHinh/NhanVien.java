package keThuaVaDaHinh;

import java.util.Scanner;

public class NhanVien extends CanBo    {
	String phongBan;
	String chucVu;
	int soNgayCong;
	public NhanVien(String ten, double phuCap, double heSoLuong, String phongBan, String chucVu, int soNgayCong) {
		super(ten, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.chucVu = chucVu;
		this.soNgayCong = soNgayCong;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	 
	@Override
	public double tinhLuong() {
		return (this.getHeSoLuong()*730)+(this.phuCap())+(this.soNgayCong*30);
	}
	@Override
	public double phuCap() {
		if(this.chucVu.equals("truongPhong")) return 2000;
		else if(this.chucVu.equals("pho phong")) return 1000;
		else if(this.chucVu.equals("nhan vien")) return 500;
		return 0;
	}
	public void nhap() {
		 Scanner sc=  new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap phong ban: ");
		this.phongBan = sc.nextLine();
		System.out.print("Nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap chuc vu: ");
		this.chucVu = sc.nextLine();
	}
	public void xuat() {
		super.xuat();
//		super.phuCap = this.phuCap();
		System.out.println("Phong ban: " + this.phongBan + ",chuc vu: " + this.chucVu);
		System.out.println("So ngay cong: " + this.soNgayCong);
		System.out.println("Phu cap: " + this.phuCap() + ",luong: " + this.tinhLuong());
	}

	

}
