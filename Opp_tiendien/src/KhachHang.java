import java.util.Scanner;

public abstract class KhachHang {
	//- Các thông tin riêng của mỗi
//	hộ sử dụng điện gồm: Họ tên chủ hộ, số nhà, mã số công tơ của hộ dân sử dụng điện.
	private String hoTenChuHo;
	private int soNha;
	private String maSoCongTo;
	public KhachHang(String hoTenChuHo, int soNha, String maSoCongTo) {
		super();
		this.hoTenChuHo = hoTenChuHo;
		this.soNha = soNha;
		this.maSoCongTo = maSoCongTo;
	}
	public String getHoTenChuHo() {
		return hoTenChuHo;
	}
	public void setHoTenChuHo(String hoTenChuHo) {
		this.hoTenChuHo = hoTenChuHo;
	}
	public int getSoNha() {
		return soNha;
	}
	public void setSoNha(int soNha) {
		this.soNha = soNha;
	}
	public String getMaSoCongTo() {
		return maSoCongTo;
	}
	public void setMaSoCongTo(String maSoCongTo) {
		this.maSoCongTo = maSoCongTo;
	}
	
	Scanner sc=new Scanner(System.in);
	public void nhap() {
		System.out.print ("Nhap ten chu ho:");
		hoTenChuHo=sc.next();
		System.out.print ("Nhap so nha:");
		soNha=sc.nextInt();
		System.out.print ("Nhap ma cong co:");
		maSoCongTo=sc.next();
	}
	public void xuat() {
		System.out.println("Chu ho:"+this.hoTenChuHo);
		System.out.println ("So nha:"+this.soNha);
		System.out.println ("Ma cong to:"+this.maSoCongTo);
	}
	public abstract double soTienPhaiTra();
	
}
