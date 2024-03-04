package javapractice;

public class Aggregation3 {

	public static void main(String[] args) {
		Book book = new Book("Abdul kalam", "Wings of fire");
		Bag bag = new Bag("fantasy", "7 litres", book);
		bag.display();
	}

}

class Book {
	private String author;
	private String bookName;

	public Book(String author, String bookName) {
		this.author = author;
		this.bookName = bookName;
	}

	String getAuthor() {
		return author;
	}

	String getBookName() {
		return bookName;
	}

}

class Bag {
	private String bagName;
	private String bagQuantity;
	private Book book;

	public Bag(String bagName, String bagQuantity, Book book) {
		this.bagName = bagName;
		this.bagQuantity = bagQuantity;
		this.book = book;
	}

	void display() {
		System.out.println(bagName);
		System.out.println(bagQuantity);
		System.out.println(book.getBookName());
		System.out.println(book.getAuthor());
	}

}