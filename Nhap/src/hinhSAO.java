import java.util.Scanner;

public class hinhSAO {
	public static void main(String[] args) {
		int n,m;
		Scanner sc= new Scanner(System.in);
		System.out.println("nhap n:");
		n=sc.nextInt();
		System.out.println("nhap m:");
		m=sc.nextInt();
		for(int i=0;i< n;i++) {
			for(int j=0;j< m-1;j++) {
				System.out.print  ("*"); 
			}
		 System.out.println("*");
		}
	}

}
