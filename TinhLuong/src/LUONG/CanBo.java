package LUONG;

import java.util.Scanner;

public abstract class CanBo {
	private String ten;
	private double phuCap;
	private int heSoluong;
	public CanBo(String ten, double phuCap, int heSoluong) {
		super();
		this.ten = ten;
		this.phuCap = phuCap;
		this.heSoluong = heSoluong;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getPhuCap() {
		return phuCap;
	}
	public void setPhuCap(double phuCap) {
		this.phuCap = phuCap;
	}
	public int getHeSoluong() {
		return heSoluong;
	}
	public void setHeSoluong(int heSoluong) {
		this.heSoluong = heSoluong;
	}
	
	Scanner sc= new Scanner(System.in);
	public void nhap() {
		System.out.println("Nhap ten:");
		ten=sc.next();
		System.out.println("Nhap he so luong:");
		heSoluong = sc.nextInt();
	}
	public void xuat() {
		System.out.println(" CB ten:"+this.ten+", he so luong:"+this.heSoluong);
	}
	public abstract double tinhLuong();
	public abstract double tinhPhuCap();

}
