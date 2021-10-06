/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectDB;

/**
 *
 * @author ADMIN
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	String className = "com.mysql.cj.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/bangatm?useUnicode=true&characterEncoding=UTF-8";
	String user = "root";
	String pass ="";
	String table = "user";
	Connection conn;
//	roi do ban
        // cam on ban nhe ok ko co gi
	public Connection getConnection() {
		try {
			Class.forName(className);
			try {
				conn = DriverManager.getConnection(url,user,pass);
				System.out.println("Kết nối thành công");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
		
	}
//	public static void main(String[] args) {
//		ConnectDB cDb = new ConnectDB();
//		cDb.getConnection();
//	}
	
}