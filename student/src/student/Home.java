package student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Home extends JFrame {

	private JPanel contentPane;
	private JTextField Txtname;
	private JTextField TxtId;

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
		});
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
		
		JLabel label = new JLabel("");
		label.setBounds(27, 22, 46, 14);
		contentPane.add(label);
		
		JLabel lblStudentManagement = new JLabel("Student Management");
		lblStudentManagement.setBounds(99, 0, 141, 74);
		contentPane.add(lblStudentManagement);
		
		JLabel lblEnterYourName = new JLabel("Enter Your Name:");
		lblEnterYourName.setBounds(27, 110, 117, 14);
		contentPane.add(lblEnterYourName);
		
		Txtname = new JTextField();
		Txtname.setBounds(154, 107, 86, 20);
		contentPane.add(Txtname);
		Txtname.setColumns(10);
		
		JLabel lblEnterYourId = new JLabel("Enter Your Id:");
		lblEnterYourId.setBounds(27, 149, 117, 14);
		contentPane.add(lblEnterYourId);
		
		TxtId = new JTextField();
		TxtId.setBounds(154, 146, 86, 20);
		contentPane.add(TxtId);
		TxtId.setColumns(10);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(83, 191, 89, 23);
		contentPane.add(btnNewButton);
	}
}
