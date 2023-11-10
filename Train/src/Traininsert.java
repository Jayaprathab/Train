import java.sql.*;

public class Traininsert {
	public static void main(String[]args) throws Exception {
		insert();
	}
	public static void insert() throws Exception {
		String url="jdbc:mysql://127.0.0.1:3306/train";
		String username="root";
		String password="0525";
		String Query="insert into booking values(?,?,?,?,?,?)";
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, 101);
		pst.setString(2, "kumar");
		pst.setString(3,"chennai");
		pst.setString(4, "pondy");
		pst.setLong(5, 9360294895l);
		pst.setString(6, "kumar25@gmail.com");
		
		pst.executeUpdate();
		con.close();
		}

}
