package Assignment2;

public class Book {

	private int memId;
	private String name;
	private String author;
	private String publisher;
	private int quantity;
	public Book(int memId, String name, String author, String publisher, int quantity) {
		super();
		this.memId = memId;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
	
	public int getMemId() {
		return memId;
	}
	public void setMemId(int memId) {
		this.memId = memId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public String toString() {
		return "Book [memId=" + memId + ", name=" + name + ", author=" + author + ", publisher=" + publisher
				+ ", quantity=" + quantity + "]";
	}
}
