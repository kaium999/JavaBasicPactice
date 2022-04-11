package student;
import java.sql.*;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn_From extends JFrame {

	private JPanel contentPane;
	private JTextField UserName;
	private JTextField Password;
	static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bank";
	static final String USER = "root";
	static final String PASSWORD = "1234";
	Connection conn=null;
	Statement smt=null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn_From frame = new LogIn_From();
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
	public LogIn_From() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIffcBank = new JLabel("IFFC Bank");
		lblIffcBank.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIffcBank.setBounds(174, 30, 94, 30);
		contentPane.add(lblIffcBank);
		
		JLabel lblLogIn = new JLabel("Log In");
		lblLogIn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLogIn.setBounds(163, 71, 87, 30);
		contentPane.add(lblLogIn);
		
		JLabel lblEnterYourUser = new JLabel("Enter Your user name:");
		lblEnterYourUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourUser.setBounds(27, 128, 176, 30);
		contentPane.add(lblEnterYourUser);
		
		UserName = new JTextField();
		UserName.setBounds(188, 135, 133, 20);
		contentPane.add(UserName);
		UserName.setColumns(10);
		
		JLabel lblEnterYourPassword = new JLabel("Enter Your Password");
		lblEnterYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourPassword.setBounds(27, 184, 133, 30);
		contentPane.add(lblEnterYourPassword);
		
		Password = new JTextField();
		Password.setBounds(182, 191, 139, 20);
		contentPane.add(Password);
		Password.setColumns(10);
		JLabel loginlbl = new JLabel("");
		loginlbl.setBounds(291, 71, 133, 30);
		contentPane.add(loginlbl);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName(JDBC_DRIVER);
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				try {
					conn=DriverManager.getConnection(DB_URL, USER,PASSWORD);
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
				String sql2="select *from registration where UserName=? and AcountNumber=?";
				try {
					PreparedStatement prst=conn.prepareStatement(sql2);
					prst.setString(1, UserName.getText());
					prst.setString(2, AccountNumber.getText());
					ResultSet rs=prst.executeQuery();
					if(rs.next()) {
						loginlbl.setText("Log In Successful");
					}
					else {
						loginlbl.setText("Worng Username and Password");
					}
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
			
			}
		});
		btnNewButton.setBounds(145, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
