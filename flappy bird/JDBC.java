package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;
import com.mysql.jdbc.Driver;

public class JDBC {
	public static Connection getConnection() {
		Connection c = null;
		
		try {
			// dang ki MySQL Driver
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url = "jdbc:mySQL://localhost:3306/dangnhap";
			String username="root";
			String password="";
			// tao ket noi
			c= DriverManager.getConnection(url, username, password);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
		
	}
	public static void closeConnection(Connection c) {
		try {
			if(c != null) {
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
	
	
//	public static Connection getConnection() {
//		Connection c = null;
//		
//		try {
//			// dang ky driver
//			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			     // tạo liên kết với link (quanlydetaikhoahoc)
//			static	String url = "jdbc:mySQL://localhost:3306/quanlydetaikhoahoc";
//			static	String username="root";
//			static String password="";
//			// tao ket noi
//			c=DriverManager.getConnection(url, username, password);
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		return c;
//		
//	}
//	public static void closeConnection(Connection c) {
//		try {
//			if(c!= null) {
//				c.close();
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}

	
	
//       public static Connection getConnection() {
//	
//	 
//	   Connection connection = null;
//	  
//	    try {
//	    	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//	    	 	String url = "jdbc:mySQL://localhost:3306/quanlydetaikhoahoc";
//	 	String user="root";
//	 String password="";
//		connection=DriverManager.getConnection(url, user, password);
//		// dang ky driver
////		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//		     // tạo liên kết với link (quanlydetaikhoahoc)
//		 
//		// tao ket noi
//	 
//		
//	} catch (Exception ex) {
//		// TODO: handle exception
//		ex.printStackTrace();
//	}
//	return connection;
//	
//}
//          public static void closeConnection(Connection c) {
//	try {
//		if(c!= null) {
//			c.close();
//		}
//	} catch (Exception e) {
//		// TODO: handle exception
//	}
   
//	
	
//	public static void sua(cacGUI1 cacGui1) {
//		String query= "Update quanlydetaikhoahoc set maDeTai=?,tenDeTai=?, nguoiThucHien=?,thoiGian=?,capQuanLy=?,linhVuc=? "
//				+ "where  maDeTai='"+cacGui1.getMaDeTai()+"'";
//		 try {
//			 Connection connection= getConnection();
//				PreparedStatement pstmt= connection.prepareStatement(query);
//				pstmt.setInt(1, cacGui1.getMaDeTai());
//				pstmt.setString(2, cacGui1.getTenDeTai());
//				pstmt.setString(3, cacGui1.getNguoiThucHien());
//				pstmt.setString(4, cacGui1.getThoiGian());
//				pstmt.setString(5, cacGui1.getQuanLi());
//				pstmt.setString(6, cacGui1.getLinhVuc());
//				pstmt.executeUpdate();
//				System.out.println(query);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		
//		
//	}
//	
//	public static List<cacGUI1>timKiemm(cacGUI1 cac) {
//		List<cacGUI1>cacGui1list= new ArrayList<>();
//		String query = "select*from deTaiKhoaHoc where.maDeTai='"+cac.getMaDeTai()+"'";
//		Connection connection =getConnection();
//		try {
//			Connection connection2 = getConnection();
//			Statement sttm= connection2.createStatement();
//			ResultSet rs= sttm.executeQuery(query);
//			while(rs.next()) {
//				cacGUI1 cacGui1 = new cacGUI1(rs.getInt("maDeTai"), rs.getString("tenDeTai"), 
//						rs.getString("nguoiThucHien"),rs.getString("thoiGian"),
//						rs.getString("capQuanLy"), rs.getString("linhVuc")		);
//				cacGui1list.add(cacGui1);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return cacGui1list;
//		
//	}
//
//	
//	public static void xoa(cacGUI1 cacGui1) {
//		String query = "delete from quanlydetaikhoahoc where maDeTai='"+cacGui1.getMaDeTai()+"'";
//		try {
//			Connection connection = getConnection();
//			PreparedStatement pstmt = connection.prepareStatement(query);
//			pstmt.executeUpdate();
//
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public static void them(cacGUI1 cacGui1) {
//		String query = "insert into quanlydetaikhoahoc(maDeTai,tenDeTai,thoiGian,thucHien,capQuanLy,linhVuc) values (?,?,?,?,?,?)";
//		try {
//			Connection connection = getConnection();
//			PreparedStatement pstmt = connection.prepareStatement(query);
//			pstmt.setInt(1, cacGui1.getMaDeTai());
//			pstmt.setString(2, cacGui1.getTenDeTai());
//			pstmt.setString(3, cacGui1.getNguoiThucHien());
//			pstmt.setString(4, cacGui1.getThoiGian());
//			pstmt.setString(5, cacGui1.getQuanLi());
//			pstmt.setString(6, cacGui1.getLinhVuc());
//			pstmt.execute();
//			System.out.println(query);
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//	}
//	
//	public static List<cacGUI1>findAll(){
//		List<cacGUI1>cacGui1list= new ArrayList<>();
//		String query = "select*from deTaiKhoaHoc";
//		Connection connection =getConnection();
//		try {
//			Connection connection2 = getConnection();
//			Statement sttm= connection2.createStatement();
//			ResultSet rs= sttm.executeQuery(query);
//			while(rs.next()) {
//				
//				cacGUI1 cacGui1 = new cacGUI1(rs.getInt("maDeTai"), rs.getString("tenDeTai"), 
//						rs.getString("nguoiThucHien"),rs.getString("thoiGian"),
//						rs.getString("capQuanLy"), rs.getString("linhVuc")		);
//				
////				cacGUI1 cacGui1 = new cacGUI1(rs.getInt("maDeTai"), rs.getString("tenDeTai"), rs.getString("nguoiThucHien"),
////				rs.getString("thoiGian"), rs.getString("capQuanLy"), rs.getString("linhVuc")		);
//				cacGui1list.add(cacGui1);
//			}
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return cacGui1list;
//	}
	 
