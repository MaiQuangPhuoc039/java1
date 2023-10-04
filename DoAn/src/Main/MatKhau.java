package Main;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingWorker;
import javax.swing.border.Border;


public class MatKhau  extends JFrame implements ActionListener{
	
	public Run run = new  Run()	;
	public JTextField jt_email;
	public JPasswordField pass;
	public JButton jb_dangky;
	public JTextField jt_matkhau;
	public JButton jb_dangnhap;

	public JTextField getJt_email() {
		return jt_email;
	}


	public void setJt_email(JTextField jt_email) {
		this.jt_email = jt_email;
	}


	public MatKhau() {
		this.setTitle("dangNhap");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
        Font font = new Font("Arial", Font.BOLD,20);
		
		JPanel jp_north = new JPanel();
		jp_north.setPreferredSize(new Dimension(80,80 ));
		
		JPanel jp_south = new JPanel();
		jp_south.setPreferredSize(new Dimension(80,80 ));
		
		JPanel jp_west = new JPanel();		
		jp_west.setPreferredSize(new Dimension( 80,80));
		
		JPanel jp_east = new JPanel();		
		jp_east.setPreferredSize(new Dimension(    80,80)); 
		
		JPanel jp_center = new JPanel();
		
		
		JLabel jl_dangNhap= new JLabel( " Đăng Nhập");
		jl_dangNhap.setFont(new Font("Arial", Font.BOLD,40));
		jl_dangNhap.setForeground(Color.blue);
		
		
		JLabel jl_email= new JLabel("Nhập email hoặc sdt");
		JLabel jl_matkhau= new JLabel("Nhập mật khẩu");
		JLabel jl_quenmk = new JLabel("Quên mật khẩu ?");
		
		jl_quenmk.setForeground(Color.RED);
		jl_quenmk.setFont(new Font("Arial", Font.BOLD,10));
		
		  jt_email= new JTextField(100);
		  
		// pass
		  jt_matkhau = new JTextField();
		  pass= new JPasswordField(50);
		pass.getPassword();
		
		// tao button dang ky tai khoan nguoi dung
          jb_dangky = new JButton("Đăng ký");
//          ((Object) jb_dangky).setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));

          jb_dangky.setBackground(Color.BLUE);
          jb_dangky.setForeground(Color.WHITE);
          jb_dangky.addActionListener(this);
          jb_dangky.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		  jb_dangnhap = new JButton("Đăng nhập");
		jb_dangnhap.setBackground(Color.BLUE);
		jb_dangnhap.setForeground(Color.WHITE);
		jb_dangnhap.addActionListener(this);
		jb_dangnhap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		JCheckBox jcheck= new JCheckBox("hiển thị mật khẩu");
		jcheck.setFont(new Font("Arial", Font.BOLD,10));
		
		 
		JPanel jp_dangNhap= new JPanel();
		jp_dangNhap.add(jl_dangNhap);
		jp_dangNhap.setLayout(new FlowLayout(FlowLayout.RIGHT));
		jp_dangNhap.setLayout(new GridLayout(1,1));
		
		JPanel jP_email= new JPanel();
		jP_email.add(jl_email);
		jP_email.add(jt_email);
		jP_email.setLayout(new GridLayout(1,2,10,10));
		
		JPanel jP_matKhau= new JPanel();
		jP_matKhau.add(jl_matkhau);
		jP_matKhau.add(pass);
//		jP_matKhau.add(jt_matkhau);
		jP_matKhau.setLayout(new GridLayout(1,2,10,10));
		
		JPanel jP_thucHien= new JPanel();
		jP_thucHien.add(jb_dangky);
		jP_thucHien.add(jb_dangnhap);
		jP_thucHien.setLayout(new GridLayout(1,2,10,10));
		 
		JPanel jP_troGiup= new JPanel();
		jP_troGiup.add(jl_quenmk);
		jP_troGiup.add(jcheck);
		jP_troGiup.setLayout(new GridLayout(1,2,10,10));
		 
		
		jp_center.setLayout(new  GridLayout(5,1,20,20));
		jp_center.add(jp_dangNhap);
		jp_center.add(jP_email);
		jp_center.add(jP_matKhau);
		jp_center.add(jP_thucHien);
		jp_center.add(jP_troGiup);
		
		Border border_email= BorderFactory.createLineBorder(Color.white);
		jp_center.setBorder(border_email);
		
		
		
		
//		jb_dangky.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				// TODO Auto-generated method stub
//				if(kiemTra(getWarningString(), getName())) {
////					 
//				}else {
//					 
//				}
//
//				
//			}
//		});
		
		
		 
		// chuc nang hien thi mat khau
		jcheck.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				pass.setText("12345");
				if(jcheck.isSelected()) {
					pass.setEchoChar((char)0);
				}else {
					pass.setEchoChar('*');
				}
			}
		});
		
		  
	   
			jp_north.add(jl_dangNhap);
			


		
		this.setLayout(new BorderLayout());
		this.add(jp_center, BorderLayout.CENTER);
		this.add(jp_north, BorderLayout.NORTH);
		this.add(jp_south, BorderLayout.SOUTH);
		this.add(jp_west, BorderLayout.WEST);
		this.add(jp_east, BorderLayout.EAST);

		
		this.setVisible(true);
		
	}
	  
	  
	// dang ky 
	public void dangky() {
		
	 
		 try {
				Connection connection= JDBC.getConnection();
				Statement statement = connection.createStatement();
				 
				// thuc hien dang ky (them data ben sql)
				String insert = "INSERT INTO nguoidung(username,password,time) VALUES "
						+ " ("+"\""+ jt_email.getText() + "\","+"\""+pass.getText() + "\","+"\""+run.countKey.time
						+ "\");";
				
				
				JOptionPane.showMessageDialog(null, "Sign Up Success");
//				String insert = "  UPDATE nguoidung"
//						+ "	   set TIME = TIME + 1/2"
//						+ "	   WHERE username = 'admin';"
//						+ "	   ";
				
//				System.out.println(insert);
				int soDong= statement.executeUpdate(insert);
				if(soDong>0) {
					System.out.println("đăng ký thành công");
				}else {
					System.out.println("that bai");
				}
//				jt_email.setText("");
				pass.setText("");
				JDBC.closeConnection(connection);
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
	 
		 
	}
	
	// dang nhap
	public void dangnhap_sql()  {
		 
			Connection connection  = JDBC.getConnection();
			try {
				Statement statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String tk = jt_email.getText();
			String mk = new String(pass.getPassword());
			try {
				String sql = "     SELECT * FROM nguoidung WHERE username = ? AND PASSWORD= ? ;"; 
				PreparedStatement pst =   connection.prepareCall(sql);
				pst.setString(1, tk);
				pst.setString(2, mk);
				ResultSet rs = pst.executeQuery();
				if(rs.next()) {
					JOptionPane.showMessageDialog(null, "correct login");
					System.out.println("đăng nhập thành công");
					 
					  JFrame  frame = new JFrame("leo nui cuoi ky");
				        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				        frame.setResizable(false);
				        frame.setTitle("demo game 2d cuoi ky java");
				        
				        Run run = new Run();	
				        frame.add(run); 
				        frame.pack();
				        
				        frame.setLocationRelativeTo(null);
				        frame.setVisible(true);
				        run.setupGame();
				        run.startGame();
					    dispose();
					
				}else {
					JOptionPane.showMessageDialog(null, "Login failed !");
//					jt_email.setText("");
					pass.setText("");
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		 
		 
	}
	 
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== jb_dangky) {
			dangky();
		}
		if(e.getSource()==jb_dangnhap) {
			dangnhap_sql();
		}
	}
	
	

    
	 
//	private boolean kiemTra(  String e, String p) {
//	String email = jt_email.getText();
//	String mk= new String(pass.getPassword());
//	StringBuilder inf= new StringBuilder();
//	
//	if(email.equals("")) {
//		inf.append("Trống email");
//	}
//	if(mk.equals("")) {
//		inf.append("\nTrống password");
//	}
//	 
//	
//	 
//	return rootPaneCheckingEnabled;
//
//	
//	}


	public static void main(String[] args) {
		new MatKhau();
		}
}	
	
