

import java.util.Scanner;

public class SinhVienIT extends SinhVienVKU {
	double c;
	double java;
	Scanner sc = new Scanner(System.in);
	
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public double getJava() {
		return java;
	}
	public void setJava(double java) {
		this.java = java;
	}
	
	public void nhapIT() {
		super.nhap();
		System.out.print("Nhap diem c: ");
		this.setC(sc.nextDouble());
		System.out.print("Nhap diem java: ");
		this.setJava(sc.nextDouble());
		System.out.println("--------------------------------------");
	}
	public void xuatIT() {
		super.xuat();
		System.out.println("Sv lop IT");
		System.out.println("diem c: " + this.getC());
		System.out.println("diem java: " + this.getJava());
		System.out.println("diem TB: " + this.TB());
		System.out.println("--------------------------------------");
	}
	public double TB() {
		return this.diemTB(this.getC(), this.getJava());
	}
}
