package UI;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

	public LoginForm() {
		initComponents();
		setLocationRelativeTo(null);
	}

	@SuppressWarnings("unchecked")

	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		txtTenDangNhap = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		txtPassword = new javax.swing.JPasswordField();
		btnDangNhap = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabel1.setText("Đăng Nhập");

		jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel2.setText("Tên đăng nhập:");

		jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jLabel3.setText("Mật khẩu:");

		btnDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		btnDangNhap.setText("ĐĂNG NHẬP");
		btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					btnDangNhapActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGap(132, 132, 132).addComponent(jLabel1).addGap(0,
								0, Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jSeparator1)
								.addGroup(layout.createSequentialGroup().addGap(6, 6, 6)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(btnDangNhap)
												.addGroup(layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtTenDangNhap).addComponent(txtPassword,
																javax.swing.GroupLayout.DEFAULT_SIZE, 204,
																Short.MAX_VALUE)))
										.addGap(0, 35, Short.MAX_VALUE)))))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(15, 15, 15).addComponent(jLabel1)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel2)
						.addComponent(txtTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(jLabel3)
						.addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18).addComponent(btnDangNhap).addContainerGap(122, Short.MAX_VALUE)));

		pack();
	}
	private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
		String username = txtTenDangNhap.getText();
		String password = new String(txtPassword.getPassword());
		StringBuilder sb = new StringBuilder();

		if (username.equals("")) {
			sb.append("Tên đăng nhập không được để trống!\n");
		}
		if (password.equals("")) {
			sb.append("Mật khẩu không được để trống!\n");
		}
		if (sb.length() > 0) {
			JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo lỗi", JOptionPane.ERROR_MESSAGE);
			return;
		}

		if (username.equals("admin") && password.equals("123456")) {
			JOptionPane.showMessageDialog(this, "Đăng nhập thành công!");

			// tao doi tuong va hien thi
			QuanLy quanLyForm = new QuanLy();
			quanLyForm.setVisible(true);

			// dong cua so LoginForm
			this.dispose();
		} else {
			JOptionPane.showMessageDialog(this, "Tên đăng nhập hoặc mật khẩu sai, vui lòng nhập lại!", "Thất bại!",
					JOptionPane.ERROR_MESSAGE);
		}
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginForm().setVisible(true);
			}
		});
	}

	private javax.swing.JButton btnDangNhap;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JPasswordField txtPassword;
	private javax.swing.JTextField txtTenDangNhap;

}
