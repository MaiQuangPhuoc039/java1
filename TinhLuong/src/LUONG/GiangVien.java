package LUONG;

import java.net.Socket;

public class GiangVien  extends CanBo{
	String khoa;
	String trinhDO;
	int soTietDay;
	public GiangVien(String ten, double phuCap, int heSoluong, String khoa, String trinhDO, int soTietDay) {
		super(ten, phuCap, heSoluong);
		this.khoa = khoa;
		this.trinhDO = trinhDO;
		this.soTietDay = soTietDay;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTrinhDO() {
		return trinhDO;
	}
	public void setTrinhDO(String trinhDO) {
		this.trinhDO = trinhDO;
	}
	public int getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	@Override
	public double tinhLuong() {
		return (this.getHeSoluong()*730)+(this.tinhPhuCap())+(this.soTietDay*45);
	}
	@Override
	public double tinhPhuCap() {
		if(this.trinhDO.equals("tien si")) return 1000;
		else if(this.trinhDO.equals("thac si")) return 500;
		else if(this.trinhDO.equals("cu nhan")) return 300;
		else return 0;
	}
	public void nhap() {
		super.nhap();
		System.out.println("nhap khoa:");
		khoa = sc.next();
		
		System.out.println("Nhap so tiet day trong mot thang:");
		soTietDay=sc.nextInt();
		System.out.println("Nhap trinh do:");
		trinhDO=sc.next();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Khoa:"+khoa+",trinh do:"+trinhDO+",so tiet day mot thang:"+soTietDay);
		System.out.println("phu cap:"+tinhPhuCap()+" luong"+tinhLuong());
		System.out.println("----------------------------");
	}
	

}
