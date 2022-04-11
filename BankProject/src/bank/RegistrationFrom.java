package bank;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import student.LogIn_From;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class RegistrationFrom extends JFrame {

	private JPanel contentPane;
	private JTextField FirstName;
	private JTextField LastName;
	private JTextField FatherName;
	private JTextField MotherName;
	private JTextField Occupation;
	private JTextField MobileNumber;
	private JTextField UserName;
	private JTextField AccuntNumber;
	private JTextField UserPassword;
	static final String JDBC_DRIVER ="com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bank";
	static final String USER = "root";
	static final String PASSWORD = "1234";
	Connection conn=null;
	Statement smt=null;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationFrom frame = new RegistrationFrom();
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
	public RegistrationFrom() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIffBank = new JLabel("IFF Bank");
		lblIffBank.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIffBank.setBackground(Color.DARK_GRAY);
		lblIffBank.setBounds(153, 24, 120, 39);
		contentPane.add(lblIffBank);
		
		JLabel lblRegistrationFrom = new JLabel("Registration From");
		lblRegistrationFrom.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRegistrationFrom.setBounds(142, 60, 225, 22);
		contentPane.add(lblRegistrationFrom);
		
		JLabel lblEnterYourFirst = new JLabel("Enter Your First Name:");
		lblEnterYourFirst.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourFirst.setBounds(10, 119, 172, 27);
		contentPane.add(lblEnterYourFirst);
		
		FirstName = new JTextField();
		FirstName.setBounds(180, 124, 140, 20);
		contentPane.add(FirstName);
		FirstName.setColumns(10);
		
		JLabel lblEnterYourLast = new JLabel("Enter Your Last Name:");
		lblEnterYourLast.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourLast.setBounds(10, 167, 172, 22);
		contentPane.add(lblEnterYourLast);
		
		LastName = new JTextField();
		LastName.setBounds(180, 170, 140, 20);
		contentPane.add(LastName);
		LastName.setColumns(10);
		
		JLabel lblEnterYourFather = new JLabel("Enter Your Father Name:");
		lblEnterYourFather.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourFather.setBounds(10, 211, 172, 22);
		contentPane.add(lblEnterYourFather);
		
		FatherName = new JTextField();
		FatherName.setBounds(180, 214, 140, 20);
		contentPane.add(FatherName);
		FatherName.setColumns(10);
		
		JLabel lblEnterYourMother = new JLabel("Enter Your Mother Name:");
		lblEnterYourMother.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourMother.setBounds(10, 244, 172, 27);
		contentPane.add(lblEnterYourMother);
		
		MotherName = new JTextField();
		MotherName.setBounds(187, 249, 133, 20);
		contentPane.add(MotherName);
		MotherName.setColumns(10);
		
		JLabel lblEnterYourOccupation = new JLabel("Enter Your  Occupation:");
		lblEnterYourOccupation.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourOccupation.setBounds(10, 296, 172, 22);
		contentPane.add(lblEnterYourOccupation);
		
		Occupation = new JTextField();
		Occupation.setBounds(187, 299, 133, 20);
		contentPane.add(Occupation);
		Occupation.setColumns(10);
		
		JLabel lblEnterYourMobile = new JLabel("Enter Your Mobile Number:");
		lblEnterYourMobile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourMobile.setBounds(10, 341, 172, 22);
		contentPane.add(lblEnterYourMobile);
		
		MobileNumber = new JTextField();
		MobileNumber.setBounds(187, 344, 133, 20);
		contentPane.add(MobileNumber);
		MobileNumber.setColumns(10);
		
		JLabel lblEnterYourUser = new JLabel("Enter Your User Name:");
		lblEnterYourUser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourUser.setBounds(10, 392, 160, 27);
		contentPane.add(lblEnterYourUser);
		
		UserName = new JTextField();
		UserName.setBounds(187, 397, 133, 20);
		contentPane.add(UserName);
		UserName.setColumns(10);
		
		JLabel AccountNumber = new JLabel("Enter Your Account Number:");
		AccountNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
		AccountNumber.setBounds(10, 430, 225, 22);
		contentPane.add(AccountNumber);
		
		AccuntNumber = new JTextField();
		AccuntNumber.setBounds(197, 433, 123, 20);
		contentPane.add(AccuntNumber);
		AccuntNumber.setColumns(10);
		
		JLabel lblEnterYourPassword = new JLabel("Enter Your Password:");
		lblEnterYourPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterYourPassword.setBounds(10, 463, 172, 25);
		contentPane.add(lblEnterYourPassword);
		
		UserPassword = new JTextField();
		UserPassword.setBounds(180, 464, 140, 20);
		contentPane.add(UserPassword);
		UserPassword.setColumns(10);
		JLabel Confirmlbl = new JLabel("");
		Confirmlbl.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Confirmlbl.setBounds(291, 80, 133, 27);
		contentPane.add(Confirmlbl);
		
		JButton btnNewButton = new JButton("Save ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String firstName=FirstName.getText();
				String lastName=LastName.getText();
				String fatherName=FatherName.getText();
				String motherName=MotherName.getText();
				String ocuupation=Occupation.getText();
				int mobileNumber=Integer.parseInt(MobileNumber.getText());
				
				String username=UserName.getText();
				int accountNumber=Integer.parseInt(AccuntNumber.getText());
				String password=UserPassword.getText();
				UserRegistration userregistration=new UserRegistration(firstName,lastName,fatherName,motherName,ocuupation,mobileNumber,username,accountNumber,password);
				userregistration.InsertData(JDBC_DRIVER, DB_URL, conn, smt, USER, PASSWORD);
				Confirmlbl.setText("Succfully registration");
				
			}
		});
		btnNewButton.setBounds(210, 491, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnLogIn.setBounds(309, 491, 89, 23);
		contentPane.add(btnLogIn);
	}
}
