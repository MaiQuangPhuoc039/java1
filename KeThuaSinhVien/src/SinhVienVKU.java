import java.util.Scanner;

public class SinhVienVKU {
	String ten;
	String lop;
	String maSinhVien;
	Scanner sc= new Scanner(System.in);
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getLop() {
		return lop;
	}
	public void setLop(String lop) {
		this.lop = lop;
	}
	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public void nhap() {
		System.out.println("  Nhap ten:");
		this.ten=sc.next();
		System.out.println("  nhap lop:");
		this.lop=sc.next();
		System.out.println("  Nhập mã sinh viên:");
		this.maSinhVien=sc.next();
		 
	}
	public void xuat() {
		System.out.println("  sinh viên:"+this.ten +" lớp:"+this.lop +" có mã sinh viên:"+this.maSinhVien);
	}
	public double tinhTB(double x , double y) {
		return (x+y)/2;
	}
	public String hocLuc(double diem) {
		if(diem>8)  return"gioi";
		else if(diem>7) return"kha";
		else if(diem>5) return"trung binh ";
		else return"yeu";
		
		 
			
		}
	}
	


