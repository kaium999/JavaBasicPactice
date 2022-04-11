package studentManagement;

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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtId;
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/movie";
	static final String USER = "root";
	static final String PASSWORD = "1234";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		
		
	}
	}
	

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStudentManagement = new JLabel("Student Management");
		lblStudentManagement.setBounds(151, 11, 131, 36);
		contentPane.add(lblStudentManagement);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name:");
		lblEnterYourName.setBounds(38, 77, 120, 36);
		contentPane.add(lblEnterYourName);
		
		txtName = new JTextField();
		txtName.setBounds(179, 85, 86, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		JLabel lblEnterYourId = new JLabel("Enter Your Id:");
		lblEnterYourId.setBounds(48, 118, 110, 20);
		contentPane.add(lblEnterYourId);
		
		txtId = new JTextField();
		txtId.setBounds(179, 128, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
		btnNewButton.setBounds(103, 190, 89, 23);
		contentPane.add(btnNewButton);
	}
		}
	}
}


