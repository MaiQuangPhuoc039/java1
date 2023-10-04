package DB;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
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

import luong.dangNhap;

public class MatKhau  extends JFrame implements ActionListener{
	
	private flappy_bird game;
	 	
	private JTextField jt_email;
	private JPasswordField pass;
	private flappy_bird fb;
	private JButton jb_dangky;
	private JTextField jt_matkhau;
	private JButton jb_dangnhap;

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
		
		  jb_dangnhap.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					if(kiemTra(getWarningString(), getName())) {
					}
					else {
//						JOptionPane.showMessageDialog(null, "Đăng nhập thất bại !");
					}
					
				}
			});
		  
	         
//		  jb_dangky.addActionListener(new ActionListener() {
//				
//				@Override
//				public void actionPerformed(ActionEvent e) {
//					jt_email.setText("");
//					pass.setText("");
//					
//					
//				}
//			});
			 
		  
		  
//		  jb_dangnhap.addActionListener(new ActionListener() {
//			    @Override
//			    public void actionPerformed(ActionEvent e) {
//			        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
//			            @Override
//			            protected Void doInBackground() throws Exception {
//			                flappy_bird game = new flappy_bird();
//			                game.setVisible(true);
//			                dispose();
//			                return null;
//			            }
//			        };
//			        worker.execute();
//			    }
//			});
			
			jp_north.add(jl_dangNhap);
			


		
		this.setLayout(new BorderLayout());
		this.add(jp_center, BorderLayout.CENTER);
		this.add(jp_north, BorderLayout.NORTH);
		this.add(jp_south, BorderLayout.SOUTH);
		this.add(jp_west, BorderLayout.WEST);
		this.add(jp_east, BorderLayout.EAST);

		
		this.setVisible(true);
		
	}
	 
 
	
	// tao chuc nang dang nhap(full)
	private boolean kiemTra(  String e, String p) {
		String email = jt_email.getText();
		String mk= new String(pass.getPassword());
//		StringBuilder inf= new StringBuilder();
		
		
		if(email.equals("admin") && mk.equals("123")) {
			JOptionPane.showMessageDialog(null, "Đăng nhập thành công !");
			
			
			
			dispose();
			
//			jb_dangnhap.addActionListener(new ActionListener() {
//			    @Override
//			    public void actionPerformed(ActionEvent e) {
//			        SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
//			            @Override
//			            protected Void doInBackground() throws Exception {
//			                flappy_bird game = new flappy_bird();
//			                game.setVisible(true);
//			                dispose();
//			                new flappy_bird();
//			                return null;
//			            }
//			        };
//			        worker.execute();
//			    }
//			});
			
//			flappy_bird game = new flappy_bird();
//			game.setVisible(true);
//			setVisible(false);
//			new flappy_bird().show();
//			jb_dangnhap.addMouseListener(new MouseAdapter() {
//				
//				flappy_bird bird= new flappy_bird();
//				public void mouseClicked(MouseEvent e) {
//					CardLayout cardLayout = new  CardLayout();
//					cardLayout.show(bird, "falppy_birf");
//				}
//			});
			
//			jb_dangnhap.addMouseListener(new MouseAdapter() {
//						@Override
//						public void mouseClicked(MouseEvent e) {
//							CardLayout cl = (CardLayout)panel_1.getLayout();
//							cl.show(panel_1, "p1");
//							
//						}
//					});
			
//		 MatKhau.super.dispose();		 
//			 new flappy_bird();
			 
			 JFrame frame = new JFrame("Flappy Bird");
				flappy_bird game = new flappy_bird();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				game.addKeyListener(game);
				game.setFocusable(true);
				frame.setContentPane(game);
				Thread thread = new Thread(game);
				thread.start();
				frame.setSize(700, 400);
				frame.setLocationRelativeTo(null);
//				frame.pack();
				
				frame.setVisible(true);

			
			
		}else {
			JOptionPane.showMessageDialog(this, "Đăng nhập thất bại !");
		}
		return rootPaneCheckingEnabled;
		
		
		
	}
	
	// dang ky 
	public void dangky() {
		try {
			Connection connection= JDBC.getConnection();
			Statement statement = connection.createStatement();
			 
			// thuc hien dang ky (them data ben sql)
			String insert = "INSERT INTO nguoidung(email,matkhau,diem) VALUES "
					+ " ("+"\""+ jt_email.getText() + "\","+"\""+pass.getText()+ "\"," +"\""+"0" 
					+ "\");";
			
			System.out.println(insert);
			int soDong= statement.executeUpdate(insert);
			if(soDong>0) {
				System.out.println("hoan thanh");
			}else {
				System.out.println("that bai");
			}
			
			JDBC.closeConnection(connection);
			
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
	
	// dang nhap
	public void dangnhap_sql() {
		try {
			Connection connection  = JDBC.getConnection();
			Statement statement = connection.createStatement();
			String sql = "SELECT * FROM nguoidung ";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	

    
	 
	
	
	
	 
	 

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()== jb_dangky) {
			dangky();
		}
	}
	



	public static void main(String[] args) {
		new MatKhau();
		
		   
		
		}
}	
	