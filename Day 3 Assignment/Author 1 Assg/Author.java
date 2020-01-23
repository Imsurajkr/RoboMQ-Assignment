package Assignment3;

public class Author implements Comparable<Author> {
	
	public Author(int authorId, String name, String address) {
		super();
		this.authorId = authorId;
		this.name = name;
		Address = address;
	}

	private  int authorId;
	private String name;
	private String Address;
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public int compareTo(Author a) {
		return this.authorId-a.authorId;
	}
	
	@Override
	public String toString() {
		//return "Author [authorId=" + authorId + ", name=" + name + ", Address=" + Address + "]\n";
		return " Written By "+ name +" Residing At "+ Address + "\n";
	}
}
