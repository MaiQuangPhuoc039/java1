
import java.util.Scanner;

public class SinhVienVKU {
	String name;
	String MaSV;
	String Lop;
	Scanner sc = new Scanner(System.in);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaSV() {
		return MaSV;
	}
	public void setMaSV(String maSV) {
		MaSV = maSV;
	}
	public String getLop() {
		return Lop;
	}
	public void setLop(String lop) {
		Lop = lop;
	}
	
	public void nhap() {
		System.out.print("Nhap ho va ten: ");
		this.name=sc.next();
		System.out.print("Nhap ma sv: ");
		this.MaSV=sc.next();
	}
	
	public void xuat() {
		System.out.println("Sinh vien ten:"+this.name);
		System.out.println("Co ma sinh vien:"+this.MaSV);
	}
	
	public double diemTB(double x, double y) {
		return (x + y) / 2;
	}
	
	public String hocLuc(double diem) {
		if (diem >= 8) return"gioi";
		else if (diem >= 6.5) return"kha";
		else if (diem >= 5) return"trung binh";
		else return"yeu";
	}
}
