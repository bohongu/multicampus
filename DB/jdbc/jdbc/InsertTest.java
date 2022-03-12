package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {

	public static void main(String[] args) {
		try {
		//mysql db용 jdbc driver 로드
		Class.forName("com.mysql.cj.jdbc.Driver");
		//db 연결
		Connection conn =
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
		System.out.println("mysql db 연결 성공");
	
		//emp_copy 테이블 레코드 저장
		//employee_id : 자동증가 first_name, salary, hire_date:current_date
		
		//String insertSQL = "insert into emp_copy (select employee_id, first_name, salary, hire_date from employees)";
		//String insertSQL = "insert into emp_copy values (1,'이름',10000, current_date)";

		//명령행 매개변수 이용
		
		String insertSQL = "insert into emp_copy values (null, '" + args[0] + "', " + args[1] + ", current_date)";
		//sql 저장 - 전송 - 실행결과 저장
		Statement st = conn.createStatement();  //sql저장해놨다가 전송해주고 실행결과를 가져온다

		int insertROW = st.executeUpdate(insertSQL); //변화된 행의 갯수가 몇개인지 int 리턴 (insert/update/delete)

		System.out.println(insertROW + " 개의 행 삽입 완료");
		
		//연결 해제
		st.close();
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
