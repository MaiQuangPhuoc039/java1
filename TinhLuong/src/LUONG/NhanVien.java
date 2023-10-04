package LUONG;

public class NhanVien extends CanBo {
	String phongBan;
	String chucVu;
	int soNgayCong;
	
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
	public NhanVien(String ten, double phuCap, int heSoluong, String phongBan, String chucVu, int soNgayCong) {
		super(ten, phuCap, heSoluong);
		this.phongBan = phongBan;
		this.chucVu = chucVu;
		this.soNgayCong = soNgayCong;
	}
	@Override
	public double tinhLuong() {
		return (this.getHeSoluong()*730)+(this.tinhPhuCap())+(this.soNgayCong*30);
	}
	@Override
	public double tinhPhuCap() {
		 if(this.chucVu.equals("truong phang")) return 1000 ;
		 else if(this.chucVu.equals("pho phong")) return 500;
		 else if(this.chucVu.equals("nhan vien")) return 300;
		 else return 0;
	}
	public void nhap() {
		super.nhap();
		System.out.println("Nhap phong ban");
		phongBan=sc.next();System.out.println("nhap so ngay cong:");
		soNgayCong=sc.nextInt();
		System.out.println("Nhap chuc vu:");
		chucVu=sc.next();
		
	}
	public void xuat() {
		super.xuat();
		System.out.println("Phong ban:"+phongBan+" ,chuc vu"+chucVu+", so ngay cong:"+soNgayCong);
		System.out.println("phu cap:"+tinhPhuCap()+"co luong:"+tinhLuong());
		System.out.println("-----------------------------");
	}
	

}
