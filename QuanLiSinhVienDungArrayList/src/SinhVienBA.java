

import java.util.Scanner;

public class SinhVienBA extends SinhVienVKU {
	double marketing;
	double keToan;
	Scanner sc = new Scanner(System.in);
	
	public double getMarketing() {
		return marketing;
	}
	public void setMarketing(double marketing) {
		this.marketing = marketing;
	}
	public double getKeToan() {
		return keToan;
	}
	public void setKeToan(double keToan) {
		this.keToan = keToan;
	}

	public void nhapBA() {
		super.nhap();
		System.out.print("Nhap diem marketing: ");
		this.setMarketing(sc.nextDouble());
		System.out.print("Nhap diem ke toan: ");
		this.setKeToan(sc.nextDouble());
		System.out.println("--------------------------------------");
	}
	public void xuatBA() {
		super.xuat();
		System.out.println("Sv lop BA");
		System.out.println("diem marketing: " + this.getMarketing());
		System.out.println("diem ke toan: " + this.getKeToan());
		System.out.println("diem TB: " + this.TB());
		System.out.println("--------------------------------------");
	}
	public double TB() {
		return this.diemTB(this.getMarketing(), this.getKeToan());
	}
}
