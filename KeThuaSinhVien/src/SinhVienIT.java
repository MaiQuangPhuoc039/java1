import java.util.Scanner;

public class SinhVienIT extends SinhVienVKU{
	double c;
	double java;
	
	Scanner sc= new Scanner(System.in);

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
		System.out.println("nhap diem c:");
		this.c=sc.nextDouble();
		System.out.println("nhap diem java:");
		this.java=sc.nextDouble();
		System.out.println("----------------");
	}
	public void xuatIT() {
		super.xuat();
		System.out.println("co diem c:"+this.c +"co diem java:"+this.java);
		System.out.println("co diem trung binh:"+this.TB());
		System.out.println("--------------------");
	}
	public double  TB() {
		return this.tinhTB(this.c,this.java);
		
	}
	

}
