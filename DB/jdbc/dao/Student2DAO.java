package dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.Student2DTO;

//students2 테이블 CRUD 구현
public class Student2DAO {
	
	public int insertStudent2(Student2DTO dto) {
		Connection conn = null;
		int rows = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");		
			String insertsql = "insert into students2 values (null, ?, ?, ?, ?, default, ?)";
			
			PreparedStatement pt = conn.prepareStatement(insertsql);
			pt.setString(1, dto.getName());
			pt.setString(2, dto.getEmail());
			pt.setString(3, dto.getPhone());
			pt.setString(4, dto.getMajor());
			pt.setDouble(5, dto.getScore());
			
			rows = pt.executeUpdate();
			System.out.println(rows + " 개의 행 삽입 완료");
			
				
			
			} catch (ClassNotFoundException e) {
				System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
				
			} catch (SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
				
			} finally {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		return rows;
		}
	
	public	Student2DTO[] selectStudent2() {
		Connection conn = null;
		Student2DTO[] ar = new Student2DTO[10];
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");		
			String selectsql = "select id, name, major from students2";
			
			PreparedStatement pt = conn.prepareStatement(selectsql);
			
			ResultSet rs = pt.executeQuery();
			int index=0;
			while(rs.next()) {
				Student2DTO dto = new Student2DTO(rs.getInt("id"), rs.getString("name"), rs.getString("major"));
				ar[index++] = dto;	
			}
			
			rs.close();
			pt.close();
			
			} catch (ClassNotFoundException e) {
				System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
				
			} catch (SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
				
			} finally {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		return ar;
	}

	public void updateStudent2(String old, String new_word) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");		
			/*String updatesql = "update students2 set major= ?  where major like ? ";
			PreparedStatement pt = conn.prepareStatement(updatesql);
			pt.setString(1, majork);
			pt.setString(2, "%" + major + "%");*/
			
			
			String updatesql = 
					"update students2 set major = insert(major, instr(major, ?), char_length(?), ?) where major like ?";
			PreparedStatement pt = conn.prepareStatement(updatesql);
			pt.setString(1, old);
			pt.setString(2, old);
			pt.setString(3, new_word);
			pt.setString(4, "%" + old + "%");
			
			pt.executeUpdate();
			
			pt.close();
			} catch (ClassNotFoundException e) {
				System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
				
			} catch (SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
				
			} finally {
				try {
				conn.close();
				} catch (SQLException e) {}
		}
	}
	
	public void deleteStudent2(int id) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/employeesdb","emp","emp");
			String deletesql = "delete from students2 where id = ?";
			PreparedStatement pt = conn.prepareStatement(deletesql);
			pt.setInt(1, id);
				
			pt.executeUpdate();
			
			pt.close();
			} catch (ClassNotFoundException e) {
				System.out.println("mysql driver 미설치 or 드라이버 이름 오류");
				
			} catch (SQLException e) {
				System.out.println("db접속오류이거나 sql문장오류");
				e.printStackTrace();
				
			} finally {
				try {
				conn.close();
				} catch (SQLException e) {}
		}
	}
}
		

