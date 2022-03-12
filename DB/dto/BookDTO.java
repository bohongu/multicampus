package dto;

public class BookDTO {

	private String bookno, booktitle, bookauthor,bookpublisher;
	private int bookyear, bookprice;

	
	
	public BookDTO(String bookno, String booktitle, String bookauthor, int bookyear,
			int bookprice, String bookpublisher) {
		this.bookno = bookno;
		this.booktitle = booktitle;
		this.bookauthor = bookauthor;
		this.bookyear = bookyear;
		this.bookprice = bookprice;
		this.bookpublisher = bookpublisher;
	}
	
	public String getBookno() {
		return bookno;
	}
	public void setBookno(String bookno) {
		this.bookno = bookno;
	}
	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public String getBookpublisher() {
		return bookpublisher;
	}
	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}
	public int getBookyear() {
		return bookyear;
	}
	public void setBookyear(int bookyear) {
		this.bookyear = bookyear;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	
}
