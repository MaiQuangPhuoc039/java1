package LUONG;

import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Scanner;
import java.time.LocalTime;

public class run   {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		 
	 
		
		System.out.println("Nhap vao so Luong xe:");
		n = sc.nextInt();	
		 
		for(int i=0 ; i<n;i++) {
		 
		  System.out.println("-------------------");
	 

			 
//			  System.out.println("Nhập thời gian theo định dạng hh:mm:ss: \n");
			
			  System.out.println("Nhập thời gian vào xe thứ "+(i+1)+" :");
			  String  thoiGianVao = sc.nextLine();
		        LocalTime vao = LocalTime.parse(thoiGianVao);
			  
			  
			  System.out.println("Nhập thời gian ra xe thứ "+(i+1)+" :");
			  String  thoiGianRa = sc.next();
		        LocalTime ra = LocalTime.parse(thoiGianRa);
	 
		  
		  
		 
		  
		   
		}
	
	
	 }
	

}
