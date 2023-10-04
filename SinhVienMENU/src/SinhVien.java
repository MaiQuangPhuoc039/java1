
import java.util.Scanner;

public class SinhVien {
	String ten;
	double c ;
	double java;
	Scanner sc = new Scanner(System.in);
	
	public double tinhTB() {
		return (this.c + this.java)/2;
	}
	
	public void nhap() {
		System.out.print("Ten SV: ");
		this.ten = sc.nextLine();
		System.out.print("Diem c: ");
		this.c = sc.nextDouble();
		System.out.print("Diem java: ");
		this.java = sc.nextDouble();
		System.out.println("--------------------------------------");
	}
	
	public void xuat() {
		System.out.println("Sinh Vien Ten: " + this.ten);
		System.out.println("Co diem c: " + this.c);
		System.out.println("Co diem java: " + this.java);
		System.out.println("Co diem tb: " + this.tinhTB());
		System.out.println("Co hoc luc: " + this.hocLuc());
		System.out.println("--------------------------------------");
	}
	
	public String hocLuc() {
		double tb = this.tinhTB();
		if (tb > 8) return"gioi";
		else if (tb > 7) return"kha";
		else return"yeu";
	}
}
