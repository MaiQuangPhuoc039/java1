import java.util.Scanner;

public class SinhVienBA extends SinhVienVKU {
	double diemKeToan;
	double diemMaKeting;
	
	Scanner sc= new Scanner(System.in);

	public double getDiemKeToan() {
		return diemKeToan;
	}

	public void setDiemKeToan(double diemKeToan) {
		this.diemKeToan = diemKeToan;
	}

	public double getDiemMaKeting() {
		return diemMaKeting;
	}

	public void setDiemMaKeting(double diemMaKeting) {
		this.diemMaKeting = diemMaKeting;
	}
	public void nhapBA() {
		super.nhap();
		System.out.println("nhap diem ke toan:");
		this.diemKeToan=sc.nextDouble();
		System.out.println("nhap diem maketing:");
		this.diemMaKeting=sc.nextDouble();
		System.out.println("------------------");
	}
	public void xuatBA() {
		super.nhap();
		System.out.println("diem ke toan:"+this.diemKeToan+"diem maketing:"+this.diemMaKeting);
		System.out.println(" co diem trung binh:");
		System.out.println("------------------");

	}
	public double TB() {
		return this.tinhTB(this.diemKeToan,this.diemMaKeting);
		
	}
	
}
