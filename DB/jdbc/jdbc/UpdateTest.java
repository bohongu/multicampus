package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
		System.out.println("mysql db 연결 성공");
		
		//명령행 매개변수 이용 - 이사원 2개 입력 emp_copy 테이블에서 이사원 급여 2배로 변경
		String updateSQL = "update emp_copy set salary = salary * " + args[1] + " where first_name = '" +args[0]+"'";
		
		Statement st = conn.createStatement();
		int insertROW = st.executeUpdate(updateSQL);
		System.out.println(insertROW + " 개의 행 삽입 완료");
		conn.close();
		System.out.println("mysql db 연결 해제");
		
		} catch (ClassNotFoundException e) {
			System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
			
		} catch (SQLException e) {
			System.out.println("db접속오류이거나 sql문장오류");
			e.printStackTrace();
			
		}
	}

}
