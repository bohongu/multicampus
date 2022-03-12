package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedInsertTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
		
	
		//명령행 매개변수 - 이자바 java@b.com 01022246788 법학 us 
		String insertsql = "insert into students values (null, ?, ?, ?, ?, default, ?)";
		
		PreparedStatement pt = conn.prepareStatement(insertsql);//d전송 구문분석 컴파일 - 저장
		//sql 입력파라미터값 설정
		for(int i = 0; i<5; i++) {
			pt.setString(i+1, args[i]);
		}
		
		int rows = pt.executeUpdate();
		System.out.println(rows + " 개의 행 삽입 완료");
		
		pt.close();
		conn.close();
		
		
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
			
		} catch (SQLException e) {
			System.out.println("db접속오류이거나 sql문장오류");
			e.printStackTrace();
			
		}
	}

}
