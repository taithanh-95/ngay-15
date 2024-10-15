package ngay15;

public class Test {
	public static void main(String[] args) {
		LibraryItem l = new LibraryItem("Tai",2000);
		LibraryItem.Book b = new LibraryItem.Book("T", 1999);
		LibraryItem.Magazine m = new LibraryItem.Magazine(999, "CTT");
		System.out.println(l.toString());
		System.out.println(b.getDetails());
		System.out.println(m.getDetails());
		
	}
}
