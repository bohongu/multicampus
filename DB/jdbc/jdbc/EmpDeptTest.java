package jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

class Employee{
	int employee_id;
	String first_name;
	double salary;
	String hire_date; 
	
	Employee(){
		
	}
	
	Employee(int employee_id, String first_name, double salary, String hire_date){
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
		this.hire_date = hire_date;
	}
	
	public String toString() {
		return employee_id + "\t" + first_name + "\t" + salary + "\t" + hire_date;
	}
}
	//String d = rs.getString("hire-date");
	//생성자 추가 , toString() 추가 , setter/getter 메소드




public class EmpDeptTest {

	public static void main(String[] args) {
		try {
			ArrayList<Employee> list = new ArrayList();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
			
			String selectSQL = "select employee_id, first_name, salary, hire_date from employees where hire_date like '_____06%'";
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(selectSQL);
			
			int id = 0;
			String name = null;
			int salary = 0;
			Date date = null;
			
			while(rs.next()) {
				id = rs.getInt(1);
				name = rs.getString(2);
				salary = rs.getInt(3);
				date = rs.getDate(4);
				Employee ep = new Employee(id, name, salary, date.toString());
				list.add(ep);
			}
			for(Employee e : list) {
				System.out.println(e);
			}
//			
//			ArrayList<Employee> selectEmp(String month){}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();		
		}	
	}//main

}//EmpDeptTest end

/*  employees 테이블에서 6월 입사자의 사번, 이름, 급여, 입사일을 조회하여
* Employee 객체로 생성한 후에 ArrayList로 저장하고 출력하는 자바 프로그램을 구현하시오. */

	
