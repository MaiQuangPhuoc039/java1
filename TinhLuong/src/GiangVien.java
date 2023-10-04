import java.util.Scanner;

public class GiangVien  extends  CanBo{
	String khoa;
	String trinhDo;
	int soTietDay;
	public GiangVien(String ten, double phuCap, double heSoLuong, String khoa, String trinhDo, int soTietDay) {
		super(ten, phuCap, heSoLuong);
		this.khoa = khoa;
		this.trinhDo = trinhDo;
		this.soTietDay = soTietDay;
	}
	public String getKhoa() {
		return khoa;
	}
	public void setKhoa(String khoa) {
		this.khoa = khoa;
	}
	public String getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(String trinhDo) {
		this.trinhDo = trinhDo;
	}
	public int getSoTietDay() {
		return soTietDay;
	}
	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}
	Scanner sc= new Scanner(System.in);
	public void nhap() {
		super.nhap();
		System.out.println("nhap khoa :");
		this.khoa = sc.nextLine();
		System.out.print("Nhập trình độ: ");
		this.trinhDo = sc.nextLine();
		System.out.print("Nhập số tiết dạy trong một tháng: ");
		this.soTietDay = sc.nextInt();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Ten GV:"+this.getTen() +"trinh do:"+this.trinhDo +"so tiet day:"+this.soTietDay);
		System.out.println("phu cap:"+this.phuCap()+"luong:"+this.tingLuong());
		System.out.println("----------------");
	}
	
	@Override
	public double tingLuong() {
		return (this.getHeSoLuong() * 730) + this.phuCap() + (this.soTietDay * 45);
	}
	
	@Override
	public double phuCap() {
		if(this.trinhDo.equals("tien si")) return 1000;
		else if(this.trinhDo.equals("thac si")) return 500;
		else if(this.trinhDo.equals("cu nhan")) return 300;
		else return 0;
	}

}
