package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn =
		DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
		System.out.println("mysql db 연결 성공");
		
		
		String selectSQL = "select * from emp_copy";
		String countSQL = "select count(*) from emp_copy";
		
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(selectSQL);
		int cnt = 0;
		//next() -> true/false
		while(rs.next()) {
			cnt++;
			int id = rs.getInt("employee_id");
			String name = rs.getString("first_name");
			double salary = rs.getDouble("salary");
			Date date = rs.getDate("hire_date");
			System.out.println(id + "\t" + name + "\t" + salary + "\t" + date);
		}
		System.out.println("조회 완료 : 총 " + cnt + "명 조회");
		
		ResultSet rs2 = st.executeQuery(countSQL);
		
		int count = 0;
		//1행만 존재(while x), next() -> 1행 이동
		rs2.next();
		count = rs2.getInt(1);// 별칭 지정시 getInt(별칭);
		System.out.println(count + "명");
		
		rs.close();
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
