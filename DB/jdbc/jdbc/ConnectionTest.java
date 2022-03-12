package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		try {
		//mysql db용 jdbc driver 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		//db 연결
		Connection conn =
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
		System.out.println("mysql db 연결 성공");
		
		
		//db 연결 해제
		
		conn.close();
		System.out.println("mysql db 연결 해제");
		
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
			
		} catch (SQLException e) {
			System.out.println("db접속오류");
			
		}

	}

}
