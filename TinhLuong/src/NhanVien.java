import java.util.Scanner;

public class NhanVien  extends CanBo{
	String phongBan;
	String chucVu;
	int soNgayCong;
	public NhanVien(String ten, double phuCap, double heSoLuong, String phongBan, String chucVu, int soNgayCong) {
		super(ten, phuCap, heSoLuong);
		this.phongBan = phongBan;
		this.chucVu = chucVu;
		this.soNgayCong = soNgayCong;
	}
	public String getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(String phongBan) {
		this.phongBan = phongBan;
	}
	public String getChucVu() {
		return chucVu;
	}
	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	public int getSoNgayCong() {
		return soNgayCong;
	}
	public void setSoNgayCong(int soNgayCong) {
		this.soNgayCong = soNgayCong;
	}
	Scanner sc= new Scanner(System.in);
	@Override
	public double tingLuong() {
		return (this.getHeSoLuong()*730)+(this.phuCap())+(this.soNgayCong*30);
	}
	@Override
	public double phuCap() {
		if(this.phongBan.equals("truong phong")) return 2000;
		else if(this.phongBan.equals("pho phong")) return 1000;
		else if(this.phongBan.equals("nhan vien")) return 500;
		else return 0;
	}
	public void xuat() {
		super.xuat();
		System.out.println("nhap trinh do"+this.phongBan +"chuc vu"+this.chucVu+"so ngay cong"+this.soNgayCong);
		System.out.println("phu cap"+this.phuCap() +"luong"+this.tingLuong());System.out.println("----------------");
	}
	public void nhap() {
		super.nhap();
		System.out.print("Nhap phong ban: ");
		this.phongBan = sc.nextLine();
		System.out.print("Nhap so ngay cong: ");
		this.soNgayCong = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap chuc vu: ");
		this.chucVu = sc.nextLine();
		
	}
	

}
