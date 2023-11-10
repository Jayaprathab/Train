import java.sql.*;

public class Trainget {
	public static void main(String[]args) throws Exception {
		get();
		}
		public static void get() throws Exception {
			String url="jdbc:mysql://127.0.0.1:3306/train";
			String username="root";
			String password="0525";
			String Query="select * from booking"; //where id=101
			Connection con=DriverManager.getConnection(url, username, password);
			Statement st =con.createStatement();
			ResultSet rs=st.executeQuery(Query);
			while(rs.next()) {
				System.out.println("id is:"+rs.getInt(1));
				System.out.println("name is:"+rs.getString(2));
				System.out.println("fromadd is:"+rs.getString(3));
				System.out.println("toadd is:"+rs.getString(4));
				System.out.println("phoneno is:"+rs.getLong(5));
				System.out.println("mail is:"+rs.getString(6));
				}
			con.close();
			}

}
