import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Movies {
		
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/movie";
	static final String USER = "root";
	static final String PASSWORD = "1234";

	public static void main(String[] args) {
		
		
		
		// Connect to database

		Connection conn = null;
		Statement stmt = null;

		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting..");
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);

		} catch (SQLException e) {
			System.out.print("NullPointerException Caught");
		} catch (ClassNotFoundException e) {
			System.out.print("ClassNotFoundException Caught");
		}

		System.out.println("Connected");

		create(conn, stmt);
		read(conn,stmt);
		//update(conn,stmt);
		//read(conn,stmt);
		//delete(conn,stmt);

	}

	public static void create(Connection vConn, Statement vStmt) {

		System.out.println("Inserting Records into the table");

		try {
			vStmt = vConn.createStatement();
		} catch (SQLException e) {
			System.out.println("Opps");
		}
		String sql = "INSERT INTO movie_details " + "VALUES (1011,'kaium','2019','9.5')";
		try {
			vStmt.executeUpdate(sql);
		} catch (SQLException e) {
			System.out.println("No Table");
		}
		System.out.println("Inserted");

	}
	
	public static void read(Connection vConn, Statement vStmt) {
		System.out.println("Reading");
		try {
			vStmt = vConn.createStatement();
		} catch (SQLException e) {
			System.out.println("No Longer Exists");
			e.printStackTrace();
		}
		String sql2 = "select *from movie_details";
		ResultSet rs = null;
		try {
			rs = vStmt.executeQuery(sql2);
		} catch (SQLException e) {

		}
		try {
			
			while (rs.next()) {
				int id = rs.getInt("Id");
				String Movie_name = rs.getString("Movie_name");
				String Movie_year = rs.getString("Movie_year");
				String Movie_rating=rs.getString("Movie_rating");
				System.out.println("ID: "+ id + ",Movie_Name: " + Movie_name + ", Movie_Year: "+ Movie_year+",Movie_rating:"+Movie_rating);
				//if(rs==null) {
				//	System.out.println("No Longer Exists");
				//}
			}
			
		} catch (SQLException e) {


		}
		try {
			rs.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	/*public static void update(Connection vConn, Statement vStmt) {
		
		System.out.println("Update");
		try {
			vStmt = vConn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String sql3 = "update users "+"set gender = 'M' where id=10";
		try {
			vStmt.executeUpdate(sql3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}*/
	
	/*public static void delete(Connection vConn, Statement vStmt) {
		System.out.println("Delete");
		try {
			vStmt = vConn.createStatement();
		} catch (SQLException e1) {
			System.out.println("Delete Connection Failed");
			e1.printStackTrace();
		}
		String sql4= "DELETE From users "+ "Where id = 1011";
		try {
			vStmt.executeUpdate(sql4);
		} catch (SQLException e) {
			System.out.println("Not Deleted");
		}

			
			//read(vConn,vStmt);
			

	}*/
		

	}


