package keThuaVaDaHinh;

import java.util.Scanner;

public   abstract class CanBo {
	private String ten;
	private double phuCap;
	private double heSoLuong;
	public CanBo(String ten, double phuCap, double heSoLuong) {
		this.ten = ten;
		this.phuCap = phuCap;
		this.heSoLuong = heSoLuong;
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
	public double getHeSoLuong() {
		return heSoLuong;
	}
	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	public abstract double tinhLuong();
	public abstract double phuCap();
	
	Scanner sc =  new Scanner(System.in);
	public void nhap() {
		System.out.println(" nhap ten:");
		this.ten=sc.next();
		System.out.println("He so luong:");
		this.heSoLuong=sc.nextDouble();
		}
	
	public void xuat() {
		System.out.println("ten:"+this.ten);
		System.out.println(" He so luong la:"+this.heSoLuong);
	}
}
