package bank;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRegistration {
	private String FirstName;
	private String LastName;
	private String FatherName;
	private String MotherName;
	private String Occupation;
	private int Mobile_number;
	private String UserName;
	private int AccountNumber;
	private String Password;
	public UserRegistration(String firstName, String lastName, String fatherName, String motherName, String occupation,
			int mobile_number, String userName, int accuntNumber, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		FatherName = fatherName;
		MotherName = motherName;
		Occupation = occupation;
		Mobile_number = mobile_number;
		UserName = userName;
		AccountNumber = accuntNumber;
		Password = password;
	}
	//insert Method 
	public void InsertData(String driver,String url,Connection conn,Statement smt,String username,String Password) {
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn=DriverManager.getConnection(url,username,Password);
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			smt=conn.createStatement();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		String sql="insert into registration values('"+getFirstName()+"','"+getLastName()+"','"+getFatherName()+"','"+getMotherName()+"','"+getOccupation()+"','"+getMobile_number()+"','"+getUserName()+"','"+getAccuntNumber()+"','"+getPassword()+"')";
		try {
			smt.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public String getMotherName() {
		return MotherName;
	}
	public void setMotherName(String motherName) {
		MotherName = motherName;
	}
	public String getOccupation() {
		return Occupation;
	}
	public void setOccupation(String occupation) {
		Occupation = occupation;
	}
	public int getMobile_number() {
		return Mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		Mobile_number = mobile_number;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public int getAccuntNumber() {
		return AccuntNumber;
	}
	public void setAccuntNumber(int accuntNumber) {
		AccuntNumber = accuntNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}


	
	

}
