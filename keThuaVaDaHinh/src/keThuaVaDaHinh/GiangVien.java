package keThuaVaDaHinh;

import java.util.Scanner;

public class GiangVien extends CanBo {
	String  khoa;
	String  trinhDo;
	int     soTietDay;
	
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public int getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	 
	public GiangVien(String ten, double phuCap, double heSoLuong, String khoa, String trinhDo, int soTietDay) {
		super(ten, phuCap, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}
	
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		super.nhap();
		System.out.print(" Nhập khoa: ");
		this.khoa = sc.nextLine();
		System.out.print("Nhập trình độ: ");
		this.trinhDo = sc.nextLine();
		System.out.print("Nhập số tiết dạy trong một tháng: ");
		this.soTietDay = sc.nextInt();
	}
	
	public void xuatGV() {
		super.xuat();
		System.out.println("Khoa: " + this.khoa + ",trinh do: " + this.trinhDo);
		System.out.println("So tiet day: " + this.soTietDay);
	 	System.out.println("Phu cap: " + this.phuCap() + ",luong: " + this.tinhLuong());
	}
	
	public double phuCap() {
		if (this.trinhDo.equals("cu nhan")) return 300;
		else if (this.trinhDo.equals("thac si")) return 500;
		else if (this.trinhDo.equals("tien si")) return 1000;
		else return 0;
	}
	public double tinhLuong() {
		return (this.getHeSoLuong() * 730) + this.phuCap() + (this.soTietDay * 45);
	}


}
