if (e.getSource() == bt1) {

			try {
				Connection con = DBConnect.getConnection();

				Statement st = con.createStatement();

				String sql = "insert into sinhvien (id, hoten, lop, ngaysinh, diachi, email, idDeTai, gvHuongDan, idGvHuongDan) values "
						+ "(" + "\"" + jtf1.getText() + "\"," + "\"" + jtf2.getText() + "\"," + "\"" + jtf3.getText()
						+ "\"," + "\"" + jtf4.getText() + "\"," + "\"" + jtf5.getText() + "\"," + "\"" + jtf6.getText()
						+ "\"," + "\"" + jtf7.getText() + "\"," + "\"" + jtf8.getText() + "\"," + "\"" + jtf9.getText()
						+ "\")";

				System.out.println(sql);
				int rs = st.executeUpdate(sql);

				DBConnect.closeConnection(con);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			model.addRow(new String[] { (String) jtf1.getText(), (String) jtf2.getText(), (String) jtf3.getText(),
					(String) jtf4.getText(), (String) jtf5.getText(), (String) jtf6.getText(), (String) jtf7.getText(),
					(String) jtf8.getText(), (String) jtf9.getText() });

		}