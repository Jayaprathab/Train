import java.sql.*;

public class Trainupdate {
	public static void main(String[]args) throws Exception {
		update();
		}
		public static void update() throws Exception {
			String url="jdbc:mysql://127.0.0.1:3306/train";
			String username="root";
			String password="0525";
			String Query="update booking set name='jayaprathab' where id=101";
			Connection con=DriverManager.getConnection(url, username, password);
			PreparedStatement pst=con.prepareStatement(Query);
			pst.executeUpdate();

			con.close();
			}

}
