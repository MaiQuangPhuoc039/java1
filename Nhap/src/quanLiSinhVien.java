import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import javax.swing.JCheckBoxMenuItem;
import java.awt.ScrollPane;
import javax.swing.JPasswordField;
import javax.swing.JTree;
import javax.swing.JList;

public class quanLiSinhVien extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTable table;
	private JTextField textField;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					quanLiSinhVien frame = new quanLiSinhVien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public quanLiSinhVien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1020, 724);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		mnNewMenu.setFont(new Font("Segoe UI", Font.PLAIN, 17));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("save");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JSeparator separator_3 = new JSeparator();
		mnNewMenu.add(separator_3);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
		mnNewMenu.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jl_queQuan = new JLabel("Que Quan");
		jl_queQuan.setFont(new Font("Tahoma", Font.PLAIN, 20));
		jl_queQuan.setBounds(62, 42, 152, 68);
		contentPane.add(jl_queQuan);
		
		JLabel lblMaSinhVien = new JLabel("Ma Sinh Vien");
		lblMaSinhVien.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaSinhVien.setBounds(430, 78, 152, 46);
		contentPane.add(lblMaSinhVien);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(564, 78, 142, 48);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(169, 42, 110, 68);
		contentPane.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(62, 150, 867, 2);
		contentPane.add(separator);
		
		table = new JTable();
		table.setBounds(62, 401, 821, -187);
//		contentPane.add(table);
//		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 2, 2);
		contentPane.add(scrollPane);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(62, 451, 867, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(62, 611, 867, 2);
		contentPane.add(separator_2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(78, 642, 110, 35);
		contentPane.add(btnNewButton);
		
		JButton btnTimKiem = new JButton("Tim Kiem");
		btnTimKiem.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTimKiem.setBounds(800, 62, 129, 48);
		contentPane.add(btnTimKiem);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(275, 642, 110, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(467, 642, 110, 35);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(696, 642, 110, 35);
		contentPane.add(btnNewButton_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(196, 473, 142, 48);
		contentPane.add(textField);
		
		JLabel lblMaSinhVien_1 = new JLabel("Ma Sinh Vien");
		lblMaSinhVien_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaSinhVien_1.setBounds(62, 473, 152, 46);
		contentPane.add(lblMaSinhVien_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(196, 536, 142, 48);
		contentPane.add(textField_2);
		
		JLabel lblMaSinhVien_2 = new JLabel("Ma Sinh Vien");
		lblMaSinhVien_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblMaSinhVien_2.setBounds(62, 536, 152, 46);
		contentPane.add(lblMaSinhVien_2);
		
		JLabel lblGioiTinh = new JLabel("Gioi Tinh");
		lblGioiTinh.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGioiTinh.setBounds(399, 473, 152, 46);
		contentPane.add(lblGioiTinh);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("nu");
		rdbtnNewRadioButton.setBounds(516, 486, 103, 21);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("nam");
		rdbtnNewRadioButton_1.setBounds(623, 486, 103, 21);
		contentPane.add(rdbtnNewRadioButton_1);
		
		Panel panel = new Panel();
		panel.setBounds(46, 32, 923, 107);
		contentPane.add(panel);
		
		JCheckBoxMenuItem chckbxmntmNewCheckItem = new JCheckBoxMenuItem("New check item");
		chckbxmntmNewCheckItem.setBounds(46, 184, 133, 24);
		contentPane.add(chckbxmntmNewCheckItem);
		
		ScrollPane scrollPane_1 = new ScrollPane();
		scrollPane_1.setBounds(285, 184, 100, 100);
		contentPane.add(scrollPane_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(486, 203, 240, 21);
		contentPane.add(passwordField);
		
		JTree tree = new JTree();
		tree.setBounds(46, 218, 84, 173);
		contentPane.add(tree);
		String[] soNguoi= new String[] {"1", "2", "3"};
		JList list = new JList(soNguoi);
		list.setBounds(467, 350, 41, -72);
		contentPane.add(list);
	}
}
