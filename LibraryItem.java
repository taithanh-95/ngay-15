package ngay15;

public class LibraryItem {
	protected String title;
	protected int yearPublish;
	public LibraryItem() {
		
	}
	public LibraryItem(String title, int yearPublish) {
		this.title=title;
		this.yearPublish=yearPublish;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	public int getYearPublish() {
		return yearPublish;
	}
	public void setYearPublish(int yearPublish) {
		this.yearPublish=yearPublish;
	}
	public String toString() {
		return "Library=[title: " + title + ", yearPublish: " + yearPublish +"]";
	}
	static class Book extends LibraryItem {
		public Book(){
			super();
			
		}
		private String author;
		private int isbn;
		public Book(String author, int isbn) {
			this.author=author;
			this.isbn=isbn;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author=author;
		}
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn=isbn;
		}
		public String getDetails() {
			return "Book=[author:" + author + ", isbn: " + isbn + "]";
		}
	}
	static class Magazine extends LibraryItem {
		Magazine(){
			super();
		}
		private int issueNumber;
		private String publisher;
		public Magazine(int issueNumber, String publisher) {
			this.issueNumber=issueNumber;
			this.publisher=publisher;
		}
		public int getIssueNumber() {
			return issueNumber;
		}
		public void setIssueNumber(int issueNumber) {
			this.issueNumber=issueNumber;
		}
		public String getPublisher() {
			return publisher;
		}
		public void setPublisher(String publisher) {
			this.publisher=publisher;
		}
		public String getDetails() {
			return "Magazine=[issueNumber: " + issueNumber + ", publisher: " + publisher + "]";
		}
	}
}
