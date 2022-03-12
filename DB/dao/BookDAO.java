package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dto.BookDTO;


public class BookDAO {
	public void insertBook(BookDTO bookDTO) {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb","emp","emp");		
			String insertsql = "insert into book values (?, ?, ?, ?, ?, ?)";
			
			PreparedStatement pt = conn.prepareStatement(insertsql);
			pt.setString(1, bookDTO.getBookno());
			pt.setString(2, bookDTO.getBooktitle());
			pt.setString(3, bookDTO.getBookauthor());
			pt.setInt(4, bookDTO.getBookyear());
			pt.setInt(5, bookDTO.getBookprice());
			pt.setString(6, bookDTO.getBookpublisher());
			
			pt.executeUpdate();
			pt.close();
							
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			} finally {
				try {
				conn.close();
				} catch (SQLException e) {}
			}	
		}
	
	public void selectBook() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/bookdb","emp","emp");		
			String selectBook = "select * from book";
			
			PreparedStatement pt = conn.prepareStatement(selectBook);
			
			ResultSet rs = pt.executeQuery();
			
			while(rs.next()) {
				String bookno = rs.getString(1);
				String booktitle = rs.getString(2);
				String bookauthor = rs.getString(3);
				int bookyear = rs.getInt(4);
				int bookprice = rs.getInt(5);
				String bookpublisher = rs.getString(6);
				System.out.println(bookno + "\t" + booktitle + "\t" + bookauthor + "\t" + bookyear + "\t" + bookprice + "\t" + bookpublisher);
			}
			
			rs.close();
			pt.close();
			
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				
			} catch (SQLException e) {
				e.printStackTrace();
				
			} finally {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
	}
