package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Page extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtId;
	static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/student_management";
	static final String USER = "root";
	static final String PASSWORD = "1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Page frame = new Page();
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
	public Page() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentManagement = new JLabel("Student Management");
		lblStudentManagement.setBounds(154, 11, 167, 41);
		contentPane.add(lblStudentManagement);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name:");
		lblEnterYourName.setBounds(31, 68, 109, 14);
		contentPane.add(lblEnterYourName);
		
		txtName = new JTextField();
		txtName.setBounds(164, 65, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblEnterYourId = new JLabel("Enter Your Id:");
		lblEnterYourId.setBounds(34, 117, 106, 14);
		contentPane.add(lblEnterYourId);
		
		txtId = new JTextField();
		txtId.setBounds(154, 114, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name=txtName.getText();
				String Id=txtId.getText();
				Connection conn = null;
				Statement stmt = null;
				try {
					Class.forName(JDBC_DRIVER);
				}catch(ClassNotFoundException e) {
					e.printStackTrace();
				}
				try {
					conn=DriverManager.getConnection(DB_URL,USER,PASSWORD);
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
				try {
					stmt=conn.createStatement();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				String sql="insert into studentinfo values('"+name+"','"+Id+"')";
				try {
					stmt.executeUpdate(sql);
					
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(119, 193, 89, 23);
		contentPane.add(btnNewButton);
	}

}
