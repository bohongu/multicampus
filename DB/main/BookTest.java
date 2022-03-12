package main;

import dao.BookDAO;
import dto.BookDTO;

public class BookTest {

	public static void main(String[] args) {
		BookDTO bookDTO = new BookDTO("B004", "자바스크립트", "강길동", 2020, 28000, "서울출판사");
		BookDAO bookDAO = new BookDAO();
		bookDAO.insertBook(bookDTO);
		bookDAO.selectBook();
	}

}
